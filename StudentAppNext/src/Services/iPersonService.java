package Services;

import java.util.List;

public interface iPersonService<T> {
    /**
     * Получить все объекты типа T.
     *
     * @return Список всех объектов типа T.
     */
    List<T> getAll();

    /**
     * Создать новый объект типа T с указанными данными.
     *
     * @param firstName Имя объекта.
     * @param age       Возраст объекта.
     */
    void create(String firstName, String lastName, int age);
}
