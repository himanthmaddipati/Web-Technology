import java.awt.*;
import java.awt.event.*;
public class MouseListExample extends Frame implements MouseMotionListener 
{
	Label l;
	Color c = Color.BLUE;
	MouseListExample(){
		l = new Label();
		l.setBounds(20,40, 100, 20);
		add(l);
		addMouseMotionListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e) {
		l.setText("X="+e.getX()+" Y="+e.getY());
		Graphics g =getGraphics();
		g.setColor(Color.red);
		g.fillOval(e.getX(), e.getY(), 20, 20);
		
	}

	public void mouseMoved(MouseEvent e) {
		l.setText("X="+e.getX()+" Y="+e.getY());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseListExample b = new MouseListExample();
	}

}
