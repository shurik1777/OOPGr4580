package Complex;

/**
 * Класс создаёт новый объект типа DecLogComplexCalc,
 * является фабрикой по производству калькуляторов комплексных чисел с логированием,
 * и имеет инициированный начальный операнд.
 */
public class DecLogComplexCalcFactory implements IComplexCalcFactory {
    private iLoggable logger;///< Объект типа iLoggable для логирования.

    /**
     * Конструктор класса.
     *
     * @param logger Объект типа логер.
     */
    public DecLogComplexCalcFactory(iLoggable logger) {
        this.logger = logger;
    }

    /**
     * Создает новый объект класса DecLogComplexCalc с заданными вещественной и мнимой частями комплексного числа.
     *
     * @param primaryArgRe Вещественная часть комплексного числа.
     * @param primaryArgIm Мнимая часть комплексного числа.
     * @return Объект класса DecLogComplexCalc.
     */
    public iComplexCalc create(double primaryArgRe, double primaryArgIm) {
        return new DecLogComplexCalc(new ComplexCalc(primaryArgRe, primaryArgIm), logger);
    }
}
