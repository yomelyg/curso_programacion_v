import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner.*;
public class LeerNumeroEntero {
	
	public static void main(String[] args){
		Scanner C = new Scanner(System.in);
		
		int n;
		
	do{
		try{
	
		System.out.println("Introduce un número entero: "); 
        n = C.nextInt();
        System.out.println(+ n);
		}catch(InputMismatchException e) {
			C.nextLine();
			n = 0;
			System.out.println("Debe introducir un número entero " + e.toString());
		}
	}while(n<=0);
	}
}
	
