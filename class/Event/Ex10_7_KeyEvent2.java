import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_7_KeyEvent2 extends JFrame {
	
	private JLabel la = new JLabel(); //�� �� ������Ʈ.
	
	public Ex10_7_KeyEvent2() {
		setTitle("KeyCode ���� : F1: �ʷϻ�, %:�����");
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
	
	class MyKeyListener extends KeyAdapter{ //�������̽��� �ƴ� Ű ����͸� ����ϱ⿡ �ʿ��� �޼ҵ常 �����ϸ� ��.
		public void keyPressed(KeyEvent e) { //������ ���� �̺�Ʈ �߻�.
			
			Container contentPane = (Container)e.getSource(); //���� Ű�� �Է¹޴� ������Ʈ�� ����Ʈ�� �̹Ƿ� ����Ʈ���� ����Ŵ.
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+" Ű�� �ԷµǾ���.");
			
			if(e.getKeyChar() == '5')
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) //F1�� �����ڵ� Ű�� �ƴϹǷ� Ű�ڵ��� VK_F1�� ���Ѵ�.
				contentPane.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new Ex10_7_KeyEvent2();

	}

}
