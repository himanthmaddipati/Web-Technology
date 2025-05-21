import java.awt.*;
import java.awt.event.*;
public class KeyboardEventEx extends Frame implements KeyListener{
	Label l;
	TextArea area;
	KeyboardEventEx(){
		l = new Label();
		l.setBounds(20,50,100,20);
		area = new TextArea();
		area.addKeyListener(this);
		area.setBounds(20,80,300,300);
		add(l);
		add(area);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	public void keyTyped(KeyEvent e) {
		//l.setText("Key Typed");
		
	}
	public void keyPressed(KeyEvent e) {
		//l.setText("Key Pressed");
		
	}
	public void keyReleased(KeyEvent e) {
		
		String text = area.getText();
		String words[] = text.split("\\s");
		l.setText("Words: " + words.length + " Characters:" + text.length());
		
	}
	public static void main(String[] args) {
		KeyboardEventEx a = new KeyboardEventEx();
		
	}
}
