public class Book {

	String title;
	String author;
	
	void show() { System.out.println(title + " " + author);}
	
	public Book() {
		this("",""); //같은 클래스 내의 다른 생성자 호출. 맨 첫번째 줄에 있어야 함.
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		this(title,"작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title; //매개변수의 이름과 멤버 변수의 이름이 같을 때 this. 사용
		this.author = author;
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptybook = new Book();
		loveStory.show();

	}

}
