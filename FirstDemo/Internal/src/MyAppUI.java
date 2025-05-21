import java.awt.*;

public class MyAppUI extends Frame{
	Label lbTitle,lbName,lbFName,lbAge,lbGender,lbCourse,lbHobbies,lbAddress;
	TextField tfName,tfFName,tfAge;
	TextArea taAdress;
	Checkbox cbMale,cbFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice course;
	Button btnSave,btnClear;	
	
	MyAppUI()
	{
		super("User Registration Form");
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		Color c = new Color(53,59,72);
		setBackground(c);
		
		Font titleFont = new Font("Arial",Font.BOLD,25);
		Font labelFont = new Font("Arial",Font.PLAIN,18);
		Font textFont = new Font("Arial",Font.PLAIN,15);
		
		lbTitle = new Label("Registration Form");
		lbTitle.setBounds(250,40,300,50);
		lbTitle.setFont(titleFont);
		lbTitle.setForeground(Color.YELLOW);
		add(lbTitle);
		
		lbName = new Label("Name");
		lbName.setBounds(250,100,150,30);
		lbName.setFont(labelFont);
		lbName.setForeground(Color.WHITE);
		add(lbName);
		
		tfName = new TextField();
		tfName.setBounds(400,100, 400, 30);
		tfName.setFont(textFont);
		add(tfName);
		
		lbFName = new Label("Father Name");
		lbFName.setBounds(250,150,150,30);
		lbFName.setFont(labelFont);
		lbFName.setForeground(Color.WHITE);
		add(lbFName);
		
		tfFName = new TextField();
		tfFName.setBounds(400,150,400,30);
		tfFName.setFont(textFont);
		add(tfFName);
		
		lbAge = new Label("Age");
		lbAge.setBounds(250,200,150,30);
		lbAge.setForeground(Color.WHITE);
		lbAge.setFont(labelFont);
		add(lbAge);
		
		tfAge = new TextField();
		tfAge.setBounds(400,200,400,30);
		tfAge.setFont(textFont);
		add(tfAge);
		
		lbGender = new Label("Gender");
		lbGender.setBounds(250,250,150,30);
		lbGender.setFont(labelFont);
		lbGender.setForeground(Color.WHITE);
		add(lbGender);
		
		cbg = new CheckboxGroup();
		cbMale = new Checkbox("Male",cbg,true);
		cbMale.setBounds(400,250,100,30);
		cbMale.setForeground(Color.WHITE);
		cbMale.setFont(labelFont);
		add(cbMale);
		
		cbFemale = new Checkbox("Female",cbg,false);
		cbFemale.setBounds(500,250,100,30);
		cbFemale.setForeground(Color.WHITE);
		cbFemale.setFont(labelFont);
		add(cbFemale);
		
		lbCourse = new Label("Course");
		lbCourse.setBounds(250,300,150,30);
		lbCourse.setForeground(Color.WHITE);
		lbCourse.setFont(labelFont);
		add(lbCourse);
		
		course = new Choice();
		course.setFont(labelFont);
		course.setBounds(400,300,400,30);
		course.add("C");
		course.add("C++");
		course.add("Java");
		course.add("Web Developement");
		course.add("SAP");
		add(course);
		
		btnSave=new Button("Save Details");
		btnSave.setBounds(400,380,150,30);
		btnSave.setFont(labelFont);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.BLACK);
		add(btnSave);
 
		btnClear=new Button("Clear All");
		btnClear.setBounds(560,380,150,30);
		btnClear.setFont(labelFont);
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.BLACK);
		add(btnClear);
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAppUI a = new MyAppUI();
	}

}
