import java.util.Scanner;

public class Numero33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor da d�vida: ");
		float divida = entrada.nextInt();
		
		int parcela = 1;
		double juros = 1;
		
		System.out.print("Valor da d�vida: ");
		System.out.print("Valor do juros: ");
		System.out.print("Quantidade de parcelas");
		System.out.print("Valor da parcela: ");
		
		for (int i = 1; i <= 5; i++) {
			if (parcela == 1) {
				juros = 0;
			}
			else
				if (parcela == 1)  {
					parcela = 3;
				juros = juros + 0.1;	
				}
				else 
					if (parcela == 3) {
						parcela = 6;
						juros = juros + 0.15;	
					}
					else 
						if (parcela == 9) {
							parcela = 9;
							juros = juros + 0.2;	
						}
						else 
							if (parcela == 12) {
								parcela = 12;
								juros = juros + 0.25;	

							}
			
		}
			double valorjuros = (divida * juros);
			double valorparcela = (divida + valorjuros)/parcela;
			
			
	
		System.out.println("O valor da d�vida �: "+divida);
		System.out.println("O valor do juros �: "+valorjuros);
		System.out.println("A quantidade de parcelas �: "+parcela);
		System.out.println("O valor da parcela �: "+valorparcela);
		
		entrada.close();
		
		
	}

}
