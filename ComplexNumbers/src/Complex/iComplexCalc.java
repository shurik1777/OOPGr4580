package Complex;

/**
 * Интерфейс предоставляет функции для действий над двумя операндами
 * сложение, умножение, деление
 */
public interface iComplexCalc {

    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return сумма комплексных чисел
     */
    iComplexCalc sum(double argRe, double argIm);


    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return произведения комплексных чисел
     */
    iComplexCalc multi(double argRe, double argIm);

    /**
     * @return результат операции над комплексными числами
     */
    String getResult();


    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return результат деления комплексных чисел
     */
    iComplexCalc divide(double argRe, double argIm);

    /**
     * @return вещественную часть результата операции над комплексными числами
     */
    double getRe();

    /**
     * @return мнимую часть результата операции над комплексными числами
     */
    double getIm();

}
