import java.util.Scanner;

public class Numero16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
	   	System.out.print("Informe quantos n�meros quiser: ");
	   	int num = entrada.nextInt();

	   	int maior = 0;
	   	int menor = 0;
	   	int soma = 0;
	   	
	   	for (int i = 1; i <= num ; i++) {
	   		System.out.print("Digite outro n�mero: ");
	   		int num2 = entrada.nextInt();
	   		
	   		if (i == 1) {
	   			menor = num2;
	   			maior = num2;
	   		}
	   		
	   		if (num > maior) {
	   			maior = num;
	   		}
	   		else {
	   			if (num < menor);
	   			menor = num;
	   		}
	   		soma = num2 + soma;
	   	}
	   	System.out.println("O maior n�mero foi: "+maior);
	   	System.out.println("O menor n�mero foi: "+menor);
	   	System.out.println("A soma dos n�meros �: "+soma);
	   	
	   	
	   	entrada.close();
	   		
	   	
	}

}
