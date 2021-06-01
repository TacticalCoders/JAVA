import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomNumber extends JFrame {
	
	int RandNum;
	JLabel result = new JLabel();  //난수 발생 결과를 출력할 라벨.
	
	public RandomNumber() {
		
		setTitle("난수 발생 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel message = new JLabel("아래 버튼을 클릭하세요");
		message.setSize(150,20);
		message.setLocation(130, 150);
		c.add(message);
		
		result.setSize(150,150);
		result.setLocation(180, 200);
		c.add(result);
		
		JButton button = new JButton("랜덤 수 뽑기");
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
			Component com = (Component)e.getSource(); //마우스가 올라간 컴포넌트 알아냄.
			com.setBackground(Color.GRAY);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //마우스가 올라간 컴포넌트 알아냄.
			com.setBackground(null);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //마우스가 올라간 컴포넌트 알아냄.
			com.setBackground(Color.GRAY);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component com = (Component)e.getSource(); //마우스가 올라간 컴포넌트 알아냄.
			com.setBackground(null);
			
		}
		
		
	}

	public static void main(String[] args) {
		new RandomNumber();
	}

}
