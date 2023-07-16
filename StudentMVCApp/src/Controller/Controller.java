package Controller;

import Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Класс Controller - связующее звено View и Model
 */
public class Controller {
    private ResourceBundle bundle = ResourceBundle.getBundle("messages_ru_RU", new Locale("ru"));
    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    /**
     * Конструктор класса
     *
     * @param view блок view, экземпляр класса, содержащего интерфейс iGetView
     * @param model блок model, экземпляр класса, содержащего интерфейс iGetModel
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    // метод, который запускает взаимосвязь с пользователем
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt();
            try {
                com = Commands.valueOf(command.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIteration = false;
                        System.out.println(bundle.getString("case.exit"));
                        break;
                    case LIST:
                        view.printAllStudent(model.getAllStudents());
                        break;
                    case DELETE:
                        Long id = view.getStudentIdToDelete();
                        model.deleteStudentById(id);
                        System.out.println(bundle.getString("case.dell"));
                        break;
                    case CREATE:
                        Student newStudent = view.readStudent();
                        model.createStudent(newStudent);
//                        System.out.println(bundle.getString("case.create"));
                        break;
                    default:
                        System.out.println(bundle.getString("case.updateTry"));
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(bundle.getString("case.updateTry"));
            }
        }
    }
}
