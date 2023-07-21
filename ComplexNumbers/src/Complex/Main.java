package Complex;

public class Main {
    public static void main(String[] args) {
//IComplexCalcFactory calculableFactory = new ComplexCalcFactory();
        IComplexCalcFactory calculableFactory = new DecLogComplexCalcFactory(new Logger());
        ViewComplexCalc view = new ViewComplexCalc(calculableFactory);
        view.run();
    }
}