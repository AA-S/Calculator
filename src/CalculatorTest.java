import javax.swing.JFrame;

public class CalculatorTest 
{
	public static void main(String args[])
	{
		Calculator calculator = new Calculator();
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setSize(355, 480);
		calculator.setLocation(500,100);
		calculator.setVisible(true);
		calculator.setResizable(false);
		
	}

}
