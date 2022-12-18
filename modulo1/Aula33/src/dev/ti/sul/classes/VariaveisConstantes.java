package dev.ti.sul.classes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VariaveisConstantes {

	public static void main(String[] args) {
		
		String nomeAnimal= " cachorro";
		int idade;
		double media ;
		
		nomeAnimal= JOptionPane.showInputDialog("digite o anmal ");
		JOptionPane.showMessageDialog(null, "o animal e :" + nomeAnimal );
		
		System.out.println("digite o nome:  ");
		Scanner scanner=new Scanner(System.in);
		nomeAnimal=scanner.next();
		System.out.println("o nome do animal e :" + nomeAnimal);
		
	}

}
