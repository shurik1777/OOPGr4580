package Controllers;

import Domen.Student;
import Services.StudentService;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    /**
     * Метод создает нового студента и сохраняет его в базе данных.
     *
     * @param firstName Имя студента.
     * @param lastName  Фамилия студента.
     * @param age       Возраст студента.
     */
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
        dataService.sortByFIOStdLst();
    }
}
