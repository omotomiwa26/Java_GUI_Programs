import java.util.Scanner;
public class challenge {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner tommy  = new Scanner(System.in);
		int n;
		int sum =0;
		int start=2;
		System.out.println("enter n");
		n = tommy.nextInt();
		while (start<=n) {
			sum +=start;
			if (sum>=n){
				break;
			}
			start+=2;
		}
		System.out.println("Number entered = "+n);
		System.out.println("Operation stopped when n = "+start);
		System.out.println("Sum at point n = "+start+" is "+sum);
		}
	}