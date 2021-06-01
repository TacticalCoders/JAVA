import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_3_AnonymousClass extends JFrame {
	
	public Ex10_3_AnonymousClass() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); //��ġ������ �����ؼ� �ٷ� ����Ʈ�ҿ� �ο��ϱ�.
		
		JButton button = new JButton("Action");
		
		//�͸� Ŭ������ �̿��Ͽ� ������ ����
		//�ڵ尡 ª��, �� ������Ʈ������ ����� ��� �����ϴ�. ������ �ڵ尡 �� ��� �������� ��������. 
		button.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) 
					b.setText("�׼�");
				else
					b.setText("Action");
				
				setTitle(b.getText());
			
			}
		}); 
		
		
		
		
		c.add(button);
		
		setSize(350,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Ex10_3_AnonymousClass obj = new Ex10_3_AnonymousClass();

	}

}
