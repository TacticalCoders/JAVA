// 배열이나 나열의 크기만큼 루프를 돌면서 각 원소를 '순차적'으로 접근하는데 유용하도록 만든 for문.
public class foreachEx {

	enum Week {월, 화, 수, 목, 금, 토, 일} //나열 타입 enum
	
	public static void main(String[] args) {


		int n[] = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"}; //배열 레퍼런스 변수 선언과 동시에 배열 할당.
		int sum = 0;
		
		for(int k : n) { //변수 : 배열 레퍼런스 (자료형이 일치해야 함)
			System.out.print(k + " ");
			sum += k; //여기서 k는 순차적인 배열의 요소를 의미한다.
		}
		System.out.println("합은" + sum);
		
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) //이 메소드는 기억해두자!!!
			System.out.print(day + "요일 ");
		System.out.println();
		
	}
}
