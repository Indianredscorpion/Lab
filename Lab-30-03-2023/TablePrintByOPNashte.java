package loops;
import java.util.Scanner;
class oprator {
	public void Tableprint(int num) {
		for(int i =1; i<13;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}	
}

public class TablePrintByOPNashte {

	public static void main(String[] args) {
		oprator Table = new oprator();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("1)Table \n2)Exit ");
		System.out.println("Enter number  : ");
		int input =sc.nextInt();
		switch (input) {
		
		case 1 :
			
			System.out.println("Enter number  : ");
			int v =sc.nextInt();
			Table.Tableprint(v);
			break;
		case 2 :
			
			System.exit(20);
			break;
	  default :
		  System.out.println("Invalid Input !!");
		   
		
		
		}
		}while(true);
		

	}

}
