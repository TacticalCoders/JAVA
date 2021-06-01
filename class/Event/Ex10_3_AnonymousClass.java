import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_3_AnonymousClass extends JFrame {
	
	public Ex10_3_AnonymousClass() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); //배치관리자 생성해서 바로 컨텐트팬에 부여하기.
		
		JButton button = new JButton("Action");
		
		//익명 클래스를 이용하여 리스너 연결
		//코드가 짧고, 한 컨포넌트에서만 사용할 경우 유용하다. 하지만 코드가 긴 경우 가독성이 떨어진다. 
		button.addActionListener(new MyActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) 
					b.setText("액션");
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
