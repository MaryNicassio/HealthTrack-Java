package br.com.healthtrack;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		
		Usuario usuarioUm = new Usuario();

		usuarioUm.nome = JOptionPane.showInputDialog("Qual seu nome?");
		usuarioUm.emailLogin = JOptionPane.showInputDialog("Qual seu e-mail para Login?");
		usuarioUm.dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento? (dd/mm/aaaa)");	
		usuarioUm.idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		usuarioUm.altura= Float.parseFloat(JOptionPane.showInputDialog("Qual sua altura?"));
		usuarioUm.pesoInicial= Float.parseFloat(JOptionPane.showInputDialog("Qual seu peso atual?"));
		usuarioUm.endereco = JOptionPane.showInputDialog("Qual seu endereço?");
		usuarioUm.senha = JOptionPane.showInputDialog("Cadastre sua senha:");
		
		
		System.out.println(usuarioUm.nome);
		System.out.println(usuarioUm.emailLogin);
		System.out.println(usuarioUm.dataNascimento);
		System.out.println(usuarioUm.idade);
		System.out.println(usuarioUm.altura);
		System.out.println(usuarioUm.pesoInicial);
		System.out.println(usuarioUm.endereco);
		System.out.println(usuarioUm.senha);
		JOptionPane.showConfirmDialog(null, "Seus dados estão corretos?", null, 0);		
	}
}
