import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);

	    System.out.print("Informe seu nome de usu�rio: ");
	    String usuario = entrada.next();
	    System.out.print("Informe sua senha: ");
	    String senha = entrada.next();
	    
	    while (usuario == senha)  {
	    	System.out.println("Erro, o nome de usu�rio n�o pode ser igual a senha.");
		    System.out.print("Informe seu nome de usu�rio: ");
		    usuario = entrada.next();
		    System.out.print("Informe sua senha: ");
		    senha = entrada.next();
	    }
	    entrada.close();
	}

}
