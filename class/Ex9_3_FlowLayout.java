import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


public class Ex9_3_FlowLayout extends JFrame {
	
	public Ex9_3_FlowLayout() {
		
		setTitle("FlowLayout smaple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�µ���ƮŬ������۷��̼�
		Container c = getContentPane(); //����Ʈ���� �ڷ����� Container
		//���̾ƿ��� ���? -> ����Ʈ�ҿ��ٰ� �ϴ� ���̹Ƿ� ���������ڸ� �̿��ؾ�!
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//���� ����, ���� ���� 30, ���� ���� 40
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex9_3_FlowLayout();
	}

}
