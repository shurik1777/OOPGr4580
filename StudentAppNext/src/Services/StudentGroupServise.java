package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Student;

import Domen.StudentGroup;
import Domen.PersonComparator;

public class StudentGroupServise {
    private List<StudentGroup> groups;

    /**
     * Конструктор класса StudentGroupServise.
     * Инициализирует список групп студентов.
     */
    public StudentGroupServise() {
        this.groups = new ArrayList<>();
    }

    /**
     * Получить все группы студентов.
     *
     * @return Список групп студентов.
     */
    public List<StudentGroup> getAll() {
        return this.groups;
    }

    /**
     * Получить отсортированный по ФИО список студентов в заданной группе.
     *
     * @param numberGrop Номер группы.
     * @return Отсортированный список студентов.
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGrop) {
        List<Student> students = new ArrayList<>(groups.get(numberGrop).getStudent());
        students.sort(new PersonComparator<>());
        return students;
    }
}
