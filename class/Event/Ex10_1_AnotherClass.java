import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //�̺�Ʈ ó���ÿ� �߰��ؾ��� �ڵ�

// ���� Ŭ���� action�̺�Ʈ�� ������ �ۼ�.

public class Ex10_1_AnotherClass extends JFrame {
	
	public Ex10_1_AnotherClass() {
		
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); //��ġ������ �����ؼ� �ٷ� ����Ʈ�ҿ� �ο��ϱ�.
		
		JButton button = new JButton("Action");
		button.addActionListener(new MyActionListener()); //������ ��ü ���� �� ��ư ������Ʈ�� ����.
		//addActionListener�� ������Ʈ�� �̺�Ʈ �����ʸ� �������ִ� �Ӽ��̴� �� ����ϵ��� ����.
		c.add(button);
		
		setSize(350,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex10_1_AnotherClass obj = new Ex10_1_AnotherClass();
	}

}

//������ Ŭ������ �̺�Ʈ ������ �ۼ�. ������ �ٱ��� �ۼ��ؾ� �Ѵ�.
class MyActionListener implements ActionListener { //����â�� Ŭ���� �߻�޼ҵ带 �����ϱ⸦ Ŭ���ϸ� ���� �ۼ��� �� �ִ�.
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) //��ư ������Ʈ�� ���ڿ��� �޾ƿ��� �޼ҵ�, getText, ���ڿ��� �����ϴ� setText
			b.setText("�׼�");
		else
			b.setText("Action");
	} //�߻�޼ҵ带 �����Ͽ� ����.
}