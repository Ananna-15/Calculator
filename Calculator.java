package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
	
	double number, answer;
    int calculation;
    
	JFrame frame;
	JLabel label= new JLabel();
	JTextField textfield;
	JRadioButton onbutton=new JRadioButton("on");
	JRadioButton offbutton=new JRadioButton("off");
	JButton zerobutton=new JButton("0");
	JButton onebutton=new JButton("1");
	JButton twobutton=new JButton("2");
	JButton threebutton=new JButton("3");
	JButton fourbutton=new JButton("4");
	JButton fivebutton=new JButton("5");
	JButton sixbutton=new JButton("6");
	JButton sevenutton=new JButton("7");
	JButton eightbutton=new JButton("8");
	JButton ninebutton=new JButton("9");
	JButton dotbutton=new JButton(".");
	JButton clrbutton=new JButton("C");
	JButton delbutton=new JButton("Del");
	JButton eqlbutton=new JButton("=");
	JButton mulbutton=new JButton("x");
	JButton divbutton=new JButton("/");
	JButton sqrbutton=new JButton("x\u00B2");
	JButton prctbutton=new JButton("%");
	JButton sumbutton=new JButton("+");
	JButton subbutton=new JButton("-");
	JButton sqrtbutton=new JButton("\u221A");
	
	
	public Calculator() {
		GFrame();
		Addcomponents();
		addActionEvent();
	}
	
	public void GFrame() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Calculator"); 
		frame.setSize(300,450);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public void Addcomponents() {
		 label.setBounds(250, 0, 50, 50);
	     label.setForeground(Color.white);
	     frame.add(label);
		
		textfield=new JTextField();
		textfield.setBounds(10, 40, 270, 40);;
		textfield.setFont(new Font("Arial",Font.BOLD,20));
		//textfield.setEditable(false);
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textfield);
		
		onbutton.setBounds(10, 95, 60, 30);
		onbutton.setSelected(true);
		onbutton.setFont(new Font("Arial", Font.BOLD, 14));
        onbutton.setBackground(Color.darkGray);
        onbutton.setForeground(Color.white);
        frame.add(onbutton);
        
        offbutton.setBounds(10, 120, 60, 30);
		offbutton.setSelected(false);
		offbutton.setFont(new Font("Arial", Font.BOLD, 14));
        offbutton.setBackground(Color.darkGray);
        offbutton.setForeground(Color.white);
        frame.add(offbutton);
        
        ButtonGroup bg= new ButtonGroup();
        bg.add(onbutton);
        bg.add(offbutton);
        
        onebutton.setBounds(10, 160, 60, 40);
        onebutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(onebutton);
        
        twobutton.setBounds(80, 160, 60, 40);
        twobutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(twobutton);
        
        threebutton.setBounds(150, 160, 60, 40);
        threebutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(threebutton);
        
        fourbutton.setBounds(10, 210, 60, 40);
        fourbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(fourbutton);
        
        fivebutton.setBounds(80, 210, 60, 40);
        fivebutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(fivebutton);
        
        sixbutton.setBounds(150, 210, 60, 40);
        sixbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sixbutton);
        
        sevenutton.setBounds(10, 260, 60, 40);
        sevenutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sevenutton);
        
        eightbutton.setBounds(80, 260, 60, 40);
        eightbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(eightbutton);
        
        ninebutton.setBounds(150, 260, 60, 40);
        ninebutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(ninebutton);
        
        dotbutton.setBounds(150, 310, 60, 40);
        dotbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(dotbutton);
        
        zerobutton.setBounds(10, 310, 130, 40);
        zerobutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(zerobutton);
        
        eqlbutton.setBounds(220, 310, 60, 90);
        eqlbutton.setBackground(Color.YELLOW);
        eqlbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(eqlbutton);
        
        clrbutton.setBounds(80, 105, 60, 40);
        clrbutton.setBackground(Color.RED);
        clrbutton.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(clrbutton);
        
        
        delbutton.setBounds(150, 105, 60, 40);
        delbutton.setBackground(Color.RED);
        delbutton.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(delbutton);
        
        sumbutton.setBounds(220, 105,60, 40);
        sumbutton.setBackground(Color.YELLOW);
        sumbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sumbutton);
        
        subbutton.setBounds(220, 160, 60, 40);
        subbutton.setBackground(Color.YELLOW);
        subbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(subbutton);
        
        mulbutton.setBounds(220, 210, 60, 40);
        mulbutton.setBackground(Color.YELLOW);
        mulbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(mulbutton);
        
        divbutton.setBounds(220, 260, 60, 40);
        divbutton.setBackground(Color.YELLOW);
        divbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(divbutton);
        
        sqrbutton.setBounds(10, 360, 60, 40);
        sqrbutton.setBackground(Color.YELLOW);
        sqrbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sqrbutton);
        
        sqrtbutton.setBounds(80, 360, 60, 40);
        sqrtbutton.setBackground(Color.YELLOW);
        sqrtbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sqrtbutton);
        
        prctbutton.setBounds(150, 360, 60, 40);
        prctbutton.setBackground(Color.YELLOW);
        prctbutton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(prctbutton); 
        
        
     }
	
	 public void addActionEvent() {
	        //Registering ActionListener to buttons
	        onbutton.addActionListener(this);
	        offbutton.addActionListener(this);
	        clrbutton.addActionListener(this);
	        delbutton.addActionListener(this);
	        divbutton.addActionListener(this);
	        sqrtbutton.addActionListener(this);
	        sqrbutton.addActionListener(this);
	        prctbutton.addActionListener(this);
	        subbutton.addActionListener(this);
	        sevenutton.addActionListener(this);
	        eightbutton.addActionListener(this);
	        ninebutton.addActionListener(this);
	        mulbutton.addActionListener(this);
	        fourbutton.addActionListener(this);
	        fivebutton.addActionListener(this);
	        sixbutton.addActionListener(this);
	        sumbutton.addActionListener(this);
	        onebutton.addActionListener(this);
	        twobutton.addActionListener(this);
	        threebutton.addActionListener(this);
	        eqlbutton.addActionListener(this);
	        zerobutton.addActionListener(this);
	        dotbutton.addActionListener(this);
	 
	 
	    }
	  //Overriding actionPerformed() method
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        Object source = e.getSource();
	      //  double number = 0;
			//JTextComponent label = null;
			if (source == onbutton) {
	            enable();//Calling enable() function
	        } else if (source == offbutton) {
	            disable();//Calling disable function
	        } else if (source == clrbutton) {
	            //Clearing texts of label and text field
	            label.setText("");
	            textfield.setText("");
	        } else if (source == delbutton) {
	            //Setting functionality for delete button(backspace)
	            int length = textfield.getText().length();
	            int number = length - 1;
	 
	 
	            if (length > 0) {
	                StringBuilder back = new StringBuilder(textfield.getText());
	                back.deleteCharAt(number);
	                textfield.setText(back.toString());
	 
	            }
	            if (textfield.getText().endsWith("")) {
	                label.setText("");
	            }
	        } else if (source == zerobutton) {
	            if (textfield.getText().equals("0")) {
	                return;
	            } else {
	                textfield.setText(textfield.getText() + "0");
	            }
	        } else if (source == onebutton) {
	            textfield.setText(textfield.getText() + "1");
	        } else if (source == twobutton) {
	            textfield.setText(textfield.getText() + "2");
	        } else if (source == threebutton) {
	            textfield.setText(textfield.getText() + "3");
	        } else if (source == fourbutton) {
	            textfield.setText(textfield.getText() + "4");
	        } else if (source == fivebutton) {
	            textfield.setText(textfield.getText() + "5");
	        } else if (source == sixbutton) {
	            textfield.setText(textfield.getText() + "6");
	        } else if (source == sevenutton) {
	            textfield.setText(textfield.getText() + "7");
	        } else if (source == eightbutton) {
	            textfield.setText(textfield.getText() + "8");
	        } else if (source == ninebutton) {
	            textfield.setText(textfield.getText() + "9");
	        } else if (source == dotbutton) {
	            if (textfield.getText().contains(".")) {
	                return;
	            } else {
	                textfield.setText(textfield.getText() + ".");
	            }
	 
	        } else if (source == sumbutton) {
	            String str = textfield.getText();
	            number = Double.parseDouble(textfield.getText());
	            textfield.setText("");
	            label.setText(str + "+");
	            calculation = 1;
	        } else if (source == subbutton) {
	            String str = textfield.getText();
	            number = Double.parseDouble(textfield.getText());
	            textfield.setText("");
	            label.setText(str + "-");
	            calculation = 2;
	        } else if (source == mulbutton) {
	            String str = textfield.getText();
	            number = Double.parseDouble(textfield.getText());
	            textfield.setText("");
	            label.setText(str + "X");
	            calculation = 3;
	        } else if (source == divbutton) {
	            String str = textfield.getText();
	            number = Double.parseDouble(textfield.getText());
	            textfield.setText("");
	            label.setText(str + "/");
	            calculation = 4;
	        } else if (source == sqrtbutton) {
	            number = Double.parseDouble(textfield.getText());
	            Double sqrt = Math.sqrt(number);
	            textfield.setText(Double.toString(sqrt));
	 
	        } else if (source == sqrbutton) {
	            String str = textfield.getText();
	            number = Double.parseDouble(textfield.getText());
	            double square = Math.pow(number, 2);
	            String string = Double.toString(square);
	            if (string.endsWith(".0")) {
	                textfield.setText(string.replace(".0", ""));
	            } else {
	                textfield.setText(string);
	            }
	            label.setText("(sqr)" + str);
	        } else if (source == prctbutton) {
	            number = Double.parseDouble(textfield.getText());
	            double reciprocal =  number/100;
	            String string = Double.toString(reciprocal);
	            if (string.endsWith(".0")) {
	                textfield.setText(string.replace(".0", ""));
	            } else {
	                textfield.setText(string);
	            }
	        } else if (source == eqlbutton) {
	           //Setting functionality for equal(=) button
	            switch (calculation) {
	                case 1:
	                    answer = number + Double.parseDouble(textfield.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textfield.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textfield.setText(Double.toString(answer));
	                    }
	                    label.setText("");
	                    break;
	                case 2:
	                    answer = number - Double.parseDouble(textfield.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textfield.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textfield.setText(Double.toString(answer));
	                    }
	                    label.setText("");
	                    break;
	                case 3:
	                    answer = number * Double.parseDouble(textfield.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textfield.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textfield.setText(Double.toString(answer));
	                    }
	                    label.setText("");
	                    break;
	                case 4:
	                    answer = number / Double.parseDouble(textfield.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textfield.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textfield.setText(Double.toString(answer));
	                    }
	                    label.setText("");
	                    break;
	 
	            }
	        }
	 
	 
	    }
	 
	    public void enable() {
	        onbutton.setEnabled(false);
	        offbutton.setEnabled(true);
	        textfield.setEnabled(true);
	        label.setEnabled(true);
	        clrbutton.setEnabled(true);
	        delbutton.setEnabled(true);
	        divbutton.setEnabled(true);
	        sqrtbutton.setEnabled(true);
	        sqrbutton.setEnabled(true);
	        //buttonReciprocal.setEnabled(true);
	        subbutton.setEnabled(true);
	        sevenutton.setEnabled(true);
	        eightbutton.setEnabled(true);
	        ninebutton.setEnabled(true);
	        mulbutton.setEnabled(true);
	        fourbutton.setEnabled(true);
	        fivebutton.setEnabled(true);
	        sixbutton.setEnabled(true);
	        sumbutton.setEnabled(true);
	        onbutton.setEnabled(true);
	        twobutton.setEnabled(true);
	        threebutton.setEnabled(true);
	        eqlbutton.setEnabled(true);
	        zerobutton.setEnabled(true);
	        dotbutton.setEnabled(true);
	 
	    }
	 
	    public void disable() {
	        onbutton.setEnabled(true);
	        offbutton.setEnabled(false);
	        textfield.setText("");
	        label.setText(" ");
	        clrbutton.setEnabled(false);
	        delbutton.setEnabled(false);
	        divbutton.setEnabled(false);
	        sqrtbutton.setEnabled(false);
	        sqrbutton.setEnabled(false);
	        //buttonReciprocal.setEnabled(false);
	        subbutton.setEnabled(false);
	        sevenutton.setEnabled(false);
	        eightbutton.setEnabled(false);
	        ninebutton.setEnabled(false);
	        mulbutton.setEnabled(false);
	        fourbutton.setEnabled(false);
	        fivebutton.setEnabled(false);
	        sixbutton.setEnabled(false);
	        sumbutton.setEnabled(false);
	        onebutton.setEnabled(false);
	        twobutton.setEnabled(false);
	        threebutton.setEnabled(false);
	        eqlbutton.setEnabled(false);
	        zerobutton.setEnabled(false);
	        dotbutton.setEnabled(false);
	    }
	
	
	
	public static void main(String[] args) {
		
		 new Calculator();
		

	 }

}
