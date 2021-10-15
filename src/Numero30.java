import java.util.Scanner;
public class Numero30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		

		int alto = 0;
		int baixo = 0;
		double gordo = 0;  
		double magro = 0;
		
		double maisalto = Double.MIN_VALUE;
		double maisbaixo = Double.MAX_VALUE;
		
		
		double pesototal = 0;
		double alturatotal = 0;
		
		int i=0;
		while (true) {
		    System.out.print("Insira seu código: ");
		    int codicliente = entrada.nextInt();
		    if (codicliente == 0) 
		      	break;
		   i++;	   
		   
		   System.out.print("Insira sua altura: ");
		    double altura = entrada.nextDouble();
		    System.out.print("Insira seu peso: ");
		    double peso = entrada.nextDouble();
		    pesototal = peso;
		    alturatotal = altura;
		    
		    if (peso > gordo) {
		        	gordo = codicliente;
		        		gordo = peso;
		    }
		    			if (peso < magro) {
		    				magro = codicliente;
		    					magro = peso;
		    			}
		    				if (altura > maisalto) {
		    					alto = codicliente;
		    						maisalto = altura;
		    				}
		    					if (altura < maisbaixo) {
		    						baixo = codicliente;
		    							maisbaixo = altura;
		    					}
		   
					}
		
		System.out.println("O código do cliente mais alto é: " + alto);
		System.out.println("O código do cliente mais baixo é: " + baixo);
		System.out.println("O código do cliente mais gordo é: " + gordo);
		System.out.println("O código do cliente mais magro é : " + magro);
		System.out.println("A média da altura dos clientes é: " + (alturatotal/i));
		System.out.println("A média de peso dos clientes é: " + (pesototal/i));
	
		entrada.close();
	}

}
