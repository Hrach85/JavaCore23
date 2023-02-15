package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        employeeStorage.add(new Employee("poxos", "poxosyan", "a011", 100, "company1", "sr, maneger"));
        employeeStorage.add(new Employee("petros", "petrosyan", "a022", 300, "company1", "maneger"));
        employeeStorage.add(new Employee("poxos", "petrosyan", "a033", 500, "company1", "jn, maneger"));
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
                default:
                    System.out.println("Wrong command, please try again ");
            }
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String eemployeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(eemployeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("wrong employee ID, or employee is active, please try again!");
        } else {
            employee.setActive(true);
            System.out.println(" status changet!");
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
            System.out.println(" status changet!");
        }
    }

    private static void chengePostionEmpireeId() {
        employeeStorage.print();
        System.out.println("please choose employee id");
        String eemployeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchEmplyeeID(eemployeeId);
        if (employee == null) {
            System.out.println("wrong employee ID please try again!");
        } else {
            System.out.println("please input new position name");
        }
        String position = scanner.nextLine();
        employee.setPosition(position);
        System.out.println(" position chenget");
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
        System.out.println("Please input 6 for cheng position");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by Id");
        System.out.println("Please input 9 for activate employee by Id");
    }

    private static void extracted(EmployeeStorage employeeStorage, Scanner scanner) {
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
        Employee employee = new Employee(name, surName, emplyeeID, Integer.parseInt(salary), company, position);
        employeeStorage.add(employee);
        System.out.println("emplyee is created ");
    }
}
