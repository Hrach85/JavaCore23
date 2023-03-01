package medicalCenter;


import medicalCenter.dateUtil.DateUtil;
import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;
import medicalCenter.storage.PersonStorage;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENT:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("wrong command!");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("please chose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorDataById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("please chose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorDataById(doctorId);
        if (doctorById != null) {
            System.out.println("please input id,name,surname,phone,registerDateTime(15-02-2023 14:00) ");
            String patientDataStr = scanner.nextLine();
            String[] patentData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDate(patentData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patentData[0]);
                    patient.setName(patentData[1]);
                    patient.setSurName(patentData[2]);
                    patient.setPhoneNumber(patentData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patent registered! ");
                } else {
                    System.out.println("doctor is unavailable in that time,please chose another!");
                }

            } catch (ParseException e) {
                System.out.println("incorrect date time format, pleas try again!");
            }
        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("please chose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorDataById(doctorId);
        if (doctorById != null) {
            System.out.println("please input name,surname,phone,email");
            String doctorDateStr = scanner.nextLine();
            String[] doctorData = doctorDateStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurName(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(scanProfession());
            System.out.println("doctor change!");
        } else
            System.out.println("doctor with " + doctorId + "does not exits!");
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("please chose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorDataById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else
            System.out.println("doctor with " + doctorId + "does not exits!");
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input profession ");
        Profession[] values = Profession.values();
        for (Profession value : values) {
            System.out.println(value);
        }
        String str = scanner.nextLine();
        try {
            String strProfession = str.toUpperCase();
            personStorage.searchDoctorByProfession(Profession.valueOf(strProfession));
        } catch (IllegalArgumentException e) {
            System.out.println("please chose correct profession");
        }
    }

    private static void addDoctor() {
        System.out.println("please input id,name,surname,phone,email");
        String doctorDateStr = scanner.nextLine();
        String[] doctorData = doctorDateStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorDataById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurName(doctorData[2]);
            doctor.setPhoneNumber(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            doctor.setProfession(scanProfession());
            personStorage.add(doctor);
            System.out.println("doctor added");
        } else
            System.out.println("doctor with " + doctorId + " already exits!");
    }

    private static Profession scanProfession() {
        System.out.println("Please choose a profession ");
        Profession[] values = Profession.values();
        for (Profession value : values) {
            System.out.println(value);
        }
        String str = scanner.nextLine();
        String strProfession = str.toUpperCase();
        try {
            return Profession.valueOf(strProfession);
        } catch (IllegalArgumentException e) {
            System.out.println("please chose correct profession");
        }
        return null;
    }
}

