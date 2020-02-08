package _04_secret_message_box;

import javax.swing.JOptionPane;

public class MessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
	// 1. Set a password in a String variable
String pass="password";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String message = JOptionPane.showInputDialog(null,"What is the secret message?");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
String guess = JOptionPane.showInputDialog(null,"Guess the password, and you may see the secret message?");
	// 4. If their guess matches the password, show them the secret message
if(guess.equals(pass)) {
	JOptionPane.showMessageDialog(null, message);
}
	// 5. If the password does not match, pop-up "INTRUDER!!"
else{
	JOptionPane.showMessageDialog(null,"Intruder!");
}
}
}