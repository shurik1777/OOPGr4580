package StudentDomen;

public class Student extends User implements Comparable<Student> {
    private long studentID;

    /**
     * Конструктор класса Student.
     *
     * @param firstName  Имя студента.
     * @param secondName Фамилия студента.
     * @param age        Возраст студента.
     * @param studentID  Студенческий ID студента.
     */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    /**
     * Получает студенческий ID студента.
     *
     * @return Студенческий ID студента.
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     * Устанавливает студенческий ID студента.
     *
     * @param studentID Студенческий ID студента.
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /**
     * Возвращает строковое представление объекта Student.
     *
     * @return Строковое представление объекта Student.
     */
    @Override
    public String toString() {
        return "\nStudent{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName=" + super.getSecondName() +
                ", возраст=" + super.getAge() +
                ", студенческий ID=" + studentID +
                "}";
    }

    /**
     * Сравнивает данный объект Student с другим объектом Student.
     *
     * @param o - Другой объект Student для сравнения.
     * @return 0, если объекты равны; отрицательное число, если данный объект меньше другого объекта; положительное
     * число, если данный объект больше другого объекта.
     */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
