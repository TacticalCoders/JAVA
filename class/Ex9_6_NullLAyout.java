import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class Ex9_6_NullLAyout extends JFrame {
	
	public Ex9_6_NullLAyout() {
		
		setTitle("NullLAyout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null); //�� NULL�� �ϴ°�? �⺻���� ��ġ�����ڰ� �ο��Ǿ� �ֱ� ����, ���� NULL�� �� ����� �Ѵ�.
		//������Ʈ�� ��ġ�� ũ�⸦ ���� �����ϰ� ���� ���, ��ġ�����ڸ� null�� �Ѵ�.
		
		JLabel la = new JLabel("Hello, Press Buttons");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); //������ ���ڿ��� ��ȯ. b�� �߰��ϱ� ���� �ӽ� ���۷��� ����.
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Ex9_6_NullLAyout obj = new Ex9_6_NullLAyout();
	}

}
