import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //이벤트 처리시에 추가해야할 코드

// 독립 클래슬 action이벤트의 리스너 작성.

public class Ex10_1_AnotherClass extends JFrame {
	
	public Ex10_1_AnotherClass() {
		
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); //배치관리자 생성해서 바로 컨텐트팬에 부여하기.
		
		JButton button = new JButton("Action");
		button.addActionListener(new MyActionListener()); //리스너 객체 생성 후 버튼 컴포넌트에 연결.
		//addActionListener는 컴포넌트와 이벤트 리스너를 연결해주는 속성이니 꼭 기억하도록 하자.
		c.add(button);
		
		setSize(350,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex10_1_AnotherClass obj = new Ex10_1_AnotherClass();
	}

}

//독립된 클래스로 이벤트 리스너 작성. 완전히 바깥에 작성해야 한다.
class MyActionListener implements ActionListener { //오류창을 클릭해 추상메소드를 구현하기를 클릭하면 쉽게 작성할 수 있다.
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) //버튼 컴포넌트의 문자열을 받아오는 메소드, getText, 문자열을 지정하는 setText
			b.setText("액션");
		else
			b.setText("Action");
	} //추상메소드를 구현하여 만듬.
}