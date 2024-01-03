import java.util.Scanner;

//A triangle is valid if sum of two sides are greater than the third side.
public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three sides of Triangle: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean valid = false;
		if(a+b>c || b+c>a || a+c>b) {
			valid = true;
		}
		
		if(valid) {
			System.out.println("Triangle is valid");
		}else {
			System.out.println("Triangle is invalid");
		}
	}

}
