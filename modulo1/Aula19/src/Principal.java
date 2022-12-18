import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=5;
		switch(numero) {
			
		case 1:
			System.out.println("voce escolheu o primeiro numero !!");
			JOptionPane.showMessageDialog(null, "voce escolheu o primeiro numero !!");
			break;
		case 2:
			System.out.println("voce escolheu o segundo numero  !!");
			JOptionPane.showMessageDialog(null, "voce escolhheu oo segundo numero !!");
			break;
		default:
			System.out.println("voce escolheu o terceiro numero  !!");
			JOptionPane.showMessageDialog(null, "voce escolhheu o 3 numero !!");
			break;
		}
	}

}
