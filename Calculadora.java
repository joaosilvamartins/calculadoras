package exceptions;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			double continuarOuNao;
			do {
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
					System.out.print("Digite para encerrar o programa ou qualquer outro número para fazer outra conta: ");
					continuarOuNao = sc.nextDouble();
				}
				else if (opcao == 2) {
					System.out.print("Quantos números deseja subtrair? ");
					int qntsNumerosSubtrair = sc.nextInt();
					
					System.out.println(sub(qntsNumerosSubtrair));
					System.out.print("Digite para encerrar o programa ou qualquer outro número para fazer outra conta: ");
					continuarOuNao = sc.nextDouble();
				}
				else if (opcao == 3) {
					System.out.print("Quantos números deseja multiplicar? ");
					int qntsNumerosMultiplicar = sc.nextInt();
					
					System.out.println(mult(qntsNumerosMultiplicar));
					System.out.print("Digite para encerrar o programa ou qualquer outro número para fazer outra conta: ");
					continuarOuNao = sc.nextDouble();
				}
				else if (opcao == 4) {
					System.out.print("Quantos números deseja dividir? ");
					int qntsNumerosDividir = sc.nextInt();
					
					System.out.println(div(qntsNumerosDividir));
					System.out.print("Digite para encerrar o programa ou qualquer outro número para fazer outra conta: ");
					continuarOuNao = sc.nextDouble();
				}
				else if (opcao == 5) {
					System.out.println(raizQuadrada()); 
					System.out.print("Digite para encerrar o programa ou qualquer outro número para fazer outra conta: ");
					continuarOuNao = sc.nextDouble();
				}
				else {
					System.out.print("Digite o número no qual deseja realizar sua potenciação: ");
					double pot = sc.nextDouble();
					System.out.print("Digite o expoente:");
					double expoente = sc.nextDouble();
					double resultadoP = Math.pow(pot,expoente);
					System.out.println(resultadoP);
					System.out.print("Digite para encerrar o programa ou qualquer outro número para fazer outra conta: ");
					continuarOuNao = sc.nextDouble();
				}}while (continuarOuNao != 0);
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
	public static double raizQuadrada() throws Exception{
		Scanner sc = new Scanner(System.in);
		mostrar1();
		double raiz = sc.nextDouble();
		double resultadoR = Math.sqrt(raiz);
		return resultadoR;
	}
	public static void mostrar() {
		System.out.print("Digite um número: ");
	}
	public static void mostrar1() {
		System.out.print("Digite o número que deseja extrair a raiz quadrada: ");
	}
	public static void mostrar2() {
		System.out.print("Digite o número no qual deseja realizar sua potenciação: ");
	}
}
