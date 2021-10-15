import java.util.Scanner;

public class Numero11v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
	   		   	
	   	int contpar = 0;
	   	int contimpar = 0;
	   	int cont = 0;
	   	int seq = 10;
	   	
	   	while (cont < seq) {
		   	System.out.print("Informe um digito: ");
		   	int num = entrada.nextInt();
	   		cont = cont + 1;
	   		if (num % 2 == 0) {
	   			contpar = contpar + 1;
	   		}
	   		else {
	   			contimpar = contimpar + 1;
	   		}
	   	}
	   	System.out.println("A quantidade de números pares é: "+contpar);
	   	System.out.println("A quantidade de números ímpares é: "+contimpar);
	   	
	   	entrada.close();
	}

}
