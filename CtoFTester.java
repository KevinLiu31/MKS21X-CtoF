public class CtoFTester{
	//The function celsiusToFahrenheit would have the parameter celsius which will be a double type, the function will return a double, fahrenheit.
	//The function fahrenheitToCelsius would have the parameter Fahrenheit which will be a double type, the function will return a double, Celsius.
	public static double celsiusToFahrenheit(double celsius){
		return ((celsius * 9/5) + 32);
	}
	public static double FahrenheitToCelsius(double fahrenheit){
		return ((fahrenheit - 32) * 5/9);
	}
	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(0));
		System.out.println(celsiusToFahrenheit(10));
		System.out.println(FahrenheitToCelsius(0));
		System.out.println(FahrenheitToCelsius(10));
	}
}