import java.util.Scanner;

public class MaximumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =  sc.nextInt();
		
		int greatest = Integer.MIN_VALUE;
		if(a>b && a>c) {
			greatest = a;
		}else if(b>c) {
			greatest = b;
		}else {
			greatest = c;
		}
		
		sc.close();
		System.out.println("Greatest of three numbers: "+greatest);

	}

}
