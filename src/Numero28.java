import java.util.Scanner;
public class Numero28 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadetemp = 0;
		int i = 0;
		float temperatura = 0;
		float maiortemp = 0;
		float menortemp = 0;
		float soma = 0;
		float tempmedia = 0;

		System.out.println("Informe a quantidade de temperaturas que ser�o inseridas? ");
		quantidadetemp = entrada.nextInt();

		for (i = 0; i < quantidadetemp; i++) {
			System.out.println("Insira a temperatura:");
			temperatura = entrada.nextFloat();

			if (i == 1) {
				maiortemp = temperatura;
				menortemp = temperatura;
				soma = soma + temperatura;
			} else {
				if (temperatura > maiortemp) {
					maiortemp = temperatura;
					soma = soma + temperatura;
				} else {
					menortemp = temperatura;
					soma = soma + temperatura;
				}
			}
		}
		tempmedia = soma / i;

		System.out.println("A menor temperatura informada �: " + menortemp);
		System.out.println("A maior temperatura informada �: " + maiortemp);
		System.out.println("A m�dia das temperaturas informadas foi: " + tempmedia);

		entrada.close();
	}
	
}
