import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class Ex9_2 extends JFrame {
	
	public Ex9_2 () {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); //������Ʈ���� ����Ʈ�ҿ� ������ �� �ֱ⶧���� �켱 ����Ʈ���� �޾ƾ� �Ѵ�.
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK")); //JButton�� ����Ű�� ���۷��� ���� ���� ����
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150); //set���� �����ϴ� �޼ҵ���� ����Ʈ ���� �ƴ� ���� ū �������� ���ϱ� ������ ���� �����ڸ� ����� �ʿ䰡 ����.
		setVisible(true); //setTitle,setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE),setSize(300,150),setVisible(true)�� �ϱ�����.
		
		}

	public static void main(String[] args) {
		Ex9_2 obj = new Ex9_2();
	}

}
