package Controllers;

import Domen.Employee;
import Domen.Person;
import Services.EmployeeService;

public class EmployeeController implements iPersonController<Employee> {
    private final EmployeeService empService = new EmployeeService();

    /**
     * Создает нового сотрудника.
     *
     * @param firstName Имя сотрудника.
     * @param lastName  Фамилия сотрудника.
     * @param age       Возраст сотрудника.
     */
    @Override
    public void create(String firstName, String lastName, int age) {
        empService.create(firstName, lastName, age);
    }

    /**
     * Выплачивает зарплату сотруднику.
     *
     * @param person Сотрудник.
     */
    static public <T extends Employee> void paySalary(T person) {
        System.out.println(((Person) person).getFirstName() + " ЗП 10.000 рублей ");
    }

    /**
     * Вычисляет среднее значение чисел.
     *
     * @param num Массив чисел.
     * @param <T> Тип чисел.
     * @return Среднее значение чисел.
     */
    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
