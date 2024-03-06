package exercício0603;
import java.util.Scanner;
public class Moeda {
	
	public static void main(String[] args) {
		//Variáveis
		double real,dolar;
		
		// Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

        // Entrada de dados
		System.out.println("Informe o valor em real: ");
		real= ler.nextDouble();
		
		//Processamento
		dolar=real*4.94;
				
	    //Saída
		System.out.println("A conversão é: " + dolar);
		
	}

}
