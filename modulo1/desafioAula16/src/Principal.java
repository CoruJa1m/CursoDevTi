import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		b=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		
		if(a>b) {
			JOptionPane.showMessageDialog(null, "a e maior que b ");
			
		}else {
			JOptionPane.showMessageDialog(null, "a e menor que b  ");
			
		}
		
		
		
		 
		

	}

}
