import java.time.Year;
import java.util.Scanner;

public class LeapYearWithJavaUtility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		
		Year y = Year.of(year);
		if(y.isLeap()) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
	}

}
