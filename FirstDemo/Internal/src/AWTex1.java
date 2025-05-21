import java.awt.*;
public class AWTex1 {

	AWTex1(){
		Frame f = new Frame();
		Label l = new Label("Employee id");
		Button b = new Button("Submit");  
		TextField t = new TextField();
		l.setBounds(20, 80, 80, 30);  
	    t.setBounds(20, 100, 80, 30);  
	    b.setBounds(100, 105, 80, 30);  
		f.add(l);
		f.add(b);
		f.add(t);
		f.setSize(400,300);
		f.setTitle("Info");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTex1 a = new AWTex1();
	}

}
