package Complex;

/**
 * Класс, реализующий калькулятор комплексных чисел с логированием.
 * Использует паттерн Декоратор, который содержит объект калькулятора комплексных чисел
 * и объект логгера через интерфейсы.
 */
public class DecLogComplexCalc implements iComplexCalc {
    private iComplexCalc decorated;///< Объект типа калькулятор от интерфейса iComplexCalc.
    private iLoggable logger;///< Объект типа логгер от интерфейса iLoggable.

    /**
     * Конструктор.
     *
     * @param decorated Объект типа калькулятор от интерфейса iComplexCalc.
     * @param logger    Объект типа логгер от интерфейса iLoggable.
     */
    public DecLogComplexCalc(iComplexCalc decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    /**
     * Складывает комплексное число с уже накопленным значением.
     *
     * @param argRe Вещественная часть комплексного числа.
     * @param argIm Мнимая часть комплексного числа.
     * @return Результат сложения операнда с уже накопленным значением.
     */
    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода sum"));
        logger.log(String.format("Вещественная часть первого значения калькулятора: %f", firstAgrRe));
        logger.log(String.format("Мнимая часть первого значения калькулятора: %f", firstAgrIm));
        iComplexCalc result = decorated.sum(argRe, argIm);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    /**
     * Умножает комплексное число на уже накопленное значение.
     *
     * @param argRe Вещественная часть комплексного числа.
     * @param argIm Мнимая часть комплексного числа.
     * @return Результат умножения операнда на уже накопленное значение.
     */
    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода multi"));
        logger.log(String.format("Вещественная часть первого значения калькулятора: %f", firstAgrRe));
        logger.log(String.format("Мнимая часть первого значения калькулятора: %f", firstAgrIm));
        iComplexCalc result = decorated.multi(argRe, argIm);
        logger.log(String.format("Вызов метода multi произошел"));
        return result;
    }

    /**
     * Делит уже накопленное значение на комплексное число.
     *
     * @param argRe Вещественная часть комплексного числа.
     * @param argIm Мнимая часть комплексного числа.
     * @return Результат деления уже накопленного значения на операнд-делитель.
     */
    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        double firstAgrRe = decorated.getRe();
        double firstAgrIm = decorated.getIm();
        logger.log(String.format("Начало вызова метода divide"));
        logger.log(String.format("Вещественная часть первого значения калькулятора: %f", firstAgrRe));
        logger.log(String.format("Мнимая часть первого значения калькулятора: %f", firstAgrIm));
        iComplexCalc result = decorated.divide(argRe, argIm);
        logger.log(String.format("Вызов метода divide произошел"));
        return result;
    }

    /**
     * Возвращает результат операции над комплексными числами.
     *
     * @return Результат операции над комплексными числами.
     */
    @Override
    public String getResult() {
        String result = decorated.getResult();
        logger.log(String.format("Получение результата: %s", result));
        return result;
    }

    /**
     * Возвращает вещественную часть результата операции над комплексными числами.
     *
     * @return Вещественная часть результата операции над комплексными числами.
     */
    @Override
    public double getRe() {
        double result = decorated.getRe();
        logger.log(String.format("Получение вещественной части результата: %f", result));
        return result;
    }

    /**
     * Возвращает мнимую часть результата операции над комплексными числами.
     *
     * @return Мнимая часть результата операции над комплексными числами.
     */
    @Override
    public double getIm() {
        double result = decorated.getIm();
        logger.log(String.format("Получение мнимой части результата: %f", result));
        return result;
    }
}
