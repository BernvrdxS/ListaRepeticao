import java.util.Scanner;

public class Numero17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
	   	System.out.print("Informe um n�mero para verificar se ele � primo ou n�o: ");
	   	int num = entrada.nextInt();
	   	
	   	int contador = 0;
	   	
	   	while (contador <= num) {
	   		if (num % 2 == 1) {
	   			contador = contador + 1;
	   			System.out.println("N�mero primo!");
	   			break;
	   		}
	   		else 
	   			{
	   				System.out.println("N�mero n�o primo!");
	   				break;
	   			}
	}	   	
	   	entrada.close();
	}
}