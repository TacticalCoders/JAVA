import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//���콺�� Ŭ���� ��ġ�� ���� �̵���Ű�� ���α׷�.
public class Ex10_4_MouseListener extends JFrame {
	
	private JLabel la = new JLabel("Hello");
	
	public Ex10_4_MouseListener() {
		
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//����Ʈ�ҿ� ���콺 ������ �߰�, ���콺 �����ʴ� ����Ŭ������ �Ʒ��� �ۼ�.
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null); //la�� ��ġ�� ũ�⸦ ���� �����ϱ� ����
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
		
	}
	
	//���� Ŭ������ �ۼ�, why?-> la�� ���� ��Ʈ�� �ؾ��ϱ� ����.
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override//�������� ���ΰ� �� �޼ҵ忡�� �ڵ� �߰�.
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

	public static void main(String[] args) {
		Ex10_4_MouseListener obj = new Ex10_4_MouseListener();
	}

}
