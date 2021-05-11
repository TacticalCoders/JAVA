import java.util.Scanner;

public class Practice1 {
	//세 수를 오름차순 정렬하는 법
	public static void AscendingOrder(int n1, int n2, int n3) { 
		int tmp;
		if (n1>n2) {
			tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
	    if(n2>n3) {
			tmp = n2;
			n2 = n3;
			n3 = tmp;
		}
		if (n1>n2) {
			tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		
		System.out.println("오름차순 정렬 후 :" + n1 +" " + n2 + " " + n3 + " ");
	}
	
	public static void main(String[] args) {
	
		System.out.println("세 정수를 하나씩 입력해주세요(엔터키 사용)");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println("입력된 정수 :" + a +" "+ b+" "+c+" ");
		AscendingOrder(a,b,c);
		
		scanner.close(); 
		
	}
}
