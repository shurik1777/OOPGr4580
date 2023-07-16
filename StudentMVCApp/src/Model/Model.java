package Model;

import Controller.iGetModel;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;


/**
 * Класс Model предоставляет методы для передачи данных о студентах и реализует интерфейс iGetModel.
 */
public class Model implements iGetModel {
    private ResourceBundle bundle = ResourceBundle.getBundle("messages_ru_RU", new Locale("ru"));
    private List<Student> students;

    /**
     * Конструктор класса Model.
     * 
     * @param students Список студентов
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает список всех студентов.
     *
     * @return Список студентов
     */
    public List<Student> getAllStudents() {
        return students;
    }
    /**
     * Удаляет студента по заданному идентификатору.
     *
     * @param id Идентификатор студента для удаления
     * @return Индекс удаленного студента (-1, если студент не найден)
     */
    public int deleteStudentById(Long id) {
        int i = -1;
        for (Student pers : students) {
            if (Objects.equals(pers.getStudentID(), id)) {
                i = students.indexOf(pers);
                break;
            }
        }
        if (i != -1) {
            students.remove(i);
        }
        return i;
    }

    /**
     * Создает нового студента.
     *
     * @param newStudent Новый студент для создания
     * @return true, если студент успешно создан, false, если студент с таким идентификатором уже существует
     */
    @Override
    public boolean createStudent(Student newStudent) {
        // Проверяем, что студента с таким идентификатором еще нет в списке
        for (Student student : students) {
            if (Objects.equals(student.getStudentID(), newStudent.getStudentID())) {
                return false; // Студент с таким идентификатором уже существует
            }
        }
        System.out.println(bundle.getString("case.create"));
        students.add(newStudent);
        return true; // Студент успешно создан
    }

    /**
     * Обновляет данные студента по заданному идентификатору.
     *
     * @param updateId        Идентификатор студента для обновления
     * @param updatedStudent Обновленные данные студента
     */
    @Override
    public void updateStudentById(Long updateId, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (Objects.equals(student.getStudentID(), updateId)) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }

//    /**
//     * Удаляет студента по заданному идентификатору.
//     *
//     * @param id Идентификатор студента для удаления
//     * @return Индекс удаленного студента (-1, если студент не найден)
//     */
//    public int deleteStudentById(Long id) {
//        int i = -1;
//        for (Student pers : students) {
//            if (pers.getStudentID() == id) {
//                i = students.indexOf(pers);
//            }
//        }
//        students.remove(i);
//        return i;
//    }
//
//    /**
//     * Создает нового студента.
//     *
//     * @param newStudent Новый студент для создания
//     * @return true, если студент успешно создан, false, если студент с таким идентификатором уже существует
//     */
//    @Override
//    public boolean createStudent(Student newStudent) {
//        // Проверяем, что студента с таким идентификатором еще нет в списке
//        for (Student student : students) {
//            if (student.getStudentID() == newStudent.getStudentID()) {
//                return false; // Студент с таким идентификатором уже существует
//            }
//        }
//        students.add(newStudent);
//        return true; // Студент успешно создан
//    }
//
//    /**
//     * Обновляет данные студента по заданному идентификатору.
//     *
//     * @param updateId        Идентификатор студента для обновления
//     * @param updatedStudent Обновленные данные студента
//     */
//    @Override
//    public void updateStudentById(Long updateId, Student updatedStudent) {
//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            if (student.getStudentID() == updateId) {
//                students.set(i, updatedStudent);
//                break;
//            }
//        }
//    }
}
