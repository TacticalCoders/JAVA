import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Ex9_4_BorderLayout extends JFrame {
	
	public Ex9_4_BorderLayout() {
		
		setTitle("BorderLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30,20)); //���� ������ 30, ���� ������ 20.
		//BorderLayout�� ��������, ����� ������ �������� �����Ƿ� ���� �Ӽ��� �����ؾ� �Ѵ�.
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.WEST);
		c.add(new JButton("div"),BorderLayout.EAST);
		c.add(new JButton("Calculate"),BorderLayout.CENTER); 
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Ex9_4_BorderLayout obj = new Ex9_4_BorderLayout();

	}

}
