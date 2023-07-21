package Complex;

/**
 * Класс калькулятора комплексных чисел.
 * Является продуктом фабрики ComplexCalcFactory.
 */
public final class ComplexCalc implements iComplexCalc {

    private double primaryArgRe; ///< Комплексный операнд для вычислений - вещественная часть.
    private double primaryArgIm; ///< Комплексный операнд для вычислений - мнимая часть.

    /**
     * Конструктор.
     *
     * @param primaryArgRe Комплексный операнд для вычислений - вещественная часть.
     * @param primaryArgIm Комплексный операнд для вычислений - мнимая часть.
     */
    public ComplexCalc(double primaryArgRe, double primaryArgIm) {

        this.primaryArgRe = primaryArgRe;
        this.primaryArgIm = primaryArgIm;
    }

    /**
     * Складывает операнд с уже накопленным значением.
     *
     * @param argRe Вещественная часть операнда сложения.
     * @param argIm Мнимая часть операнда сложения.
     * @return Объект текущего класса ComplexCalc.
     */
    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        primaryArgRe += argRe;
        primaryArgIm += argIm;
        return this;
    }

    /**
     * Умножает операнд на уже накопленное значение.
     *
     * @param argRe Вещественная часть операнда умножения.
     * @param argIm Мнимая часть операнда умножения.
     * @return Объект текущего класса ComplexCalc.
     */
    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        primaryArgRe = primaryArgRe * argRe - primaryArgIm * argIm;
        primaryArgIm = primaryArgIm * argRe + primaryArgRe * argIm;
        return this;
    }

    /**
     * Делит уже накопленное значение на операнд делитель.
     *
     * @param argRe Вещественная часть операнда деления.
     * @param argIm Мнимая часть операнда деления.
     * @return Объект текущего класса ComplexCalc.
     */
    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        primaryArgRe = (primaryArgRe * argRe + primaryArgIm * argIm) / (primaryArgIm * primaryArgIm + argIm * argIm);
        primaryArgIm = (primaryArgIm * argRe - primaryArgRe * argIm) / (primaryArgIm * primaryArgIm + argIm * argIm);
        return this;
    }

    /**
     * Возвращает результат операции в виде строки.
     *
     * @return Результат операции в виде строки.
     */
    @Override
    public String getResult() {
        String operator = primaryArgIm >= 0 ? "+" : "";
        return primaryArgRe + operator + primaryArgIm + "*i";
    }

    /**
     * Возвращает вещественную часть результата операции над комплексными числами.
     *
     * @return Вещественная часть результата операции.
     */
    @Override
    public double getRe() {
        return primaryArgRe;
    }

    /**
     * Возвращает мнимую часть результата операции над комплексными числами.
     *
     * @return Мнимая часть результата операции.
     */
    @Override
    public double getIm() {
        return primaryArgIm;
    }
}
