package Complex;

/**
 * Интерфейс предоставляет метод записи в лог
 */
public interface iLoggable {
    /**
     * Метод записи в лог
     *
     * @param message сообщение для записи в лог
     */
    void log(String message);
}