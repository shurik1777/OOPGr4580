// Пример класса пользовательского исключения, наследующегося от Exception
class CustomException extends Exception {
    // Конструктор с сообщением об ошибке
    public CustomException(String message) {
        super(message);
    }
}
public class main {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException ex) {
            System.out.println("Caught CustomException: " + ex.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
//java.lang.Object
//        |
//        java.lang.Throwable
//        /           \
//        java.lang.Error   java.lang.Exception