import java.util.Scanner;
public class Numero7v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe um n�mero: ");
	    int num1 = entrada.nextInt();
	    System.out.print("Informe outro n�mero: ");
	    int num2 = entrada.nextInt();
	    
	    for (int i = num1; i < num2; i++) {
	    System.out.println(i);
	}
	    System.out.println("Os n�meros informados foram: "+num1+  "e"  +num2 );
	    
	    entrada.close();
}
}