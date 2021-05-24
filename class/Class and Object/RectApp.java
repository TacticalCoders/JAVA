import java.util.Scanner;

class Rectangle { //한 파일에 클래스가 여러개 있어도 됨.(클래스 내부의 클래스는 안됨)
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
	//기본생성자 생략해도 자동으로 생성.
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //객체 레퍼런스 선언과 동시에 객체 생성. 
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 길이>>");
		rect.width = sc.nextInt();
		System.out.print("세로의 길이>>");
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 "+rect.getArea());
		sc.close();
	}

}
