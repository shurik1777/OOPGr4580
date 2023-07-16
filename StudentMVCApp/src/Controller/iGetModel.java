package Controller;

import Model.Student;

import java.util.List;

/**
 * Интерфейс для создания блока model в модели MVC
 */
public interface iGetModel {
    // Метод getAllStudents() предназначен для извлечения списка всех студентов.
    public List<Student> getAllStudents();

    // Метод deleteStudentById() выполняет удаление студента по указанному id из списка выгруженных
    public int deleteStudentById(Long id);

    //Метод createStudent(Student newStudent) выполняет создание нового студента в список
    public boolean createStudent(Student newStudent);

    //Метод updateStudentById(Long updateId, Student updatedStudent) выполняет обновление информации о студенте по заданному id 
    public void updateStudentById(Long updateId, Student updatedStudent);

}