package View;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewEng представляет представление данных на английском языке и реализует интерфейс iGetView.
 */
public class ViewEng implements iGetView {
    private Scanner scanner;
    private ResourceBundle bundle;

    /**
     * Конструктор класса ViewEng.
     */
    public ViewEng() {
        scanner = new Scanner(System.in);
        bundle = ResourceBundle.getBundle("messages_en_EN", new Locale("en"));
    }

    /**
     * Выводит всех студентов из списка.
     *
     * @param students Список студентов
     */
    public void printAllStudent(List<Student> students) {
        System.out.println(bundle.getString("list.students"));
        for (Student person : students) {
            System.out.println(person);
        }
        System.out.println(bundle.getString("end.list"));
    }
    /**
     * Запрашивает у пользователя ввод команды.
     *
     * @return Введенная пользователем команда
     */
    public String prompt() {
        System.out.print(bundle.getString("prompt.command"));
        return scanner.nextLine();
    }

    /**
     * Запрашивает у пользователя идентификатор студента для удаления.
     *
     * @return Идентификатор студента для удаления
     */
    public Long getStudentIdToDelete() {
        System.out.print(bundle.getString("prompt.delete"));
        return scanner.nextLong();
    }

    @Override
    public void displayStudents(List<Student> students) {
        System.out.println(bundle.getString("list.students"));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(bundle.getString("end.list"));
    }

    @Override
    public Student readStudent() {
        System.out.print(bundle.getString("prompt.firstName"));
        String firstName = scanner.nextLine();
        System.out.print(bundle.getString("prompt.lastName"));
        String lastName = scanner.nextLine();
        System.out.print(bundle.getString("prompt.age"));
        int age = scanner.nextInt();
        scanner.nextLine(); // Пропустить оставшуюся пустую строку
        System.out.print(bundle.getString("prompt.id"));
        long id = scanner.nextLong();
        scanner.nextLine(); // Пропустить оставшуюся пустую строку
        return new Student(firstName, lastName, age, id);
    }

    @Override
    public Long getStudentIdToUpdate() {
        System.out.print(bundle.getString("prompt.idUpdate"));
        return scanner.nextLong();
    }
}
