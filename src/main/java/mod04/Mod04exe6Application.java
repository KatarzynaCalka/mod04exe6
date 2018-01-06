package mod04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Mod04exe6Application {

	public static void main(String[] args) {

        Calculator calculator = new Calculator(100, 20.5);

        double scoreAdd = calculator.add();
        double scoreSubtract = calculator.subtract();

        System.out.println("Score Add: " + scoreAdd);
        System.out.println("Score Subtract: " + scoreSubtract);
	}
}
