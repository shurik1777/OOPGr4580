package Domen;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Конструктор класса Person.
     *
     * @param firstName Имя персоны.
     * @param lastName  Фамилия персоны.
     * @param age       Возраст персоны.
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Получает имя персоны.
     *
     * @return Имя персоны.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Устанавливает имя персоны.
     *
     * @param firstName Имя персоны.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Получает фамилию персоны.
     *
     * @return Фамилия персоны.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Устанавливает фамилию персоны.
     *
     * @param lastName Фамилия персоны.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Получает возраст персоны.
     *
     * @return Возраст персоны.
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст персоны.
     *
     * @param age Возраст персоны.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Представляет объект Person в виде строки.
     *
     * @return Строковое представление объекта Person.
     */
    @Override
    public String toString() {
        return "\n User {" +
                "first name='" + this.getFirstName() + '\'' +
                ", last name='" + this.getLastName() + '\'' +
                ", age= " + this.getAge() +" "+
                '}';
    }
}
