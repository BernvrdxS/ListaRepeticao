import java.util.Scanner;

public class Numero36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int candidato4 = 0;
		int nulos5 = 0;
		int brancos6 = 0;
		float contador = 0;

		System.out.println("Digite 0 - Para finalizar o conjunto de votos");
		System.out.println("1 - Fernando Haddad;");
		System.out.println("2 - Marina Silva;");
		System.out.println("3 - Jo�o Amoedo;");
		System.out.println("4 - Guilherme Boulos;");
		System.out.println("5 - Voto nulo;");
		System.out.println("6 - Voto em branco;");

		while (true) {
			System.out.println("Digite seu voto:");
			int voto = entrada.nextInt();

			if (voto == 0)
				break;
			else
				if (voto == 1) {
					candidato1++;
					contador++;
			}
				else
					if (voto == 2) {
						candidato2++;
						contador++;
			}
					else
						if (voto == 3) {
							candidato3++;
							contador++;
			}
						else
							if (voto == 4) {
								candidato4++;
								contador++;
			}
							else
								if (voto == 5) {
									nulos5++;
									contador++;
			}
								else
									if (voto == 6) {
										brancos6++;
										contador++;
			}
		}

		System.out.println("O total de votos para cada candidato foi: ");
		System.out.println("Fernado Haddad = " +candidato1);
		System.out.println("Marina Silva = " +candidato2);
		System.out.println("Jo�o Amoedo = " +candidato3);
		System.out.println("Guilherme Boulos = " +candidato4);
		System.out.println("O total de votos nulos foi: " +nulos5);
		System.out.println("O total de votos em branco: " +brancos6);
		double percentualNulo = ((nulos5 * 100) / contador);
		double percentualBranco = ((brancos6 * 100) / contador);
		System.out.println("A porcentagem de votos nulos sobre o total de votos foi: " +percentualNulo);
		System.out.println("A porcentagem de votos em branco sobre o total de votos foi: " +percentualBranco);
		System.out.println("O conjunto total de votos foi: " +contador);
		
		entrada.close();
	}

}
