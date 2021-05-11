import java.util.Scanner;

public class ExchangerateCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("보유하고 계신 통화를 입력해주세요(원/달러/유로/위안)");
		
		String moneyType1 = scanner.next(); //문자열 입력받는 법
		
		System.out.println("교환하고자 하는 통화를 입력해주세요(원/달러/유로/위안)");
		
		String moneyType2 = scanner.next(); 
		
		System.out.println("교환하고자 하는 금액를 입력해주세요"+"("+ moneyType1 +")");
		
		int amount = scanner.nextInt(); // 정수 읽기
		//1달러 대비 화폐가격을 초깃값으로 지정.
		double dollar = 1;
		double won = dollar * 1134.5;
		double euro = dollar * 0.84;
		double yuan = dollar * 6.54;
		
		double numerator=0,denominator=0;
		
		switch(moneyType1) {
			case "원": denominator = won; break;
			case "달러": denominator = dollar; break;
			case "유로": denominator = euro; break;
			case "위안":	denominator = yuan; break;
		}
		
		switch(moneyType2) {
			case "원": numerator = won; break;
			case "달러": numerator = dollar; break;
			case "유로": numerator = euro; break;
			case "위안":	numerator = yuan; break;
		}
		
		double exchangeRate =  numerator / denominator; //보유한 통화가 분모, 보유하고자 하는 통화가 분자.
		double result = amount * exchangeRate;
		
		System.out.println(amount + moneyType1 + " = " + result + moneyType2 );
		scanner.close(); 
		}
}
