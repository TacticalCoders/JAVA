import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex10_2_InnerClass extends JFrame {
	
	public Ex10_2_InnerClass() {
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
	//내부 클래스로 action 리스너를 작성한다.
	//클래스 내부에 클래스 가능?
	
	private class MyActionListener implements ActionListener { //오류창을 클릭해 추상메소드를 구현하기를 클릭하면 쉽게 작성할 수 있다.
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) 
				b.setText("액션");
			else
				b.setText("Action");
			
			Ex10_2_InnerClass.this.setTitle(b.getText());
			//내부에 작성하면 좋은 점. 
			//Ex10_2_InnerClass의 멤버나 JFrame의 멤버를 호출할 수 있음.
			//외부에 있으면 못씀.
		} 
	}
	
	

	public static void main(String[] args) {
		Ex10_2_InnerClass obj = new Ex10_2_InnerClass();

	}

}
