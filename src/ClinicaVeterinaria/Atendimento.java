package ClinicaVeterinaria;

public abstract class Atendimento {
	
	//atributos do atendimento
	
	private Animal nomeDoAnimal;
	private double valorDoAtendimento;
	
	//construtor do atendimento
	
	public Atendimento(Animal nomeDoAnimal, double valorDoAtendimento) {
		this.nomeDoAnimal = nomeDoAnimal;
		this.valorDoAtendimento = valorDoAtendimento;
	}
	
	//métodos do atendimento

	public Animal getNomeDoAnimal() {
		return nomeDoAnimal;
	}

	public void setNomeDoAnimal(Animal nomeDoAnimal) {
		this.nomeDoAnimal = nomeDoAnimal;
	}

	public double getValorDoAtendimento() {
		return valorDoAtendimento;
	}

	public void setValorDoAtendimento(double valorDoAtendimento) {
		this.valorDoAtendimento = valorDoAtendimento;
	}
	
	public double getTotalDoAtendimento() {
		return valorDoAtendimento;

	}

}
