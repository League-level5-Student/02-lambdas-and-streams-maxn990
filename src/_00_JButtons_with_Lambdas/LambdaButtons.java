package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e)->{
			String num1 = JOptionPane.showInputDialog("Enter a number: ");
			String num2 = JOptionPane.showInputDialog("Enter a number: ");
			System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		});
		randNumber.addActionListener((e)->{
			System.out.println(new Random().nextInt());
		});
		tellAJoke.addActionListener((e)->{
			System.out.println("Why did the chicken cross the road?");
			System.out.println("No idea, this is the first joke I could come up with.");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
