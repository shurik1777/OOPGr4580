package Domen;

public class Teacher extends Person {
    private int teacherId;
    private String academicDegree;

    /**
     * Конструктор класса Teacher.
     *
     * @param firstName      Имя учителя.
     * @param lastName       Фамилия
     * @param age            Возраст учителя.
     * @param teacherId      ID учителя.
     * @param academicDegree Академическая степень учителя.
     */
    public Teacher(String firstName, String lastName, int age, int teacherId, String academicDegree) {
        super(firstName, lastName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    /**
     * Получить ID учителя.
     *
     * @return ID учителя.
     */
    public int getTeacherId() {
        return teacherId;
    }

    /**
     * Установить ID учителя.
     *
     * @param teacherId Новый ID учителя.
     */
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * Получить академическую степень учителя.
     *
     * @return Академическая степень учителя.
     */
    public String getAcademicDegree() {
        return academicDegree;
    }

    /**
     * Установить академическую степень учителя.
     *
     * @param academicDegree Новая академическая степень учителя.
     */
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * Переопределение метода toString().
     *
     * @return Строковое представление объекта Teacher.
     */
    @Override
    public String toString() {
        return "\n Учитель {" +
                "Имя='" + super.getFirstName() + '\'' +
                "\t, Фамилия='" + super.getLastName() + '\'' +
                "\t, Возраст= '" + super.getAge() + '\'' +
                "\t, idTeacher= '" + this.getTeacherId() + '\'' +
                "\t, Академическая степень= " + this.getAcademicDegree() +" "+
                '}';
    }
}
