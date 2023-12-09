package hw7.presenter;
import hw7.model.Calculable;

public interface ICalculableFactory {
    Calculable create(double primaryArg); 
}
