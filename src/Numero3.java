import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);

	    System.out.print("Informe seu nome: ");
	    String nome = entrada.next();
	    while (nome.length() < 4) {
	    System.out.println("Nome inv�lido");
	    nome = entrada.next();
	    }
	    System.out.print("Informe sua idade: ");
	    int idade = entrada.nextInt();
	    System.out.print("Informe seu sal�rio: ");
	    float salario = entrada.nextFloat();
	    System.out.print("Informe seu sexo, Feminino (f) e Masculino (m): ");
	    char sexo = entrada.next().charAt(0);
	    System.out.print("Informe seu estado civil, Solteiro (s), Casado (c), Vi�vo (v) e Divorciado (d): ");
	    char estadocivil = entrada.next().charAt(0);
	    

	    
	    System.out.println("Seu nome �: "+nome);
	    System.out.println("Sua idade �:"+idade);
	    System.out.println("Seu sal�rio �: "+salario);
	    System.out.println("Seu sexo �: "+sexo+ "Feminino (f) e Masculino (m)" );
	    System.out.println("Seu estado civil �: "+estadocivil+ "Solteiro (s), Casado (c), Vi�vo (v) e Divorciado (d)");
	    
	    entrada.close();
	}

}
