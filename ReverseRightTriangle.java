
import java.util.Scanner;
public class ReverseRightTriangle {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows:");
		n = sc.nextInt();
		for(int i = 1;i <= n; i++) {
			for(int j = 1 ;j <= n-i+1 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
	
}

