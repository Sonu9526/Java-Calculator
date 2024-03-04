import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	    JFrame jf;
	    JLabel displayLAbel;
	    JButton sevenBtn;
	    JButton eightBtn;
	    JButton nineBtn;
	    JButton fourBtn;
	    JButton fiveBtn;
	    JButton sixBtn;
	    JButton threeBtn;
	    JButton twoBtn;
	    JButton oneBtn;
	    JButton dotBtn;
	    JButton zeroBtn;
	    JButton equalBtn;
	    JButton divBtn;
	    JButton mulBtn;
	    JButton substractionBtn;
	    JButton addBtn;
	    JButton clearBtn;
	    boolean isOperatorClicked=false;
	    String oldValue;
	    String operator;
	    
	    
	    
	   public Calculator() {
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		
		displayLAbel = new JLabel();
		displayLAbel.setBounds(30,30,540,70);
		displayLAbel.setFont(new Font("Arial", Font.PLAIN, 35));
		jf.add(displayLAbel);
		displayLAbel.setBackground(Color.GRAY);
		displayLAbel.setOpaque(true);
		jf.setLocation(400,150);
		displayLAbel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLAbel.setForeground(Color.white);
		
		sevenBtn =new JButton("7");	
		sevenBtn.setBounds(30,130,80,80);
		sevenBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenBtn.addActionListener(this);
		jf.add(sevenBtn);
		
		eightBtn =new JButton("8");	
		eightBtn.setBounds(130,130,80,80);
		eightBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		eightBtn.addActionListener(this);
		jf.add(eightBtn);
		
		nineBtn =new JButton("9");	
		nineBtn.setBounds(230,130,80,80);
		nineBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		nineBtn.addActionListener(this);
		
		

		jf.add(nineBtn);
		
		
		fourBtn =new JButton("4");	
		fourBtn.setBounds(30,230,80,80);
		fourBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		fourBtn.addActionListener(this);
		jf.add(fourBtn);
		
	    fiveBtn =new JButton("5");	
		fiveBtn.setBounds(130,230,80,80);
		fiveBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveBtn.addActionListener(this);
		jf.add(fiveBtn);
		
		sixBtn =new JButton("6");	
		sixBtn.setBounds(230,230,80,80);
		sixBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		sixBtn.addActionListener(this);
		jf.add(sixBtn);
		
		
		threeBtn =new JButton("3");	
		threeBtn.setBounds(30,330,80,80);
		threeBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		threeBtn.addActionListener(this);
		jf.add(threeBtn);
		
		twoBtn =new JButton("2");	
		twoBtn.setBounds(130,330,80,80);
		twoBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		twoBtn.addActionListener(this);
		jf.add(twoBtn);
		
		oneBtn =new JButton("1");	
		oneBtn.setBounds(230,330,80,80);
		oneBtn.setFont(new Font("Arial", Font.PLAIN, 40));
		oneBtn.addActionListener(this);
		
		jf.add(oneBtn);
		
		
		dotBtn =new JButton(".");	
		dotBtn.setBounds(30,430,80,80);
		dotBtn.setFont(new Font("Arial", Font.PLAIN, 25));
		dotBtn.addActionListener(this);
		jf.add(dotBtn);
		
		zeroBtn =new JButton("0");	
		zeroBtn.setBounds(130,430,80,80);
		zeroBtn.setFont(new Font("Arial", Font.PLAIN, 25));
		zeroBtn.addActionListener(this);
		jf.add(zeroBtn);
		
		equalBtn =new JButton("=");	
		equalBtn.setBounds(230,430,80,80);
		equalBtn.setFont(new Font("Arial", Font.PLAIN, 25));
		equalBtn.addActionListener(this);
		jf.add(equalBtn);

		divBtn =new JButton("/");	
	    divBtn.setBounds(330,130,80,80);
	    divBtn.setFont(new Font("Arial", Font.PLAIN, 25));
	    divBtn.addActionListener(this);
		jf.add(divBtn);
		
		mulBtn =new JButton("X");	
	    mulBtn.setBounds(330,230,80,80);
	    mulBtn.setFont(new Font("Arial", Font.PLAIN, 25));
	    mulBtn.addActionListener(this);
		jf.add(mulBtn);
		
		substractionBtn =new JButton("-");	
	    substractionBtn.setBounds(330,330,80,80);
	    substractionBtn.setFont(new Font("Arial", Font.PLAIN, 25));
	    substractionBtn.addActionListener(this);
		jf.add(substractionBtn);
		
		addBtn =new JButton("+");	
	    addBtn.setBounds(330,430,80,80);
	    addBtn.setFont(new Font("Arial", Font.PLAIN, 25));
	    addBtn.addActionListener(this);
		jf.add(addBtn);
		
		clearBtn =new JButton("Clear");	
	    clearBtn.setBounds(430,430,80,80);
	    clearBtn.setFont(new Font("Arial", Font.PLAIN, 25));
	    clearBtn.addActionListener(this);
		jf.add(clearBtn);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		public static void main(String[] args) {
			new Calculator();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() ==sevenBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("7");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"7");
				}
			}
			
			else if(e.getSource()==eightBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("8");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"8");
				}
				}
			
			
			else if(e.getSource()==nineBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("9");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"9");
				}
			}
			
			
			else if(e.getSource()==fourBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("4");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"4");
				}
			}
			
			
			
			else if(e.getSource()==fiveBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("5");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"5");
				}
			}
			
			
			
			else if(e.getSource()==sixBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("6");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"6");
				}
			}
			
			
			
			else if(e.getSource()==threeBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("3");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"3");
				}
			}
			
			
			
			else if(e.getSource()==twoBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("2");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"2");
				}
			}
			
			
			
			else if(e.getSource()==oneBtn)
			{
				if(isOperatorClicked) {
					displayLAbel.setText("1");
					isOperatorClicked=false;
				}else
				{
				displayLAbel.setText(displayLAbel.getText()+"1");
				}
			}
			
			
			else if(e.getSource()==zeroBtn)
			{
				displayLAbel.setText(displayLAbel.getText()+"0");
			}
			
			
			else if(e.getSource()==divBtn)
			{
				isOperatorClicked=true;
				oldValue=displayLAbel.getText();
				operator="/";
			}
			
			
			else if(e.getSource()==mulBtn)
			{
				isOperatorClicked=true;
				oldValue=displayLAbel.getText();
				operator="x";
			}
			
			
			else if(e.getSource()==addBtn)
			{
				isOperatorClicked=true;
				oldValue=displayLAbel.getText();
				operator="+";
			}
			
			
			else if(e.getSource()==substractionBtn)
				
			{
				isOperatorClicked=true;
				oldValue=displayLAbel.getText();
				operator="-";
			}
			
			
			else if(e.getSource()==dotBtn)
			{
				displayLAbel.setText(displayLAbel.getText()+".");
			}
			else if(e.getSource()==equalBtn)
			{
				String newValue=displayLAbel.getText();
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				

	            float result;
	            if (operator == "+") {
	                result = oldValueF + newValueF;
	                displayLAbel.setText(result+"");
	            } else if (operator == "-") {
	                result = oldValueF - newValueF;
	                displayLAbel.setText(result+"");
	            } else if (operator == "x") {
	                result = oldValueF * newValueF;
	                displayLAbel.setText(result+"");
	            } else if (operator == "/") {
	                result = oldValueF / newValueF;
	                displayLAbel.setText(result+"");
	            }
	            
	            
				
				
				
			}
			else if(e.getSource()==clearBtn)
			{
				displayLAbel.setText(" ");
			}
			
			
		}
	
}
