package Domen;

public class Employee extends Person{
    private int employeeId;
    /**
     * Конструктор класса Рабочего.
     *
     * @param firstName Имя рабочего.
     * @param lastName  Фамилия рабочего.
     * @param age       Возраст рабочего.
     */
    public Employee(String firstName, String lastName, int age, int employeeId) {
        super(firstName, lastName, age);
        this.employeeId = employeeId;
    }
    /**
     * Получить ID учителя.
     *
     * @return ID учителя.
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Установить ID учителя.
     *
     * @param employeeId Новый ID учителя.
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
//
//    /**
//     * Переопределение метода toString().
//     *
//     * @return Строковое представление объекта Employee.
//     */
//    @Override
    public String toString() {
        return "\n Рабочий {" +
                "Имя='" + super.getFirstName() + '\'' +
                "\t, Фамилия='" + super.getLastName() + '\'' +
                "\t, Возраст= '" + super.getAge() + '\'' +
                "\t, idTeacher= " + this.getEmployeeId() +
                '}';
    }
}