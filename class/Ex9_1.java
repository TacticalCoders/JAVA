import javax.swing.*; 

public class Ex9_1 extends JFrame { //애초에 클래스를 생성할 때 super클래스를 JFrame으로 하면 편리하다.
	
	public Ex9_1() { //생성자. 객체를 생성하게 되면 창이 뜨게 된다. 
		setTitle("300*300 스윙프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex9_1 frame = new Ex9_1();
	}

}
