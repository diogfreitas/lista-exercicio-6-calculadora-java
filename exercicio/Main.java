package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char opcao;

		do {
			System.out.println("===== CALCULADORA =====");
			System.out.println("Selecione a operação desejada:");
			System.out.println("1. Adição");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			System.out.println("5. Potência");
			System.out.println("6. Raiz Quadrada");
			System.out.println("Q. Sair");

			opcao = scanner.next().charAt(0);

			if (opcao == 'Q' || opcao == 'q') {
				System.out.println("Encerrando o programa...");
				break;
			}

			if (opcao < '1' || opcao > '6') {
				System.out.println("Opção inválida! Tente novamente.\n");
				continue;
			}

			System.out.print("Digite o primeiro número: ");
			double numeroUm = scanner.nextDouble();

			if (opcao != '6') {
				System.out.print("Digite o segundo número: ");
				double numeroDois = scanner.nextDouble();

				switch (opcao) {
				case '1':
					System.out.println("Resultado: " + adicao(numeroUm, numeroDois));
					break;
				case '2':
					System.out.println("Resultado: " + subtracao(numeroUm, numeroDois));
					break;
				case '3':
					System.out.println("Resultado: " + multiplicacao(numeroUm, numeroDois));
					break;
				case '4':
					if (numeroDois == 0) {
						System.out.println("Impossível realizar uma divisão por zero.");
					} else {
						System.out.println("Resultado: " + divisao(numeroUm, numeroDois));
					}
					break;
				case '5':
					System.out.println("Resultado: " + potencia(numeroUm, numeroDois));
					break;
				}
			} else {
				if (numeroUm < 0) {
					System.out.println("Não existe raiz de número negativo.");
				} else {
					System.out.println("Resultado: " + raizQuadrada(numeroUm));
				}
			}

			System.out.println();
		} while (true);

		scanner.close();
	}

	public static double adicao(double a, double b) {
		return a + b;
	}

	public static double subtracao(double a, double b) {
		return a - b;
	}

	public static double multiplicacao(double a, double b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

	public static double potencia(double a, double b) {
		return Math.pow(a, b);
	}

	public static double raizQuadrada(double a) {
		return Math.sqrt(a);
	}
}
