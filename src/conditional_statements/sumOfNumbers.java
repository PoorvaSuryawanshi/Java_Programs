package conditional_statements;
import java.util.*;

public class sumOfNumbers {
	
	int sum;
	int num;
	int arr[] = new int[10];
	
	public void acceptNumbers(int numOfInputs) {
		
		
		for(int i=0;i<numOfInputs;i++) {
		
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter number");
		
		 arr[i] = inputNum.nextInt();
		
		}
	}
	public void calculateSum() {
		
		for(int i=0; i < arr.length;i++) {
			
			sum = sum + arr[i];
		}
		
		System.out.println("Total sum=" + sum);
	}
	
	public static void main(String[] args) {
		
		sumOfNumbers s1 = new sumOfNumbers();

		Scanner numOfInputs = new Scanner(System.in);
		
		System.out.println("How many numbers addtion you want?");
		
		s1.acceptNumbers(numOfInputs.nextInt());
		s1.calculateSum();
		
	}

}


