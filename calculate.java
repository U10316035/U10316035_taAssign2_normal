/*U10316035
 *Lin Tz Hau
 */

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.math.*;

public class calculate extends JFrame {
	
	//objects
	circle cir;
	square squ;
	equilTriangle tri;

	/**
	
	
	space
	
	
	*/
	
	//components
	JLabel title1 = new JLabel("Circle : "); 
	JLabel title2 = new JLabel("Square : "); 
	JLabel title3 = new JLabel("Equilateral triangle : ");
	JLabel area1 = new JLabel("The area is : "); 
	JLabel area2 = new JLabel("The area is : "); 
	JLabel area3 = new JLabel("The area is : "); 
	JLabel peri1 = new JLabel("The perimeter is : "); 
	JLabel peri2 = new JLabel("The perimeter is : ");  
	JLabel peri3 = new JLabel("The perimeter is : "); 
	JLabel radius = new JLabel("Radius : "); 
	JLabel sideSquare = new JLabel("Side : "); 
	JLabel sideTriangle = new JLabel("Side : ");
	JTextField jtfRadius = new JTextField();
	JTextField jtfSideSquare = new JTextField();
	JTextField jtfSideTriangle = new JTextField();
	JTextField jtfArea1 = new JTextField();
	JTextField jtfArea2 = new JTextField();
	JTextField jtfArea3 = new JTextField();
	JTextField jtfPeri1 = new JTextField();
	JTextField jtfPeri2 = new JTextField();
	JTextField jtfPeri3 = new JTextField();
	JButton cal1 = new JButton("calculate");
	JButton cal2 = new JButton("calculate");
	JButton cal3 = new JButton("calculate");
	JButton clear1 = new JButton("clear");
	JButton clear2 = new JButton("clear");
	JButton clear3 = new JButton("clear");
	
		
	public calculate(){
		//set layout
		setLayout(null);
		
		//set circle
		title1.setBounds(0, 0, 50, 50);
		add(title1);
		
		radius.setBounds(50, 35, 50, 50);
		add(radius);
		
		area1.setBounds(50, 70, 200, 50);
		add(area1);
		
		peri1.setBounds(50, 105, 200, 50);
		add(peri1);
		
		jtfRadius.setBounds(175, 50, 100, 20);
		add(jtfRadius);
		
		jtfArea1.setBounds(175, 85, 100, 20);
		add(jtfArea1);
		
		jtfPeri1.setBounds(175, 120, 100, 20);
		add(jtfPeri1);
		
		cal1.setBounds(290, 50, 100, 20);
		add(cal1);
		
		clear1.setBounds(400, 50, 100, 20);
		add(clear1);
	
		//set square
		title2.setBounds(0, 140, 50, 50);
		add(title2);
		
		sideSquare.setBounds(50, 175, 50, 50);
		add(sideSquare);
		
		area2.setBounds(50, 210, 200, 50);
		add(area2);
		
		peri2.setBounds(50, 245, 200, 50);
		add(peri2);
		
		jtfSideSquare.setBounds(175, 190, 100, 20);
		add(jtfSideSquare);
		
		jtfArea2.setBounds(175, 225, 100, 20);
		add(jtfArea2);
		
		jtfPeri2.setBounds(175, 260, 100, 20);
		add(jtfPeri2);
		
		cal2.setBounds(290, 190, 100, 20);
		add(cal2);
		
		clear2.setBounds(400, 190, 100, 20);
		add(clear2);
		
		//set triangle
		title3.setBounds(0, 280, 150, 50);
		add(title3);
		
		sideTriangle.setBounds(50, 315, 50, 50);
		add(sideTriangle);
		
		area3.setBounds(50, 350, 200, 50);
		add(area3);
		
		peri3.setBounds(50, 385, 200, 50);
		add(peri3);
		
		jtfSideTriangle.setBounds(175, 330, 100, 20);
		add(jtfSideTriangle);
		
		jtfArea3.setBounds(175, 365, 100, 20);
		add(jtfArea3);
		
		jtfPeri3.setBounds(175, 400, 100, 20);
		add(jtfPeri3);
		
		cal3.setBounds(290, 330, 100, 20);
		add(cal3);
		
		clear3.setBounds(400, 330, 100, 20);
		add(clear3);
		
		//add listener
		cal1.addActionListener(new setCalculateCircleListoner());
		cal2.addActionListener(new setCalculateSquareListoner());
		cal3.addActionListener(new setCalculateTriangleListoner());
		clear1.addActionListener(new setClearCircleListoner());
		clear2.addActionListener(new setClearSquareListoner());
		clear3.addActionListener(new setClearTriangleListoner());
		//set editable false
		jtfArea1.setEditable(false);
		jtfArea2.setEditable(false);
		jtfArea3.setEditable(false);
		jtfPeri1.setEditable(false);
		jtfPeri2.setEditable(false);
		jtfPeri3.setEditable(false);
		
	}
	
	//listeners
	class setClearCircleListoner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			jtfRadius.setText(null);
			jtfPeri1.setText(null);
			jtfArea1.setText(null);
		}	
	}
	
	class setClearSquareListoner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			jtfSideSquare.setText(null);
			jtfPeri2.setText(null);
			jtfArea2.setText(null);
		}	
	}
	
	class setClearTriangleListoner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			jtfSideTriangle.setText(null);
			jtfPeri3.setText(null);
			jtfArea3.setText(null);
		}	
	}
	
	class setCalculateCircleListoner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				double radius = Double.parseDouble(jtfRadius.getText());
			if(radius >= 0){
				cir = new circle(Double.parseDouble(jtfRadius.getText()));
				jtfArea1.setText(cir.area());	
				jtfPeri1.setText(cir.perimeter());
			}else
				JOptionPane.showMessageDialog(null, "Input can't less than 0 !!!");
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Nothing input !!!");
			}
		}
	}
	
	class setCalculateSquareListoner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				double side = Double.parseDouble(jtfSideSquare.getText());
			if(side >= 0){
				squ = new square(Double.parseDouble(jtfSideSquare.getText()));
				jtfArea2.setText(squ.area());	
				jtfPeri2.setText(squ.perimeter());	
			}else
				JOptionPane.showMessageDialog(null, "Input can't less than 0 !!!");
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Nothing input !!!");
			}
		}
	}
	
	class setCalculateTriangleListoner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				double side = Double.parseDouble(jtfSideTriangle.getText());
			if(side >= 0){
				tri = new equilTriangle(Double.parseDouble(jtfSideTriangle.getText()));
				jtfArea3.setText(tri.area());	
				jtfPeri3.setText(tri.perimeter());	
			}else
				JOptionPane.showMessageDialog(null, "Input can't less than 0 !!!");
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Nothing input !!!");
			}
		}
	}
	//main method
	public static void main(String[] args){
		JFrame frame = new calculate();
		frame.setTitle("U10316035_GeoCalculate");
		frame.setSize(550, 500);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
//class circle to calculate area and perimeter
class circle{
	double radius;
	circle(double paraRadius){
		radius = paraRadius;
	}
	String area(){
		return String.valueOf((int)(radius * radius * Math.PI *1000 ) / 1000.0 );
	}
	String perimeter(){
		return String.valueOf((int)(2 * radius * Math.PI * 1000 ) / 1000.0 );
	}
}
//class square to calculate area and perimeter
class square{
	double side;
	square(double newSide){
		side = newSide; 
	}
	String area(){
		return String.valueOf(side * side);
	}
	String perimeter(){
		return String.valueOf(4 * side);
	}
}
//class equilTriangle to calculate area and perimeter
class equilTriangle{
	double side;
	equilTriangle(double newSide){
		side = newSide; 
	}
	String area(){
		return String.valueOf((int)((Math.pow(3, 0.5)  / 4) * side * side * 1000 ) / 1000.0 );
	}
	String perimeter(){
		return String.valueOf(3 * side);
	}
}
