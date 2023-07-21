package Complex;

/**
 * Интерфейс, предоставляющий функции для выполнения операций над комплексными числами:
 * сложение, умножение, деление.
 */
public interface iComplexCalc {

    /**
     * Выполняет операцию сложения текущего комплексного числа с заданным комплексным числом.
     *
     * @param argRe вещественная часть комплексного числа.
     * @param argIm мнимая часть комплексного числа.
     * @return объект типа iComplexCalc с результатом операции сложения.
     */
    iComplexCalc sum(double argRe, double argIm);

    /**
     * Выполняет операцию умножения текущего комплексного числа на заданное комплексное число.
     *
     * @param argRe вещественная часть комплексного числа.
     * @param argIm мнимая часть комплексного числа.
     * @return объект типа iComplexCalc с результатом операции умножения.
     */
    iComplexCalc multi(double argRe, double argIm);

    /**
     * Выполняет операцию деления текущего комплексного числа на заданное комплексное число.
     *
     * @param argRe вещественная часть комплексного числа.
     * @param argIm мнимая часть комплексного числа.
     * @return объект типа iComplexCalc с результатом операции деления.
     */
    iComplexCalc divide(double argRe, double argIm);

    /**
     * Возвращает результат операции над комплексными числами в виде строки.
     *
     * @return строковое представление результата операции.
     */
    String getResult();

    /**
     * Возвращает вещественную часть результата операции над комплексными числами.
     *
     * @return вещественная часть результата операции.
     */
    double getRe();

    /**
     * Возвращает мнимую часть результата операции над комплексными числами.
     *
     * @return мнимая часть результата операции.
     */
    double getIm();

}
