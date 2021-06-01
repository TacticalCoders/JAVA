import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomNumber extends JFrame {
	
	int RandNum;
	JLabel result = new JLabel();  //���� �߻� ����� ����� ��.
	
	public RandomNumber() {
		
		setTitle("���� �߻� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel message = new JLabel("�Ʒ� ��ư�� Ŭ���ϼ���");
		message.setSize(150,20);
		message.setLocation(130, 150);
		c.add(message);
		
		result.setSize(150,150);
		result.setLocation(180, 200);
		c.add(result);
		
		JButton button = new JButton("���� �� �̱�");
		button.setSize(200,30);
		button.setLocation(90, 200);
		
		MymouseListener listener = new MymouseListener();
		button.addMouseListener(listener);
		c.add(button);
		
		
		setSize(400,500);
		setVisible(true);
		
	}
	
	class MymouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			RandNum = (int)(Math.random()*100);
			result.setText(Integer.toString(RandNum));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //���콺�� �ö� ������Ʈ �˾Ƴ�.
			com.setBackground(Color.GRAY);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //���콺�� �ö� ������Ʈ �˾Ƴ�.
			com.setBackground(null);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //���콺�� �ö� ������Ʈ �˾Ƴ�.
			com.setBackground(Color.GRAY);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //���콺�� �ö� ������Ʈ �˾Ƴ�.
			com.setBackground(null);
			
		}
		
		
	}

	public static void main(String[] args) {
		new RandomNumber();
	}

}
