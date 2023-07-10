package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;

    /**
     * Конструктор группы студентов.
     *
     * @param students Список студентов
     */
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает список студентов.
     *
     * @return Список студентов
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Устанавливает список студентов.
     *
     * @param students Новый список студентов
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает итератор для перебора студентов.
     *
     * @return Итератор студентов
     */
    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

    /**
     * Сравнивает текущую группу студентов с другой группой по количеству студентов.
     *
     * @param o - Другая группа студентов
     * @return Результат сравнения (-1, 0 или 1)
     */
    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.students.size(), o.students.size());
    }
}
