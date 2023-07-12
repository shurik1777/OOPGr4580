package Services;

import Domen.Person;

import java.util.List;

/**
 * Обобщенный класс AverageAge для подсчета среднего возраста
 */
public class AverageAge<T extends Person> {
    // поле люди
    private List<T> persons;

    /**
     * Конструктор класса AverageAge
     * @param persons Список объектов типа T, представляющих людей
     */
    public AverageAge(List<T> persons) {
        this.persons = persons;
    }

    /**
     * Метод для вычисления среднего возраста
     * @return Средний возраст в виде числа с плавающей запятой
     */
    public double calculateAverageAge() {
        int sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return (double) sum / persons.size();
    }
}
