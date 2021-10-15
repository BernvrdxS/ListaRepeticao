import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
       
	   	
	   	int num1 = 1;
	   	int num2 = 0;
        
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
	   	entrada.close();
	}

}
