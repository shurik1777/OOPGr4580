package Controllers;

import Domen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, String lastName, int age);
}
