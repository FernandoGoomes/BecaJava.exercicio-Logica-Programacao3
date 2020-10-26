package exercicioLogicaProgramaçao3;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperatura;
		int opcao;

		System.out.print("Digite 1 para saber a tempereatura em Celsius ou 2 para Fahrenheit: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.print("Digite a temperatura em Fahreneit: ");
			temperatura = sc.nextDouble();
			temperatura = ((temperatura - 32) / 1.8);
			System.out.println("Temperatura em Celsius = " + temperatura);
			break;

		case 2:
			System.out.println("Digite a temperatura em Celsius ");
			temperatura = sc.nextDouble();
			temperatura = ((temperatura * 1.8) + 32);
			System.out.println("Temperatura em Fahreneit = " + temperatura);
			break;

		default:
			System.out.println("O valor digitado não esta certo");
		}
		
		sc.close();
	}

}
