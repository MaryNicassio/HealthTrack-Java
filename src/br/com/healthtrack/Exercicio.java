package br.com.healthtrack;

public class Exercicio {
	protected String nomeExercicio;
	protected int nrExercicio;
	protected float tempoDuracao;
	protected String tipoExercicio;
	protected String video;
	
	protected String getNomeExercicio() {
		return nomeExercicio;
	}

	protected void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	protected int getNrExercicio() {
		return nrExercicio;
	}

	protected void setNrExercicio(int nrExercicio) {
		this.nrExercicio = nrExercicio;
	}

	protected float getTempoDuracao() {
		return tempoDuracao;
	}

	protected void setTempoDuracao(float tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	protected String getTipoExercicio() {
		return tipoExercicio;
	}

	protected void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	protected String getVideo() {
		return video;
	}

	protected void setVideo(String video) {
		this.video = video;
	}

	protected static void criarExercicio () {
		System.out.println("Exercicio criado com sucesso!");
	}
}
