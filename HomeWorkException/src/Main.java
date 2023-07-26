import positivechecker.PositiveNumberChecker;
import divisionprogram.DivisionProgram;
import numberchecker.NumberChecker;
import bank.Bank;

public class Main {
    public static void main(String[] args) {
        /** Вызов кода первого пакета positivechecker,
         * чтобы вызвать исключение InvalidNumberException из класса PositiveNumberChecker,
         * нужно ввести в консоль число <= 0, например 0 или -5.
         */
        PositiveNumberChecker.main(args);

        /** Вызов кода второго пакета divisionprogram,
         * чтобы вызвать исключение DivisionByZeroException, нужно ввести второе число, равное 0.
         */
        DivisionProgram.main(args);

        /** Вызов кода третьего пакета numberchecker,
         * Чтобы вызвать исключение всех ошибок, нужно ввести число,
         * выходящее за допустимый диапазон (больше 100), отрицательное число и число,
         * которое в сумме с другим числом дают значение меньше 10, а также ввести число, равное 0.
         */
        NumberChecker.main(args);

        /** Вызов кода четвёртого пакета bank
         * в самом классе закомментирован код вызова второй ошибки.
         */
        Bank.main(args);
    }
}
