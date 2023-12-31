package StudentDomen;

public class User {
    private String firstName;
    private String secondName;
    private int age;

    /**
     * Конструктор класса User.
     *
     * @param firstName  Имя пользователя.
     * @param secondName Фамилия пользователя.
     * @param age        Возраст пользователя.
     */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * Получает имя пользователя.
     *
     * @return Имя пользователя.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Устанавливает имя пользователя.
     *
     * @param firstName Имя пользователя.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Получает фамилию пользователя.
     *
     * @return Фамилия пользователя.
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Устанавливает фамилию пользователя.
     *
     * @param secondName Фамилия пользователя.
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Получает возраст пользователя.
     *
     * @return Возраст пользователя.
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст пользователя.
     *
     * @param age Возраст пользователя.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Возвращает строковое представление объекта User.
     *
     * @return Строковое представление объекта User.
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}