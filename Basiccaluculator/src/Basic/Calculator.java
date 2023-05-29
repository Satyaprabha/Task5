package Basic;
import java.util.Scanner;

public class Calculator implements Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c=0; //we intiliatize only c in this case
		int operation;
		
		System.out.println("Enter A: ");
		a=getInput(sc);
		System.out.println("Enter B: ");
		b=getInput(sc);
		System.out.println(" 1) A+B\t 2) A-B\n 3) A*B\t 4) A/B");
		operation = (int)getInput(sc);
		sc.close();// close input stream
		
		switch (operation) {
		case 1:
			c = Operations.plus(a,b);
			break;
		case 2:
			c = Operations.minus(a,b);
			break;
		case 3:
			c = Operations.multiply(a,b);
			break;
		case 4:
			c = Operations.division(a,b);
			break;
		
		}
		System.out.println("RESULT: " + Math.round(c*10.0/10.0));
	
		}
		
	static double getInput(Scanner sc)	{ //we pass scanner object
		return sc.nextDouble();
		
		
	}

	}


