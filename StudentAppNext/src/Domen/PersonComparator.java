package Domen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {
    /**
     * Сравнивает два объекта типа T по имени и возрасту.
     *
     * @param o1 Первый объект для сравнения.
     * @param o2 Второй объект для сравнения.
     * @return Результат сравнения:
     *         0, если объекты равны;
     *         положительное число, если первый объект больше второго;
     *         отрицательное число, если первый объект меньше второго.
     */
    @Override
    public int compare(T o1, T o2) {
        // сортировка по Имени
        int res = o1.getFirstName().compareTo(o2.getFirstName());
        // сортировка по возрасту
        if (res == 0) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return res;
        }
    }
}
