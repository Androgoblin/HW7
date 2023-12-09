package hw7.presenter;

import hw7.model.Calculable;
import hw7.model.Calculator;

public class LogCalculableFactory implements ICalculableFactory {

    private Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(double primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
    
}
