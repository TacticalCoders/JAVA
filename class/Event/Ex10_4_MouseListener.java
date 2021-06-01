import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//마우스를 클리한 위치로 라벨을 이동시키는 프로그램.
public class Ex10_4_MouseListener extends JFrame {
	
	private JLabel la = new JLabel("Hello");
	
	public Ex10_4_MouseListener() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		//컨텐트팬에 마우스 리스너 추가, 마우스 리스너는 내부클래스로 아래에 작성.
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null); //la의 위치와 크기를 직접 지정하기 위해
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
		
	}
	
	//내부 클래스로 작성, why?-> la를 직접 컨트롤 해야하기 때문.
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override//나머지는 냅두고 이 메소드에만 코드 추가.
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
