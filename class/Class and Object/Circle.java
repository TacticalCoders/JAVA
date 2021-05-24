public class Circle {
	
	int radius; //클래스의 필드 부분
	String name;
	
	public Circle() {}  //생성자, 중괄호까지 꼭 입력해야함. 반환형은 입력하지 않는다.
	
	public Circle(int r, String n){ //생성자 오버로딩 
		radius = r; 
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		Circle pizza; //circle이라는 객체를 생성할 객체 레퍼런스 선언.
		pizza = new Circle(10,"도미노피자"); //Circle 객체 생성 (실제로 찍어낸 것)
		double area = pizza.getArea(); //메소드도 마찬가지로 객체레퍼런스명.메소드
		System.out.println(pizza.name+"의 면적은 "+ area);
		
		Circle donut; //circle이라는 객체를 생성할 객체 레퍼런스 선언.
		donut = new Circle(); //Circle 객체 생성 (실제로 찍어낸 것)
		donut.radius=2; //객체 필드에 접근할 때는 객체레퍼런스명.변수명 
		donut.name="던킨도넛";
		area = donut.getArea(); //메소드도 마찬가지로 객체레퍼런스명.메소드
		System.out.println(donut.name+"의 면적은 "+ area);

	}

}
