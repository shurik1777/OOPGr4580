package Services;

import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int countTeacher;
    private List<Teacher> teachers;

    /**
     * Конструктор класса TeacherService.
     * Инициализирует список учителей.
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /**
     * Создает нового учителя со специальностью и добавляет его в список учителей.
     *
     * @param firstName      Имя учителя.
     * @param lastName       Фамилия учителя.
     * @param age            Возраст учителя.
     * @param academicDegree Ученая степень учителя.
     */
    public void create(String firstName, String lastName, int age, String academicDegree) {
        Teacher per = new Teacher(firstName, lastName, age, countTeacher, academicDegree);
        countTeacher++;
        teachers.add(per);
    }

    /**
     * Получить всех учителей.
     *
     * @return Список учителей.
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Создать нового учителя без указания ученой степени и добавить его в список учителей.
     *
     * @param firstName Имя учителя.
     * @param lastName  Фамилия учителя.
     * @param age       Возраст учителя.
     */
    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher per = new Teacher(firstName, lastName, age, countTeacher, "");
        countTeacher++;
        teachers.add(per);
    }

    /**
     * Получить отсортированный по имени и возрасту список учителей.
     *
     * @param numberGroup Номер группы.
     * @return Отсортированный список учителей.
     */
    public List<Teacher> getSortedByFIOTeacher(int numberGroup) {
        List<Teacher> teacher = new ArrayList<Teacher>(teachers);
        teacher.sort(new PersonComparator<Teacher>());
        return teacher;
    }
}
