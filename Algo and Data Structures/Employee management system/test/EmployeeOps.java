package test;
import java.util.HashMap;
import java.util.Map;

public class EmployeeOps {
	private Map<Integer, Employee> employeeMap;

    public EmployeeOps(int initialCapacity) {
        employeeMap = new HashMap<>(initialCapacity);
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
        System.out.println("Employee added successfully.");
    }

    public void displayEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employeeMap.values()) {
                System.out.println(employee);
            }
        }
    }

    public Employee searchEmployeeById(int id) {
        return employeeMap.get(id);
    }

    public boolean deleteEmployeeById(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            return true;
        }
        return false;
    }
}
