import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Press 1. for January\n 2.for February\n 3. for March \n 4. for April\n 5. for May]\n 6. for June\n 7.for July \n 8. for August\n 9. Septembe\n 10. October\n 11. for November and \n 12. for December");
		i=s.nextInt();
		
		switch(i)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("31 Days"); break;
		
		case 2: System.out.println("28 Days");break;
		
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("30 Days");break;
		default: System.out.println("Wrong Choice");break;
		
		}

	}

}
