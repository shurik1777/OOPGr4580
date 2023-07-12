package Services;

import Domen.PersonComparator;
import Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int countStudents;
    private List<Student> students;

    /**
     * Конструктор класса StudentService.
     * Инициализирует список студентов.
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     * Получить всех студентов.
     *
     * @return Список студентов.
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * Создать нового студента и добавить его в список студентов.
     *
     * @param firstName Имя студента.
     * @param lastName  Фамилия студента.
     * @param age       Возраст студента.
     */
    @Override
    public void create(String firstName, String lastName, int age) {
        Student per = new Student(firstName, lastName, age, countStudents);
        countStudents++;
        students.add(per);
    }

    /**
     * Отсортировать список студентов по ФИО.
     */
    public void sortByFIOStdLst() {
        students.sort(new PersonComparator<Student>());
    }
}
