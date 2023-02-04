package exceptions;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite 1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir, 5 para fazer uma raiz quadrada ou 6 para uma potenciação: ");
			int opcao = sc.nextInt();
			while(opcao > 6 || opcao < 1) {
				System.out.println("Opção inválida, tente novamente!");
				System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
				opcao = sc.nextInt();
			}
			if (opcao == 1) {
				System.out.print("Quantos números deseja somar? ");
				int qntsNumerosSomar = sc.nextInt();
				
				System.out.println(adicao(qntsNumerosSomar));
			}
			else if (opcao == 2) {
				System.out.print("Quantos números deseja subtrair? ");
				int qntsNumerosSubtrair = sc.nextInt();
				
				System.out.println(sub(qntsNumerosSubtrair));
			}
			else if (opcao == 3) {
				System.out.print("Quantos números deseja multiplicar? ");
				int qntsNumerosMultiplicar = sc.nextInt();
				
				System.out.println(mult(qntsNumerosMultiplicar));
			}
			else if (opcao == 4) {
				System.out.print("Quantos números deseja dividir? ");
				int qntsNumerosDividir = sc.nextInt();
				
				System.out.println(div(qntsNumerosDividir));
			}
			else if (opcao == 5) {
				System.out.print("Digite o número que deseja extrair a raiz quadrada: ");
				double raiz = sc.nextDouble();
				double resultadoR = Math.sqrt(raiz);
				System.out.println(resultadoR);
			}
			else {
				System.out.print("Digite o número no qual deseja realizar sua potenciação: ");
				double pot = sc.nextDouble();
				System.out.print("Digite o expoente:");
				double expoente = sc.nextDouble();
				double resultadoP = Math.pow(pot,expoente);
				System.out.println(resultadoP);
			}
		}
		catch(Exception e) {
			System.out.println("Entrada inválida");
		}
		sc.close();

	}
	public static double adicao(int x) throws Exception{
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		for (int i=0; i<x; i++) {
			mostrar();
			double num = sc.nextDouble();
			soma += num;
		}
		return soma;
	}
	public static double sub(int x) throws Exception{
		Scanner sc = new Scanner(System.in);
		mostrar();
		double subtracao = sc.nextDouble();
		
		for (int i=1; i<x; i++) {
			mostrar();
			double num = sc.nextDouble();
			subtracao -= num;
		}
		return subtracao;
	}
	public static double mult(int x) throws Exception{
		Scanner sc = new Scanner(System.in);
		mostrar();
		double multiplicacao = sc.nextDouble();
		
		for (int i=1; i<x; i++) {
			mostrar();
			double num = sc.nextDouble();
			multiplicacao *= num;
		}
		return multiplicacao;
	}
	public static double div(int x) throws Exception{
		Scanner sc = new Scanner(System.in);
		mostrar();
		double divisao = sc.nextDouble();
		
		for (int i=1; i<x; i++) {
			mostrar();
			double num = sc.nextDouble();
			divisao /= num;
		}
		return divisao;
	}
	public static void mostrar() {
		System.out.print("Digite um número: ");
	}
}
