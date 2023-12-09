package hw7;

import hw7.presenter.ICalculableFactory;
import hw7.presenter.Log;
import hw7.presenter.LogCalculableFactory;
import hw7.view.ConsoleInputReader;
import hw7.view.ConsoleOutputWriter;
import hw7.view.ViewCalculator;

public class Main { 
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory, new ConsoleInputReader(), new ConsoleOutputWriter());
        view.run();
    }
}
