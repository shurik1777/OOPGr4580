package Complex;

/**
 * Интерфейс для объектов, которые могут записывать сообщения в лог.
 */
public interface iLoggable {
    /**
     * Метод записи сообщения в лог.
     *
     * @param message Сообщение для записи в лог.
     */
    void log(String message);
}