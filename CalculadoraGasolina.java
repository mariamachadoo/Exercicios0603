package exercício0603;
import java.util.Scanner;
public class CalculadoraGasolina {

	public static void main(String[] args) {
		//Variáveis
		Double distância,consumomédio,litros,custototal,combustivel;
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Informe o valor do litro do combustivel: ");
		combustivel=ler.nextDouble();
		
		System.out.println ("Informe a distância percorrida em km: ");
		distância=ler.nextDouble();

		System.out.println ("Informe o consumo médio: ");
		consumomédio=ler.nextDouble();
		
		//Processamento
		litros=distância/consumomédio;
		custototal=litros*combustivel;
		
		//Saída
		System.out.println("A quantidade de litos gasto é: "+litros);
		System.out.println("O seu custo total é: "+custototal);
		
	}
}
