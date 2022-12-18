import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome; 
		String atingiuMedia; 
		String alcancouFrequencia; 
	    String a;
	    boolean m;
	    boolean f;
	   
		
		nome = JOptionPane.showInputDialog("digite seu nome :");
				atingiuMedia = JOptionPane.showInputDialog("voce antigiu a media?(sim/nao)");
						alcancouFrequencia = JOptionPane.showInputDialog("voce allcancou sua frequencia (sim/nao)");
					
						

		JOptionPane.showMessageDialog(null, "Nome" + nome );
		JOptionPane.showMessageDialog(null, "antingiu media?" + atingiuMedia);
		JOptionPane.showMessageDialog(null, "alcancou frequencia ?" + alcancouFrequencia );
	}

}
