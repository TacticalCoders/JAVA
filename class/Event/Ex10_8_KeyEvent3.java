import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_8_KeyEvent3 extends JFrame {
	
	private final int FLYING_UNIT = 10; //���� ������ ���� - 10�ȼ�
	private JLabel la = new JLabel("hello");
	
	public Ex10_8_KeyEvent3() {
		
		setTitle("��,��,��,�� Ű�� �̿��Ͽ� �ؽ�Ʈ �����̱�");
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
		
		c.addMouseListener(new MouseAdapter() { //�͸� Ŭ������ ���콺 ����� �ۼ�. �ڵ尡 ���� �����ϱ� ����.
			public void keyPressed(KeyEvent e) {
				Component com = (Component)e.getSource(); //���콺�� Ŭ���� ������Ʈ
				com.setFocusable(true); //� ������Ʈ�� ���� �𸣴� �ӽú����� ��Ŀ�� ����.
				com.requestFocus();
			}
		});
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) { //k�� �ҹ����̴�!!
			int keyCode = e.getKeyCode(); //�Էµ� Ű�ڵ� �˾Ƴ���.
			
			switch(keyCode) {
				case KeyEvent.VK_UP: la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break; //x�� �״��, y�� ����(-�� ����)
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
