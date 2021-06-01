import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_5_MouseAdapter extends JFrame {
	
	private JLabel la = new JLabel("Hello");
	
	public Ex10_5_MouseAdapter() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//����Ʈ�ҿ� ���콺 ������ �߰�, ���콺 �����ʴ� ����Ŭ������ �Ʒ��� �ۼ�.
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null); //la�� ��ġ�� ũ�⸦ ���� �����ϱ� ����
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
	}
	
	//�߻�޼ҵ�� ��� �޼ҵ带 �����ؾ� �ϴ� �ݸ� ����� �̿��� �����ʹ� Ư�� �޼ҵ常 �����ϸ� �Ǿ� �������� ����, �δ㵵 ���� �ȴ�.
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
