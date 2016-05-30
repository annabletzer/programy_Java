
public class Main {

	public static void main(String[] args) {
double a = 25;
double b = 5;

Calculator calc = new Calculator();

System.out.println(a + " + " + b + " = " + calc.add(a, b));
System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
System.out.println(a + " / " + b + " = " + calc.divide(a, b));

	}

}
