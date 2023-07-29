package Complex;

/**
 * Класс, предоставляющий метод записи сообщений в лог.
 */
public class Logger implements iLoggable {

    /**
     * Записывает сообщение в лог.
     *
     * @param message Сообщение для записи в лог.
     */
    @Override
    public void log(String message) {try {
        FileWriter writer = new FileWriter("log.txt", true); // true - для добавления записи в конец файла, а не перезаписи
        writer.write(message + "\n");
        writer.close();
    } catch (IOException e) {
        System.err.println("Ошибка записи в лог: " + e.getMessage());
    }

}
