import java.util.Scanner;
public class ArrayMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array [] = new int[5]; //array는 주소를 받는 '레퍼런스' 변수, new를 하지 않으면 배열은 생성되지 않는다.
		
		int max = 0; //가장 큰 수를 저장할 변수
		System.out.println("양수 5개를 입력하세요");
		for(int i = 0 ; i<5 ; i++) {
			array[i] = sc.nextInt();
			if(array[i]>max) max = array[i]; //입력과 동시에 max와 비교.
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		sc.close();
	}
}
