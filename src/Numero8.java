import java.util.Scanner;

public class Numero8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   	Scanner entrada = new Scanner(System.in);
			    
			   
			    System.out.print("Informe um número: ");
			    int num1 = entrada.nextInt();
			    System.out.print("Informe outro número: ");
			    int num2 = entrada.nextInt();
			    
			    for (int i = num1; i < num2; i++) {
			    System.out.println(i);
			}
			    int soma = num1 + num2;
			    System.out.println("Os números informados foram: "+num1+  " e "  +num2 );
			    System.out.println("A soma entre os dois valores informados é: "+soma);
			    
			    entrada.close();
		}
		
	}


