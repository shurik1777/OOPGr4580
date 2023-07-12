package Domen;

/**
 * Класс, представляющий студента.
 */
public class Student extends Person implements Comparable<Student> {

    private long idStudent;

    /**
     * Конструктор: студента
     * @param firstName - Имя
     * @param lastName - Фамилия
     * @param age - Возраст
     * @param idStudent - Идентификатор студента
     */
    public Student(String firstName, String lastName, int age, long idStudent) {
        super(firstName, lastName, age);
        this.idStudent = idStudent;
    }

    /**
     * Получает идентификатор студента.
     *
     * @return Идентификатор студента.
     */
    public long getIdStudent() {
        return idStudent;
    }

    /**
     * Устанавливает идентификатор студента.
     *
     * @param idStudent Идентификатор студента.
     */
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    /**
     * Возвращает строковое представление студента.
     *
     * @return Строковое представление студента.
     */
    @Override
    public String toString() {
        return "\n Студент {" +
                " Имя='" + super.getFirstName() + '\'' +
                "\t, Фамилия='" + super.getLastName() + '\'' +
                "\t, Возраст= '" + super.getAge() + '\'' +
                "\t, idStudent= " + this.getIdStudent() +" "+
                '}';
    }

    /**
     * Сравнивает текущего студента с другим студентом по заданным параметрам.
     *
     * @param o - Другой студент, с которым происходит сравнение.
     * @return 0, если студенты равны по возрасту; положительное число, если текущий студент старше другого;
     * отрицательное число, если текущий студент младше другого.
     */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (idStudent == o.idStudent)
                return 0;
            if (idStudent > o.idStudent)
                return 1;
            else
                return -1;
        }
        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}
