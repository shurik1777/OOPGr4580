package Complex;

/**
 * Класс, создающий новые объекты типа ComplexCalculator.
 * Является фабрикой по производству калькуляторов комплексных чисел
 * с инициированным начальным операндом.
 */
public class ComplexCalcFactory implements IComplexCalcFactory {

    /**
     * Создает новый объект класса ComplexCalculator с заданными вещественной и мнимой частями комплексного числа.
     *
     * @param argRe Вещественная часть комплексного числа.
     * @param argIm Мнимая часть комплексного числа.
     * @return Объект класса ComplexCalculator.
     */
    @Override
    public iComplexCalc create(double argRe, double argIm) {
        return new ComplexCalc(argRe, argIm);
    }
}
