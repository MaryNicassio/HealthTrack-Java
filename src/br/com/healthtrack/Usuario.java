package br.com.healthtrack;

public class Usuario {
	protected String nome;
	protected String dataNascimento;
	protected int idade;
	protected float altura;
	protected float pesoInicial;
	protected String endereco;
	protected String emailLogin;
	protected String senha;
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getDataNascimento() {
		return dataNascimento;
	}
	protected void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	protected float getAltura() {
		return altura;
	}
	protected void setAltura(float altura) {
		this.altura = altura;
	}
	protected float getPesoInicial() {
		return pesoInicial;
	}
	protected void setPesoInicial(float pesoInicial) {
		this.pesoInicial = pesoInicial;
	}
	protected String getEndereco() {
		return endereco;
	}
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected String getEmailLogin() {
		return emailLogin;
	}
	protected void setEmailLogin(String emailLogin) {
		this.emailLogin = emailLogin;
	}
	protected String getSenha() {
		return senha;
	}
	protected void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
