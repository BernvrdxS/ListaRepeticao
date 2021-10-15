import java.util.Scanner;

public class Numero26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);


	   	double valorpaes = 0; 
	   	
	   	for (int i = 1; i <= 50; i++) {
	   		valorpaes = (i * 0.18);
		   	System.out.println("O valor dos pães é: "+valorpaes);
	   	}
	   	entrada.close();
	}
	}


