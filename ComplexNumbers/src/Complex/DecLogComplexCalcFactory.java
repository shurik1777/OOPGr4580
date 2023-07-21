package Complex;

/**
 * Класс создаёт новый объект типа DecLogComplexCalc
 * фабрика по производству калькуляторов комплексных чисел c логированием
 * с инициированным начальным операндом
 */
public class DecLogComplexCalcFactory implements IComplexCalcFactory {
    private iLoggable logger;///< объект типа iLoggable

    /**
     * конструктор
     *
     * @param logger обект типа логер
     */
    public DecLogComplexCalcFactory(iLoggable logger) {
        this.logger = logger;
    }

    /**
     * @param primaryArgRe вещественная часть комплексного числа
     * @param primaryArgIm мнимая часть комплексного числа
     * @return объект класса DecLogComplexCalc
     */
    public iComplexCalc create(double primaryArgRe, double primaryArgIm) {
        return new DecLogComplexCalc(new ComplexCalc(primaryArgRe, primaryArgIm), logger);
    }
}