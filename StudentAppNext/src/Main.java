import java.util.*;

import Controllers.EmployeeController;
import Controllers.TeacherController;
import Domen.*;
import Services.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Создание экземпляров студентов.
         */
        Student student1 = new Student("Вадим", "Крутяк", 24, 12323);
        Student student2 = new Student("Елена", "Землянникова", 18, 2221);
        Student student3 = new Student("Артур", "Куприянов", 24, 332);
        Student student4 = new Student("Елизавета", "Маралова", 23, 1112);
        Student student5 = new Student("Аркадий", "Штримн", 22, 2333);
        Student student6 = new Student("Иван", "Александров", 22, 5012);
        Student student7 = new Student("Феликс", "Штелюк", 20, 5639);
        Student student8 = new Student("Наталья", "Казакова", 23, 23103);
        Student student9 = new Student("Игорь", "Рожков", 19, 769);
        /**
         * Создание экземпляров учителей.
         */
        Teacher teacher1 = new Teacher("Ирина", "Селюк", 45, 11, "Кандидат наук");
        Teacher teacher2 = new Teacher("Галина", "Весельчакова", 53, 22, "Декан");
        Teacher teacher3 = new Teacher("Артем", "Силуанов", 42, 54, "Доцент");
        Teacher teacher4 = new Teacher("Кирилл", "Философов", 58, 64, "Профессор");
        Teacher teacher5 = new Teacher("Николай", "Юдинцев", 48, 89, "Профессор");
        /**
         * Создание экземпляров сотрудников.
         */
        Employee employee1 = new Employee("Иван", "Иванов", 30, 551);
        Employee employee2 = new Employee("Оксана", "Козлова", 40, 552);
        Employee employee3 = new Employee("Инокентий", "Варнава", 26, 554);
        Employee employee4 = new Employee("Анастасия", "Голубева", 47, 558);

        List<Student> listStudent1 = new ArrayList<>();
        listStudent1.add(student1);
        listStudent1.add(student2);
        listStudent1.add(student3);
        listStudent1.add(student4);
        StudentGroup studentGroup1 = new StudentGroup(listStudent1, 1);

        List<Student> listStudent2 = new ArrayList<>();
        listStudent2.add(student5);
        listStudent2.add(student6);
        StudentGroup studentGroup2 = new StudentGroup(listStudent2, 2);

        List<Student> listStudent3 = new ArrayList<>();
        listStudent3.add(student7);
        listStudent3.add(student8);
        listStudent3.add(student9);
        StudentGroup studentGroup3 = new StudentGroup(listStudent3, 3);

        StudentStream stream = new StudentStream(100);
        stream.addStream(studentGroup1);
        stream.addStream(studentGroup2);
        stream.addStream(studentGroup3);

        /**
         * Вывод информации о каждой группе студентов.
         */
//        for (StudentGroup studentGroup : stream) {
//            System.out.println(studentGroup);
//        }

        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(teacher1);
        listTeacher.add(teacher2);
        listTeacher.add(teacher3);
        listTeacher.add(teacher4);
        listTeacher.add(teacher5);

        List<Employee> listEmloyee = new ArrayList<>();
        listEmloyee.add(employee1);
        listEmloyee.add(employee2);
        listEmloyee.add(employee3);
        listEmloyee.add(employee4);

        System.out.println("-----------------------------");
        Collections.sort(stream.getStream());
        /**
         * Вывод отсортированной информации о каждой группе студентов.
         */
//        for (StudentGroup studentGroup : stream) {
//            System.out.println(studentGroup);
//        }
//        Employee pers1 = new Employee("German", "Graf", 34, 10);
//        Student stud1 = new Student("Alex", "Kudryaswov", 22, 001);
        /**
         * Вызов метода paySalary() из класса EmployeeController для выплаты зарплаты сотруднику.
         */
//        EmployeeController.paySalary(pers1);
//        TeacherController contrTeacher = new TeacherController();
        /**
         * Вызов метода paySalary() из класса TeacherController для выплаты зарплаты преподавателю.
         */
//        contrTeacher.paySalary(teacher1);
        /**
         * Вывод списков и вычисление среднего возраста студентов, преподавателей и работников.
         */
        System.out.println(listStudent1);
        System.out.println(listEmloyee);
        System.out.println(listTeacher);
        System.out.println();
        AverageAge<Student> averageAgeOfStudents = new AverageAge<>(listStudent1);
        System.out.println("Средний возраст студентов: " + averageAgeOfStudents.calculateAverageAge());
        AverageAge<Teacher> averageAgeOfTeachers = new AverageAge<>(listTeacher);
        System.out.println("Средний возраст преподавателей: " + averageAgeOfTeachers.calculateAverageAge());
        AverageAge<Employee> averageAgeOfEmploee = new AverageAge<>(listEmloyee);
        System.out.println("Средний возраст работников: " + averageAgeOfEmploee.calculateAverageAge());
    }
}
