import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_6_KeyEvent extends JFrame {
	
	private JLabel [] keyMessage; //3개의 메세지를 출력할 라벨 컴포넌트 배열 레퍼런스. 키 리스너에서 접근해야 하므로 생성자 바깥에서 선언.
	
	public Ex10_6_KeyEvent () {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode()");
		keyMessage[1] = new JLabel(" getKeyChar()");
		keyMessage[2] = new JLabel(" getKeyText()");
		
		//각 라벨을 컴포넌트에 부착
		for(int i=0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //배경색이 보이도록 불투명 속성 설정.
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true); //포커스되어야 키입력이 되므로 컨텐트팬이 포커스 될 수 있도록 설정.
		c.requestFocus(); //컨텐트팬에 강제로 포커스 지정. -> 키입력 가능.
		
	}
	
	class MyKeyListener extends KeyAdapter{ //인터페이스가 아닌 키 어댑터를 사용하기에 필요한 메소드만 구현하면 됨.
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //키 코드 알아내기
			char keychar = e.getKeyChar(); // 키 문자값 알아내기
			
			keyMessage[0].setText(Integer.toString(keyCode));//키 코드를 문자열로 변환하여 '키의 코드값'을 출력.
			keyMessage[1].setText(Character.toString(keychar));  //'키 문자값' , 유니코드 문자.
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // '키 이름 문자'
			
			System.out.println("KeyPressed");
		}
		
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
		
	}

	public static void main(String[] args) {
		new Ex10_6_KeyEvent();

	}

}
