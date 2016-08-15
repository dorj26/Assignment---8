import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Press 1. for January\n 2.for February\n 3. for March \n 4. for April\n 5. for May]\n 6. for June\n 7.for July \n 8. for August\n 9. Septembe\n 10. October\n 11. for November and \n 12. for December");
		i=s.nextInt();
		
		switch(i)
		{
		case 1: System.out.println("Janaury has 31 days"); break;
		case 2: System.out.println("Febraury has 28 days"); break;
		case 3: System.out.println("March has 31 days"); break;
		case 4: System.out.println("April has 30 days"); break;
		case 5: System.out.println("May has 31 days"); break;
		case 6: System.out.println("June has 30 days"); break;
		case 7: System.out.println("July has 31 days"); break;
		case 8: System.out.println("August has 31 days"); break;
		case 9: System.out.println("September has 30 days"); break;
		case 10: System.out.println("October has 31 days"); break;
		case 11: System.out.println("November has 30 days"); break;
		case 13: System.out.println("Decemeber has 31 days"); break;
		default: System.out.println("Wrong Choice");break;
		
		}

	}

}
