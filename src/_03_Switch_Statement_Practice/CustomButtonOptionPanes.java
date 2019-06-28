package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		String r = "";
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			r = "Lie in wait of tomorrow";
			break;
		case "Monday":
			r = "Hate life";
			break;
		case "Tuesday":
			r = "Be bored";
			break;
		case "Wednesday":
			r = "Halfway";
			break;
		case "Thursday":
			r = "One more day";
			break;
		case "Friday":
			r = "Celebrate";
			break;
		case "Saturday":
			r = "Weekend";
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Course of action:\n"+r);
	}
}
