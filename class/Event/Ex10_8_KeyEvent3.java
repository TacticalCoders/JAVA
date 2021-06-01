import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_8_KeyEvent3 extends JFrame {
	
	private final int FLYING_UNIT = 10; //라벨을 움직일 단위 - 10픽셀
	private JLabel la = new JLabel("hello");
	
	public Ex10_8_KeyEvent3() {
		
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() { //익명 클래스로 마우스 어댑터 작성. 코드가 비교적 간단하기 때문.
			public void keyPressed(KeyEvent e) {
				Component com = (Component)e.getSource(); //마우스가 클릭된 컴포넌트
				com.setFocusable(true); //어떤 컴포넌트가 올지 모르니 임시변수에 포커스 설정.
				com.requestFocus();
			}
		});
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) { //k는 소문자이다!!
			int keyCode = e.getKeyCode(); //입력된 키코드 알아내기.
			
			switch(keyCode) {
				case KeyEvent.VK_UP: la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break; //x는 그대로, y만 위로(-가 위임)
				case KeyEvent.VK_DOWN: la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
				case KeyEvent.VK_LEFT: la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
				case KeyEvent.VK_RIGHT: la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;
			
			}
		}
	}

	public static void main(String[] args) {
		new Ex10_8_KeyEvent3();
	}

}
