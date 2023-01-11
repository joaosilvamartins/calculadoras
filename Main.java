import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
		int usuario;
		usuario = sc.nextInt();
		int opcao;
		while(usuario > 4 || usuario < 1) {
			System.out.println("Opção inválida, tente novamente: ");
			System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
			usuario = sc.nextInt();
		}
		
		if (usuario == 1){
			System.out.print("Digite o primeiro número: ");
			double n1 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n2 = sc.nextDouble();
			double res0 = adicao(n1, n2);
			resultado(res0);
			System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
			opcao = sc.nextInt();
			while (opcao != 0) {
				System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
				usuario = sc.nextInt();
				while(usuario > 4 || usuario < 1) {
					System.out.println("Opção inválida, tente novamente: ");
					System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
					usuario = sc.nextInt();
				}
				if (usuario == 1){
					System.out.print("Digite o primeiro número: ");
					n1 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					n2 = sc.nextDouble();
					res0 = adicao(n1, n2);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.print("Digite o primeiro número: ");
					double n3 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n4 = sc.nextDouble();
					double res2 = sub(n3, n4);
					resultado (res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.print("Digite o primeiro número: ");
					double n5 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n6 = sc.nextDouble();
					double res3 = mult(n5, n6);
					resultado (res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.print("Digite o primeiro número: ");
					double n7 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n8 = sc.nextDouble();
					double res4 = div(n7, n8);
					resultado (res4);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
		else if (usuario == 2) {
			System.out.print("Digite o primeiro número: ");
			double n3 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n4 = sc.nextDouble();
			double res2 = sub(n3, n4);
			resultado (res2);
			System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
			opcao = sc.nextInt();
			while (opcao != 0) {
				System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
				usuario = sc.nextInt();
				while(usuario > 4 || usuario < 1) {
					System.out.println("Opção inválida, tente novamente: ");
					System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
					usuario = sc.nextInt();
				}
				if (usuario == 1){
					System.out.print("Digite o primeiro número: ");
					double n1 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n2 = sc.nextDouble();
					double res0 = adicao(n1, n2);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.print("Digite o primeiro número: ");
					n3 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					n4 = sc.nextDouble();
					res2 = sub(n3, n4);
					resultado (res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.print("Digite o primeiro número: ");
					double n5 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n6 = sc.nextDouble();
					double res3 = mult(n5, n6);
					resultado (res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.print("Digite o primeiro número: ");
					double n7 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n8 = sc.nextDouble();
					double res4 = div(n7, n8);
					resultado (res4);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
		else if (usuario == 3) {
			System.out.print("Digite o primeiro número: ");
			double n5 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n6 = sc.nextDouble();
			double res3 = mult(n5, n6);
			resultado (res3);
			System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
			opcao = sc.nextInt();
			while (opcao != 0) {
				System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
				usuario = sc.nextInt();
				while(usuario > 4 || usuario < 1) {
					System.out.println("Opção inválida, tente novamente: ");
					System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
					usuario = sc.nextInt();
				}
				if (usuario == 1){
					System.out.print("Digite o primeiro número: ");
					double n1 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n2 = sc.nextDouble();
					double res0 = adicao(n1, n2);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.print("Digite o primeiro número: ");
					double n3 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n4 = sc.nextDouble();
					double res2 = sub(n3, n4);
					resultado (res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.print("Digite o primeiro número: ");
					n5 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					n6 = sc.nextDouble();
					res3 = mult(n5, n6);
					resultado (res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.print("Digite o primeiro número: ");
					double n7 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n8 = sc.nextDouble();
					double res4 = div(n7, n8);
					resultado (res4);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
		else {
			System.out.print("Digite o primeiro número: ");
			double n7 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n8 = sc.nextDouble();
			double res4 = div(n7, n8);
			resultado (res4);
			System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
			opcao = sc.nextInt();
			while (opcao != 0) {
				System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
				usuario = sc.nextInt();
				while(usuario > 4 || usuario < 1) {
					System.out.println("Opção inválida, tente novamente: ");
					System.out.print("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
					usuario = sc.nextInt();
				}
				if (usuario == 1){
					System.out.print("Digite o primeiro número: ");
					double n1 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n2 = sc.nextDouble();
					double res0 = adicao(n1, n2);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.print("Digite o primeiro número: ");
					double n3 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n4 = sc.nextDouble();
					double res2 = sub(n3, n4);
					resultado (res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.print("Digite o primeiro número: ");
					double n5 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double n6 = sc.nextDouble();
					double res3 = mult(n5, n6);
					resultado (res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.print("Digite o primeiro número: ");
					n7 = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					n8 = sc.nextDouble();
					res4 = div(n7, n8);
					resultado (res4);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
	sc.close();
	}
	
	public static double adicao(double x, double y) {
		double resultado;
		resultado = x + y;
		return resultado;
	}
	public static double sub(double x, double y) {
		double resultado;
		resultado = x - y;
		return resultado;
	}
	public static double mult(double x, double y) {
		double resultado;
		resultado = x * y;
		return resultado;
	}
	public static double div(double x, double y) {
		double resultado;
		resultado = x / y;
		return resultado;
	}
	public static void resultado(double value) {
		System.out.println("Resultado = " + value);
	}
}