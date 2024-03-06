package exercício0603;
import java.util.Scanner;
public class CalculadoraTemperatura {
	public static void main(String[] args) {
		//Variáveis
		Double fahrenheit,celsius;
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);

		// Entrada de dados
		System.out.println("Informe sua temperatura em fahrenheit: ");
		fahrenheit=ler.nextDouble();

		//Processamento
		celsius=((fahrenheit-32)*5)/9;

		//Saída
		System.out.println("Em celsius é: "+celsius);

	}
}