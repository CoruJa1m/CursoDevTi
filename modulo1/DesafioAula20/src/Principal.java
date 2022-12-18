import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alfabeto=JOptionPane.showInputDialog(null, "digite uma letra do alfabeto ");
		switch(alfabeto) {
		
		case "a","e","i","o","u":
			JOptionPane.showMessageDialog(null, "voce digitou uma vogal");
		break;
		default:
			JOptionPane.showMessageDialog(null, "voce digitou uma consoante ");
		}

	}

}
