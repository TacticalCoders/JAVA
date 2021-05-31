//정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력(예외처리)
import java.util.Scanner;

public class ZeroException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입력하시오");
			int dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오");
			int divisor = sc.nextInt();
			try {
				System.out.println(dividend+"를 "+ divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				//나눗수로 0이 입력된 경우 나누셈 연산시 예외 발생
				break; //예외가 발생하지 않았다면 while문 종료
			}
			catch (ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		sc.close();
	}
}
