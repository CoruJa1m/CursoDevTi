import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia=Integer.parseInt(JOptionPane.showInputDialog("digita um numero de 1 a 7 "));
		
		switch(dia){
		case 1:
			JOptionPane.showMessageDialog(null, "hoje e segunda!! ");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "hoje e terca!! ");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "hoje e quarta!! ");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "hoje e quinta!! ");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "hoje e sexta!! ");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "hoje e sabado!! ");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "hoje e domingo!! ");
			break;
		}

	}

}
