import java.util.Scanner;

public class Numero32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

    	System.out.print("Insira um c�digo para representar cada cidade: ");
	    int cidCod = entrada.nextInt();
	    System.out.print("Insira o n�mero de ve�culos de passeio: ");
	    int veiculosPass = entrada.nextInt();
	    System.out.print("Insira o n�mero de acidentes com v�timas: ");
	    int acidVitimas = entrada.nextInt();	
		
		float indiceAcidente = (acidVitimas / veiculosPass);
		float maiorIndice = indiceAcidente;
		float maiorIndiceCod = cidCod;
		float menorIndice = indiceAcidente;
		float menorIndiceCod = cidCod;
		
		float soma = veiculosPass;
		
		float somaVeiculos2000 = 0;
		float divMedia2000 = 1;
		
		double mediaAcid = (soma / 5);
		
		double mediaFinal2000 = ((somaVeiculos2000 / divMedia2000)*100);
		
		if (veiculosPass < 2000) {
			somaVeiculos2000 = (somaVeiculos2000 + 1);
			divMedia2000 = (divMedia2000 + 1);
		}
		
		
		    
		    for (int i = 1; i <= 5; i++) {
		    	
		    	while (i < 5) { 
			   
		    	System.out.print("Insira um c�digo para representar cada cidade: ");
			    cidCod = entrada.nextInt();
			    System.out.print("Insira o n�mero de ve�culos de passeio: ");
			    veiculosPass = entrada.nextInt();
			    System.out.print("Insira o n�mero de acidentes com v�timas: ");
			    acidVitimas = entrada.nextInt();
		    
		    	indiceAcidente = (acidVitimas / veiculosPass);
		    	soma = soma + veiculosPass;
		    	
		    	if (indiceAcidente > maiorIndice) {
		    		maiorIndice = indiceAcidente;
		    		maiorIndiceCod = cidCod;
		    	}
		    	else 
		    		if (indiceAcidente < menorIndice) {
		    		menorIndice = indiceAcidente;
		    		menorIndiceCod = cidCod;
		    	}
		    		else 
			    		if (veiculosPass < 2000) {
			    			somaVeiculos2000 = (somaVeiculos2000 + 1);
			    			divMedia2000 = (divMedia2000 + 1);
			    			
			    	}
		    	
		    	mediaAcid = (soma / 5);
		    	mediaFinal2000 = ((somaVeiculos2000 / divMedia2000)*100);
		    	}
			    	 	
		    }
		    
		    System.out.println("O maior ind�ce de acidentes �: " +maiorIndice+ " e o c�digo da cidade �: " +maiorIndiceCod);
		    System.out.println("O menor ind�ce de acidentes �: " +menorIndice+ " e o c�digo da cidade �: " +menorIndiceCod);
		    System.out.println("A m�dia de ve�culos nas 5 cidades �: " +mediaAcid);
		    System.out.println("A m�dia de acidentes nas cidades com menos de 2000 ve�culos �: "+mediaFinal2000);
		    
		    entrada.close();
	}
}