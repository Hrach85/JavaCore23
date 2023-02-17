package homework.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        boolean isRun = false;

        while (!isRun) {
            printCommants();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = true;
                    System.out.println("for exit");
                    break;
                case "1":
                    extracted(employeeStorage, scanner);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input search emplyeeID");
                    String searchId = scanner.nextLine();
                    employeeStorage.searchEmplyeeID(searchId);
                    break;
                case "4":
                    System.out.println("Please input, search employee by company name");
                    String searchCompany = scanner.nextLine();
                    employeeStorage.searchEmployeeCompany(searchCompany);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    chengePostionEmpireeId();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inActivateEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                case "10":
                    changeDateBirthday();
                    break;
                default:
                    System.out.println("Wrong command, please try again ");
            }
        }
    }

    private static void changeDateBirthday() throws ParseException {
        employeeStorage.print();
        System.out.println("please choose employee id change date of birthday");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("wrong employee ID, or employee is active, please try again!");
        } else {
            System.out.println("please input new date Of Birthday");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String birthday = scanner.nextLine();
        Date changeBirthday = sdf.parse(birthday);
        employee.setDateOfBirthday(changeBirthday);
        System.out.println("Change date Of birthday");
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee ID");
        String eemployeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(eemployeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("wrong employee ID, or employee is active, please try again!");
        } else {
            employee.setActive(true);
            System.out.println("status change!");
        }
    }

    private static void inActivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String eemployeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(eemployeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("wrong employee ID, or employee is active, please try again!");
        } else {
            employee.setActive(false);
            System.out.println("status change!");
        }
    }

    private static void chengePostionEmpireeId() {
        employeeStorage.print();
        System.out.println("please choose employee ID");
        String eemployeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(eemployeeId);
        if (employee == null) {
            System.out.println("wrong employee ID please try again!");
        } else {
            System.out.println("please input new position name");
        }
        String position = scanner.nextLine();
        employee.setPosition(position);
        System.out.println("position change");
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input min price, max Price");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minPrice = Double.parseDouble(salaryRange[0]);
        double maxPrice = Double.parseDouble(salaryRange[1]);
        if (maxPrice < minPrice) {
            System.out.println("min price should be lass ten max price");
            return;
        }
        employeeStorage.searchBySalaryRange(minPrice, maxPrice);
    }

    private static void printCommants() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee /  տվյալները աշխատակից սարքելու,");
        System.out.println("Please input 2 for print all employee  ");
        System.out.println("Please input 3 for search employee by employee ID");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change position");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by Id");
        System.out.println("Please input 9 for activate employee by Id");
        System.out.println("Please input 10 for change date of birthday");
    }

    private static void extracted(EmployeeStorage employeeStorage, Scanner scanner) throws ParseException {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surName");
        String surName = scanner.nextLine();
        System.out.println("Please input emplyeeID");
        String emplyeeID = scanner.nextLine();
        System.out.println("Please input salary");
        String salary = scanner.nextLine();
        System.out.println("Please input company");
        String company = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date registerDate = new Date();
        System.out.println("Please input date Of Birthday");
        String birthday = scanner.nextLine();
        Date dateOfBirthday = sdf.parse(birthday);
        Employee employee = new Employee(name, surName, emplyeeID, Integer.parseInt(salary), company, position, dateOfBirthday, registerDate);
        employeeStorage.add(employee);
        System.out.println("emplyee is created ");
    }
}
