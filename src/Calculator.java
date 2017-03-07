import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame {

	/*
	 * Text Field and Button Variable Declaration
	 */

	private JTextField result;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, mult, c;
	private JButton dot, sqrt, min, plus, division, reci, equal, square;
	private JButton delete;

	public Calculator() {
		super("Calculator");
		setLayout(null);
		
		/*
		 * Menu Item of MenuBar of the Calculator
		 */

		JMenu view = new JMenu("View");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");

		JMenuBar bar = new JMenuBar();

		setJMenuBar(bar);

		bar.add(view);
		bar.add(edit);
		bar.add(help);
		bar.setLocation(40, 100);
		// edit.addSeparator();
		add(bar);
         help.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "dssfds");
				
			}
		});
          
		result = new JTextField("0");
		// result.setLayout(null);
		result.setEditable(false);
		result.setBackground(Color.WHITE);
		result.setBounds(10, 30, 325, 70);
		// result.setPreferredSize(new Dimension(800,100));
		add(result);

		// setLayout(new GridLayout(5,5));

		/*
		 * ||||||----Button addition in the JFrame----||||||
		 */

		delete = new JButton("<==");
		delete.setBounds(10, 210, 60, 30);
		add(delete);

		c = new JButton("C");
		c.setBounds(80, 210, 60, 30);
		add(c);

		square = new JButton("x^2");
		square.setBounds(285, 210, 55, 30);
		add(square);

		b1 = new JButton("1");
		b1.setBounds(10, 250, 60, 30);
		add(b1);

		b2 = new JButton("2");
		b2.setBounds(80, 250, 60, 30);
		add(b2);

		b3 = new JButton("3");
		b3.setBounds(150, 250, 60, 30);
		add(b3);

		division = new JButton("/");
		division.setBounds(220, 250, 55, 30);
		add(division);

		mult = new JButton("*");
		mult.setBounds(285, 250, 55, 30);
		add(mult);

		reci = new JButton("1/x");
		reci.setBounds(285, 290, 55, 30);
		add(reci);

		b4 = new JButton("4");
		b4.setBounds(10, 290, 60, 30);
		add(b4);

		b5 = new JButton("5");
		b5.setBounds(80, 290, 60, 30);
		add(b5);

		b6 = new JButton("6");
		b6.setBounds(150, 290, 60, 30);
		add(b6);

		plus = new JButton("+");
		plus.setBounds(220, 290, 55, 30);
		add(plus);

		b7 = new JButton("7");
		b7.setBounds(10, 330, 60, 30);
		add(b7);

		b8 = new JButton("8");
		b8.setBounds(80, 330, 60, 30);
		add(b8);

		b9 = new JButton("9");
		b9.setBounds(150, 330, 60, 30);
		add(b9);

		min = new JButton("-");
		min.setBounds(220, 330, 55, 30);
		add(min);

		b0 = new JButton("0");
		b0.setBounds(10, 370, 130, 30);
		add(b0);

		dot = new JButton(".");
		dot.setBounds(150, 370, 60, 30);
		add(dot);

		sqrt = new JButton("rt");
		sqrt.setBounds(220, 370, 55, 30);
		add(sqrt);

		equal = new JButton("=");
		equal.setBounds(285, 330, 55, 70);
		add(equal);

		ButtonHandler handler = new ButtonHandler();
		b0.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		mult.addActionListener(handler);
		division.addActionListener(handler);
		plus.addActionListener(handler);
		min.addActionListener(handler);
		reci.addActionListener(handler);
		dot.addActionListener(handler);
		equal.addActionListener(handler);
		c.addActionListener(handler);
		sqrt.addActionListener(handler);
		square.addActionListener(handler);
		delete.addActionListener(handler);
	}

	private class ButtonHandler implements ActionListener {
		private String string = "";
		private char c;

		private double finalResult = 0, plusResult = 0, minusResult,
				divisionResult;
		private double multipleResult, sqrtResult, reciprocalResult;

		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getActionCommand().equals("0")) {
				string = string + "0";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("1")) {
				string = string + "1";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("2")) {
				string = string + "2";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("3")) {
				string = string + "3";
				System.out.print(string);
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("4")) {
				string = string + "4";
				result.setText(string);

			}

			else if (arg0.getActionCommand().equals("5")) {
				string = string + "5";
				result.setText(string);

			}

			else if (arg0.getActionCommand().equals("6")) {
				string = string + "6";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("7")) {
				string = string + "7";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("8")) {
				string = string + "8";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("9")) {
				string = string + "9";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals(".")) {
				string = string + ".";
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("+")) {
				// string = string + "+";
				c = '+';
				plusResult = plusResult + Double.parseDouble(string);
				//finalResult = finalResult+plusResult;
				result.setText("+");
				string = "";
			}

			else if (arg0.getActionCommand().equals("-")) {
				if (string == "") {
					string = "-";
					result.setText("-");
				}

				else {
					c = '-';
					minusResult = Double.parseDouble(string);
					result.setText("-");
					string = "";
				}

			}

			else if (arg0.getActionCommand().equals("*")) {
				c = '*';
				multipleResult = Double.parseDouble(string);

				result.setText("*");
				string = "";
			}

			else if (arg0.getActionCommand().equals("/")) {
				c = '/';
				divisionResult = Double.parseDouble(string);
				result.setText("/");
				string = "";
			}

			else if (arg0.getActionCommand().equals("1/x")) {
				finalResult = 1 / Double.parseDouble(string);
				string = String.format("%.2f", finalResult);
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("<==")) {
				int l = string.length();
				if(string !="")
				string = string.substring(0, l-1);
				if(string ==null)
					result.setText("0");
				else
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("x^2")) {
				finalResult = Math.pow(Double.parseDouble(string), 2);
				string = String.format("%.2f", finalResult);
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("rt")) {
				finalResult = Math.sqrt(Double.parseDouble(string));
				string = String.format("%.2f", finalResult);
				result.setText(string);
			}

			else if (arg0.getActionCommand().equals("C")) {
				string = "";
				result.setText(string + "0");
			}

			else if (arg0.getActionCommand().equals("=")) {
				if (c == '+')
					finalResult = plusResult + Double.parseDouble(string);

				else if (c == '-')
					finalResult = minusResult - Double.parseDouble(string);

				else if (c == '/')
					finalResult = divisionResult / Double.parseDouble(string);

				else if (c == '*')
					finalResult = multipleResult * Double.parseDouble(string);

				// System.out.print(finalResult);
				//String s;
				string = String.format("%.2f", finalResult);
				result.setText(string);
				 //string = "";
			}

			else
				System.out.print(string);

		}
	}

}
