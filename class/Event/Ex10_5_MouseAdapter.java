import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_5_MouseAdapter extends JFrame {
	
	private JLabel la = new JLabel("Hello");
	
	public Ex10_5_MouseAdapter() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//컨텐트팬에 마우스 리스너 추가, 마우스 리스너는 내부클래스로 아래에 작성.
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null); //la의 위치와 크기를 직접 지정하기 위해
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
	}
	
	//추상메소드는 모든 메소드를 구현해야 하는 반면 상속을 이용한 어탭터는 특정 메소드만 구현하면 되어 가독성도 좋고, 부담도 덜게 된다.
	class MyMouseAdapter extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		Ex10_5_MouseAdapter obj = new Ex10_5_MouseAdapter();
	}

}
