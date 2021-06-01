import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_7_KeyEvent2 extends JFrame {
	
	private JLabel la = new JLabel(); //빈 라벨 컴포넌트.
	
	public Ex10_7_KeyEvent2() {
		setTitle("KeyCode 예제 : F1: 초록색, %:노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter{ //인터페이스가 아닌 키 어댑터를 사용하기에 필요한 메소드만 구현하면 됨.
		public void keyPressed(KeyEvent e) { //누르는 순간 이벤트 발생.
			
			Container contentPane = (Container)e.getSource(); //현재 키를 입력받는 컴포넌트는 컨텐트팬 이므로 컨탠트팬을 가리킴.
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+" 키가 입력되었음.");
			
			if(e.getKeyChar() == '5')
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) //F1은 유니코드 키가 아니므로 키코드인 VK_F1과 비교한다.
				contentPane.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new Ex10_7_KeyEvent2();

	}

}
