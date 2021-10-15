import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Insira uma nota entre 0 e 10: ");
	    int num = entrada.nextInt();
	    
	    while ((num <= 0) || (num >= 10)) {
	    	System.out.println("Insira um valor válido");
	    }
	    entrada.close();
	}

}
