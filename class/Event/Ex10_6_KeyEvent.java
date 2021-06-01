import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_6_KeyEvent extends JFrame {
	
	private JLabel [] keyMessage; //3���� �޼����� ����� �� ������Ʈ �迭 ���۷���. Ű �����ʿ��� �����ؾ� �ϹǷ� ������ �ٱ����� ����.
	
	public Ex10_6_KeyEvent () {
		setTitle("KeyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode()");
		keyMessage[1] = new JLabel(" getKeyChar()");
		keyMessage[2] = new JLabel(" getKeyText()");
		
		//�� ���� ������Ʈ�� ����
		for(int i=0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); //������ ���̵��� ������ �Ӽ� ����.
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true); //��Ŀ���Ǿ�� Ű�Է��� �ǹǷ� ����Ʈ���� ��Ŀ�� �� �� �ֵ��� ����.
		c.requestFocus(); //����Ʈ�ҿ� ������ ��Ŀ�� ����. -> Ű�Է� ����.
		
	}
	
	class MyKeyListener extends KeyAdapter{ //�������̽��� �ƴ� Ű ����͸� ����ϱ⿡ �ʿ��� �޼ҵ常 �����ϸ� ��.
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); //Ű �ڵ� �˾Ƴ���
			char keychar = e.getKeyChar(); // Ű ���ڰ� �˾Ƴ���
			
			keyMessage[0].setText(Integer.toString(keyCode));//Ű �ڵ带 ���ڿ��� ��ȯ�Ͽ� 'Ű�� �ڵ尪'�� ���.
			keyMessage[1].setText(Character.toString(keychar));  //'Ű ���ڰ�' , �����ڵ� ����.
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // 'Ű �̸� ����'
			
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
