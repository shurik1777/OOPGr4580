package Controllers;

import Domen.Person;
import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    /**
     * Создает нового преподавателя.
     *
     * @param firstName Имя преподавателя.
     * @param lastName  Фамилия преподавателя.
     * @param age       Возраст преподавателя.
     */
    @Override
    public void create(String firstName, String lastName, int age) {
        teacherService.create(firstName, lastName, age);
    }

    /**
     * Выплачивает зарплату преподавателю и выводит информацию о выплате.
     *
     * @param person Преподаватель, которому выплачивается зарплата.
     * @param <T>    Тип преподавателя.
     */
    public <T extends Teacher> void paySalary(T person) {
        System.out.println(((Person) person).getFirstName() + ": " + "Зп 25.000 рублей");
    }

    /**
     * Вычисляет среднее значение чисел.
     *
     * @param num Массив чисел.
     * @param <T> Тип чисел (расширяющий класс Number).
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
