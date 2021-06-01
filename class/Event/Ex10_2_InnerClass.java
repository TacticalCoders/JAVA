import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex10_2_InnerClass extends JFrame {
	
	public Ex10_2_InnerClass() {
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
	//���� Ŭ������ action �����ʸ� �ۼ��Ѵ�.
	//Ŭ���� ���ο� Ŭ���� ����?
	
	private class MyActionListener implements ActionListener { //����â�� Ŭ���� �߻�޼ҵ带 �����ϱ⸦ Ŭ���ϸ� ���� �ۼ��� �� �ִ�.
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) 
				b.setText("�׼�");
			else
				b.setText("Action");
			
			Ex10_2_InnerClass.this.setTitle(b.getText());
			//���ο� �ۼ��ϸ� ���� ��. 
			//Ex10_2_InnerClass�� ����� JFrame�� ����� ȣ���� �� ����.
			//�ܺο� ������ ����.
		} 
	}
	
	

	public static void main(String[] args) {
		Ex10_2_InnerClass obj = new Ex10_2_InnerClass();

	}

}
