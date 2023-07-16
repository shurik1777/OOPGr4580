import java.util.*;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.ModelHash;
import Model.Student;
import View.ViewRU;
import View.ViewEng;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Подключения локализации
            ResourceBundle bundle;
            bundle = ResourceBundle.getBundle("messages", new Locale("ru"));
            // Выбор View перед стартом программы
            System.out.print(bundle.getString("promt.choise"));
            String languageChoice = scanner.nextLine().toLowerCase();

            iGetView view;
            if (languageChoice.equals("r")) {
                view = new ViewRU();
            } else if (languageChoice.equals("e")) {
                view = new ViewEng();
            } else {
                System.out.println(bundle.getString("promt.wrongChoise"));
                return;
            }
            // Создание листа студентов и наполнение простыми студентами
            List<Student> students = new ArrayList<Student>();
            Student s1 = new Student("Анатолий", "Иванов", 24, (long) 122);
            Student s2 = new Student("Артур", "Пирожков", 23, (long) 211);
            Student s3 = new Student("Иван", "Юдинцев", 20, (long) 125);
            Student s4 = new Student("Ирина", "Мальцева", 24, (long) 307);
            Student s5 = new Student("Анастасия", "Мельникова", 21, (long) 291);
            Student s6 = new Student("Генадий", "Пожарский", 25, (long) 174);
            Student s7 = new Student("Петр", "Глазунов", 26, (long) 238);
            Student s8 = new Student("Кирилл", "Ставропольский", 22, (long) 345);
            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);
            students.add(s5);
            students.add(s6);
            students.add(s7);
            students.add(s8);
            // Создание хэшированного листа студентов и наполнение студентами
            HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
            hashStudents.put((long) 122, s1);
            hashStudents.put((long) 211, s2);
            hashStudents.put((long) 125, s3);
            hashStudents.put((long) 307, s4);
            hashStudents.put((long) 291, s5);
            hashStudents.put((long) 174, s6);
            hashStudents.put((long) 238, s7);
            hashStudents.put((long) 345, s8);
            // Сохранение работы с программой в файле StudentDB при закрытии
            FileRepo fRepo = new FileRepo("StudentDB");
            fRepo.saveAllStudentToFile(students);
            // Вызов
//            iGetModel model = new Model(students);
            iGetModel model = new ModelHash(hashStudents);
            Controller control = new Controller(view, model);
            control.run();
        }
    }
}