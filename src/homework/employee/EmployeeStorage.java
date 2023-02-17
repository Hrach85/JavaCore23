package homework.employee;


public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public Employee searchEmplyeeID(String seachId) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().equals(seachId)) {
                return employee;
            }
        }
        return null;
    }

    public void searchEmployeeCompany(String searchCompany) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().equals(searchCompany)) {
                System.out.println(array[i]);
            }
        }
    }

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] bigArray = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            bigArray[i] = array[i];
        }
        array = bigArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + ",");
        }
    }

    public void printByStatus(boolean isactive) {
        for (int i = 0; i < size; i++) {
            if (array[i].isActive() == isactive) {
                System.out.println(array[i] + ",");
            }
        }
    }

    public void searchBySalaryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getSalary() >= minPrice
                    && employee.getSalary() <= maxPrice) {
                System.out.println(employee);
            }
        }
    }
}