import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
	int intArray [] = new int[5]; // 
	int sum = 0;
	
	Scanner scanner = new Scanner(System.in); 
	System.out.println(intArray.length + "개의 정수를 입력하세요 :");
	for(int i=0 ; i<intArray.length ; i++) { //배열 레퍼런스.length -> 배열의 길이(크기)
		intArray[i] = scanner.nextInt();
		sum += intArray[i];
	}
	
	System.out.println("평균은 " + (double)sum/intArray.length);
	scanner.close();
	}
}
