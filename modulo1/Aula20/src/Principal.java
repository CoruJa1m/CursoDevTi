import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto=JOptionPane.showInputDialog("digite flamengo,banana ou brasil");
		
		switch(texto) {
		case "flamengo":
			JOptionPane.showMessageDialog(null, "voce digitou flamengo ");
			break;
		case "banana":
			JOptionPane.showMessageDialog(null, "voce digitou banana ");
			break;
		case "brasil":
			JOptionPane.showMessageDialog(null, "voce digitou brasil ");
			break;
			default :
		
				JOptionPane.showMessageDialog(null, "voce digitou outra palavra  ");
				break;
			
			
		
		
		}
	}

}
