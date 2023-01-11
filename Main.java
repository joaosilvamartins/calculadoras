import java.util.Scanner;
import java.util.Locale;
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
			System.out.println("Quantos números deseja somar? ");
			int numAdi;
			numAdi = sc.nextInt();
			double res0 = adicao(numAdi);
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
					System.out.println("Quantos números deseja somar? ");
					numAdi = sc.nextInt();
					res0 = adicao(numAdi);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.println("Quantos números deseja subtrair? ");
					int numSub;
					numSub = sc.nextInt();
					double res1 = sub(numSub);
					resultado(res1);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.println("Quantos números deseja multiplicar? ");
					int numMult = sc.nextInt();
					double res2 = mult(numMult);
					resultado(res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.println("Quantos números deseja dividir? ");
					int numDiv = sc.nextInt();
					double res3 = div(numDiv);
					resultado(res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
		else if (usuario == 2) {
			System.out.println("Quantos números deseja subtrair? ");
			int numSub = sc.nextInt();
			double res1 = sub(numSub);
			resultado(res1);
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
					System.out.println("Quantos números deseja somar? ");
					int numAdi;
					numAdi = sc.nextInt();
					double res0 = adicao(numAdi);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.println("Quantos números deseja subtrair? ");
					numSub = sc.nextInt();
					res1 = sub(numSub);
					resultado(res1);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.println("Quantos números deseja multiplicar? ");
					int numMult = sc.nextInt();
					double res2 = mult(numMult);
					resultado(res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.println("Quantos números deseja dividir? ");
					int numDiv = sc.nextInt();
					double res3 = div(numDiv);
					resultado(res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
		else if (usuario == 3) {
			System.out.println("Quantos números deseja multiplicar? ");
			int numMult = sc.nextInt();
			double res2 = mult(numMult);
			resultado(res2);
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
					System.out.println("Quantos números deseja somar? ");
					int numAdi;
					numAdi = sc.nextInt();
					double res0 = adicao(numAdi);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.println("Quantos números deseja subtrair? ");
					int numSub = sc.nextInt();
					double res1 = sub(numSub);
					resultado(res1);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.println("Quantos números deseja multiplicar? ");
					numMult = sc.nextInt();
					res2 = mult(numMult);
					resultado(res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.println("Quantos números deseja dividir? ");
					int numDiv = sc.nextInt();
					double res3 = div(numDiv);
					resultado(res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}
		}
		else {
			System.out.println("Quantos números deseja dividir? ");
			int numDiv = sc.nextInt();
			double res3 = div(numDiv);
			resultado(res3);
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
					System.out.println("Quantos números deseja somar? ");
					int numAdi;
					numAdi = sc.nextInt();
					double res0 = adicao(numAdi);
					resultado(res0);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 2) {
					System.out.println("Quantos números deseja subtrair? ");
					int numSub = sc.nextInt();
					double res1 = sub(numSub);
					resultado(res1);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else if (usuario == 3) {
					System.out.println("Quantos números deseja multiplicar? ");
					int numMult = sc.nextInt();
					double res2 = mult(numMult);
					resultado(res2);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
				else {
					System.out.println("Quantos números deseja dividir? ");
					numDiv = sc.nextInt();
					res3 = div(numDiv);
					resultado(res3);
					System.out.print("Digite 0 para sair ou qualquer outro número para continuar: ");
					opcao = sc.nextInt();
				}
			}}
		sc.close();
		}
		public static double adicao(int x) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		double n;
		for (int i = 0; i < x; i++) {
			mostrar();
			n = sc.nextInt();
			soma += n;
		}
		return soma;
	}
		public static double sub(int x) {
			Scanner sc = new Scanner(System.in);
			mostrar();
			double n1 = sc.nextInt();
			double sb = n1;
			double n;
			for (int i = 0; i < (x - 1); i++) {
				mostrar();
				n = sc.nextInt();
				sb -= n;
			}
			return sb;
		}
		public static double mult(int x) {
			Scanner sc = new Scanner(System.in);
			mostrar();
			double n1 = sc.nextDouble();
			double ml = n1;
			double n;
			for (int i = 0; i < (x - 1); i++) {
				mostrar();
				n = sc.nextInt();
				ml *= n;
			}
			return ml;
		}
		public static double div(int x) {
			Scanner sc = new Scanner(System.in);
			double dv = 0;
			mostrar();
			double n1 = sc.nextDouble();
			mostrar();
			double n2 = sc.nextDouble();
			double dv1 = n1/n2;
			double n;
				for (int i = 0; i < (x - 2); i++) {
					mostrar();
					n = sc.nextInt();
					dv = dv1/n;
					dv1 = dv;
			}
			return dv;
			
		}
		public static void mostrar() {
			System.out.print("Digite um número: ");
		}
		public static void resultado(double value) {
			System.out.println("Resultado = " + value);
		}
	}