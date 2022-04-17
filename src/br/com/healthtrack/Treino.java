package br.com.healthtrack;

public class Treino {
	protected float duracao;
	protected int quantExercicio;
	protected String descricao;
	protected String nomeTreino;
	protected int repeticaoTreino;
	protected float getDuracao() {
		return duracao;
	}
	protected void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	protected int getQuantExercicio() {
		return quantExercicio;
	}
	protected void setQuantExercicio(int quantExercicio) {
		this.quantExercicio = quantExercicio;
	}
	protected String getDescricao() {
		return descricao;
	}
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	protected String getNomeTreino() {
		return nomeTreino;
	}
	protected void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}
	protected int getRepeticaoTreino() {
		return repeticaoTreino;
	}
	protected void setRepeticaoTreino(int repeticaoTreino) {
		this.repeticaoTreino = repeticaoTreino;
	}
	
	protected static void criarTreino () {
		System.out.println("Treino criado com sucesso!");
	}
	
}
