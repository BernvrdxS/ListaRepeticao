import java.util.Scanner;

public class Numero31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int alto = 0;
		int baixo = 0;
		int maisalto = 0;
		int maisbaixo = 0;
		int altura = 0;
		int numrep = 0;
		
		    
		    for (int i = 1; i <= 10; i++) {
			   
		    	System.out.print("Insira um n�mero para representar cada aluno: ");
			    numrep = entrada.nextInt();
			  		    
			   System.out.print("Insira sua altura, em cent�metros. Ex: 179cm (1,79m): ");
			    altura = entrada.nextInt();
		    
			if (altura > maisalto) {
				alto = numrep;
					maisalto = altura;
			}
			else 	
				if (altura < maisbaixo) {
					baixo = numrep;
						maisbaixo = altura;
				}
		   
			System.out.println("O n�mero que representa o aluno mais alto �: " +numrep+ "e sua altura �: " +maisalto);
			System.out.println("O n�mero que representa o aluno mais baixo �: " +numrep+ "e sua altura �: " +maisbaixo);
			

		    }
			
			
			entrada.close();
	}
}