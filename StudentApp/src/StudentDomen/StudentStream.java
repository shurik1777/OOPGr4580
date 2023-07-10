package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int threadNumber;

    /**
     * Конструктор потока студентов.
     *
     * @param threadNumber Номер потока
     */
    public StudentStream(int threadNumber) {
        this.threadNumber = threadNumber;
        this.studentGroups = new ArrayList<>();
    }

    /**
     * Добавляет группу студентов в поток.
     *
     * @param group Группа студентов
     */
    public void addStudentGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    /**
     * Возвращает итератор для перебора групп студентов в потоке.
     *
     * @return Итератор групп студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

    /**
     * Выводит информацию о группах студентов в потоке.
     */
    public void printGroups() {
        for (StudentGroup group : studentGroups) {
            System.out.println("Группа: " + group.getStudents());
        }
    }
    /**
     * Сортирует группы студентов в потоке по количеству студентов.
     */
    public void sortGroupsByStudentCount() {
        Collections.sort(studentGroups);
    }
}
