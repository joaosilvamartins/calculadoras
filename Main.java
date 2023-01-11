import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int usuario;
		System.out.println("Digite 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão:");
		usuario = sc.nextInt();
		if (usuario == 1){
			System.out.print("Digite o primeiro número: ");
			double n1 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n2 = sc.nextDouble();
			double res0 = adicao(n1, n2);
			resultado(res0);
		}
		else if (usuario == 2) {
			System.out.print("Digite o primeiro número: ");
			double n3 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n4 = sc.nextDouble();
			double res2 = sub(n3, n4);
			resultado (res2);
		}
		else if (usuario == 3) {
			System.out.print("Digite o primeiro número: ");
			double n5 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n6 = sc.nextDouble();
			double res3 = mult(n5, n6);
			resultado (res3);
		}
		else if (usuario == 4) {
			System.out.print("Digite o primeiro número: ");
			double n7 = sc.nextDouble();
			System.out.print("Agora digite o segundo número: ");
			double n8 = sc.nextDouble();
			double res4 = div(n7, n8);
			resultado (res4);
		}
		else {
			System.out.println("Opção inválida, tente novamente: ");
			System.out.println("Escolha 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão:");
			do{
				usuario = sc.nextInt();
				if (usuario == 1) {
					System.out.print("Digite o primeiro número: ");
					double a = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double b = sc.nextDouble();
					double ad = adicao(a, b);
					resultado(ad);
				}
				if (usuario == 2) {
					System.out.print("Digite o primeiro número: ");
					double c = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double d = sc.nextDouble();
					double s = sub(c, d);
					resultado (s);
				}
				if (usuario == 3) {
					System.out.print("Digite o primeiro número: ");
					double e = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double f = sc.nextDouble();
					double m = mult(e, f);
					resultado (m);
				}
				if (usuario == 4) {
					System.out.print("Digite o primeiro número: ");
					double g = sc.nextDouble();
					System.out.print("Agora digite o segundo número: ");
					double h = sc.nextDouble();
					double di = div(g, h);
					resultado (di);
				}
				else {
					System.out.println("Opção inválida, tente novamente: ");
					System.out.println("Escolha 1 para adição, 2 para subtração, 3 para multiplicação ou 4 para divisão:");
			}
			}while(usuario > 4 || usuario < 1);
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