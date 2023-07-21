package Complex;

/**
 * Интерфейс предоставляет фабричную функцию создания цепочки действий над операндом
 */
public interface IComplexCalcFactory {

    /**
     * @param argRe вещественная часть комплексного числа
     * @param argIm мнимая часть комплексного числа
     * @return объект типа iComplexCalc
     */
    iComplexCalc create(double argRe, double argIm);
}