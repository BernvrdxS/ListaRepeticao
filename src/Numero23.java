import java.util.Scanner;

public class Numero23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);

		
		System.out.print("Informe a quantidade de turmas: ");
	   	int quantturmas = entrada.nextInt();
	   	
	   	int soma = 0;
	   	int alunos = 0;
	   	
	   	for (int i = 0; i < quantturmas; i++) {
		   	System.out.print("Informe a quantidade de alunos: ");
		   	alunos = entrada.nextInt();
		   	soma = alunos + soma;
	   	
		   	while (alunos > 40) {
		   		System.out.println("As turmas n�o podem ter mais de 40 alunos!");		   	
		   		System.out.print("Informe uma quantidade v�lida de alunos por turma: ");
			   	alunos = entrada.nextInt();
		   		
	   	}	   	
	}
	   	double media = soma / quantturmas ;
	   	System.out.println("A m�dia de idades �: "+media);
	   	
	   	entrada.close();
}
}