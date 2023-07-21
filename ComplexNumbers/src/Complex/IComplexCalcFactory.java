package Complex;

/**
 * Интерфейс, предоставляющий фабричную функцию для создания цепочки действий над операндом.
 */
public interface IComplexCalcFactory {

    /**
     * Создает объект iComplexCalc с заданными вещественной и мнимой частями комплексного числа.
     *
     * @param argRe вещественная часть комплексного числа.
     * @param argIm мнимая часть комплексного числа.
     * @return объект типа iComplexCalc.
     */
    iComplexCalc create(double argRe, double argIm);
}
