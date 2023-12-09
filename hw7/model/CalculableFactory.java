package hw7.model;

import hw7.presenter.ICalculableFactory;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(double primaryArg) {
        return new Calculator(primaryArg);
    }
}
