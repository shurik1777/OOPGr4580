package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    /**
     * Конструктор итератора для группы студентов.
     *
     * @param students Список студентов
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Проверяет, есть ли следующий элемент в списке.
     *
     * @return true, если есть следующий элемент; false в противном случае
     */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /**
     * Возвращает следующего студента в списке.
     *
     * @return Следующий студент
     */
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }
}
