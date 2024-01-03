import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("Sum of first "+n+" odd numbers: "+sum);
	}

}
