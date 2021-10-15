import java.util.Scanner;

public class Numero24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);

	   	System.out.print("Informe a quantidade de CDs da coleção: ");
	   	int cds = entrada.nextInt();
	   	
	   	int valorcds = 0;
	   	int valortotal = 0;
	   	
	   	for (int i = 0; i < cds; i++) {
		   	System.out.print("Informe o valor de cada CD: ");
		   	valorcds = entrada.nextInt();
		   	valortotal = valorcds + valortotal;
	   	
	}
	   	double media = valortotal / cds ;
	   	System.out.println("A média de valor gasto em cada CD é: "+media);
	   	
	   	entrada.close();

}
}
