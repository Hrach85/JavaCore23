package homework.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surName;
    private String emplyeeID;
    private double salary;
    private String company;
    private String position;
    private boolean isActive = true;
    private String dateOfBirthday;
    private String registerDate;

    public Employee() {
    }

    public Employee(String name, String surName, String emplyeeID, double salary, String company, String position, String dateOfBirthday, String registerDate) {
        this.name = name;
        this.surName = surName;
        this.emplyeeID = emplyeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.dateOfBirthday = dateOfBirthday;
        this.registerDate = registerDate;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", isActive=" + isActive +
                ", registerDate='" + registerDate + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (isActive != employee.isActive) return false;
        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(surName, employee.surName)) return false;
        if (!Objects.equals(emplyeeID, employee.emplyeeID)) return false;
        if (!Objects.equals(company, employee.company)) return false;
        if (!Objects.equals(position, employee.position)) return false;
        if (!Objects.equals(dateOfBirthday, employee.dateOfBirthday))
            return false;
        return Objects.equals(registerDate, employee.registerDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (emplyeeID != null ? emplyeeID.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (dateOfBirthday != null ? dateOfBirthday.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        return result;
    }
}