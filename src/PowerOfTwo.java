import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		boolean powerOfTwo = true;
		for(int factor=2; factor<=num ;factor++) {
			if(factor%2==1 && num%factor==0) {//if that factor is odd number then break
				powerOfTwo = false;
				break;
			}
		}
		
		if(powerOfTwo) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
