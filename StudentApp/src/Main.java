import StudentDomen.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Sergey", "Ivanov",25);
        // Первая рабочая часть
        Student s1 = new Student("Kirill", "Ivanov",22, (long) 211);
        Student s2 = new Student("Dasha", "Petrova",22, (long) 122);
        Student s3 = new Student("Igor", "Sidorov",25, (long) 123);
        Student s4 = new Student("Vera", "Ivanov",25, (long) 222);
        Student s5 = new Student("Lena", "Cvetkova",22, (long) 455);
        Student s6 = new Student("Vlad", "Romanovski",25, (long) 104);
        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        listStudent.add(s5);
        listStudent.add(s6);
        StudentGroup group = new StudentGroup(listStudent);

        for(Student stud : group){
            System.out.println(stud);
        }
        System.out.println("====================== Сортировка студентов по возарсту и id ==============");
        Collections.sort(group.getStudents());

        for(Student stud : group){
            System.out.println(stud);
        }
    }
//    // конец 1й части
//        // Вторая рабочая часть
//        StudentGroup group1 = new StudentGroup(List.of
//                (new Student("Иван", "Иванов", 20, 123456),
//                new Student("Алексей", "Смирнов", 20, 987654),
//                new Student("Антон", "Колиснеченко", 22, 987604)
//                ));
//        StudentGroup group2 = new StudentGroup(List.of
//                (new Student("Екатерина", "Васильева", 21, 654321),
//                new Student("Мария", "Петрова", 19, 456789)
//                ));
//
//        StudentStream stream = new StudentStream(1);
//        stream.addStudentGroup(group1);
//        stream.addStudentGroup(group2);
//        stream.printGroups();
//
//        System.out.println("=====================Сортировка групп по количеству студентов====================");
//        stream.sortGroupsByStudentCount();
//        stream.printGroups();
//    }
}