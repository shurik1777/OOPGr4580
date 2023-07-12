package Services;

import Domen.Employee;
import Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private List<Employee> employees;
    private int countEmployee;

    /**
     * Конструктор класса EmployeeService.
     * Инициализирует список работников.
     */
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    /**
     * Создает новый объект работника и добавляет его в список работников.
     *
     * @param firstName Имя работника.
     * @param lastName  Фамилия работника.
     * @param age       Возраст работника.
     */
    @Override
    public void create(String firstName, String lastName, int age) {
        Employee per = new Employee(firstName, lastName, age, countEmployee);
        countEmployee++;
        employees.add(per);
    }

    /**
     * Возвращает список всех работников.
     *
     * @return Список всех работников.
     */
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    /**
     * Возвращает список отсортированных работников по ФИО.
     *
     * @return Список отсортированных работников.
     */
    public List<Employee> sortedByFIOEmployeeGroup() {
        List<Employee> emps = new ArrayList<>(employees);
        emps.sort(new PersonComparator<Employee>());
        return employees;
    }
}
