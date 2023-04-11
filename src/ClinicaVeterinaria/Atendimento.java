package ClinicaVeterinaria;

public abstract class Atendimento {
	
	//atributos do atendimento
	
	private Tutor nomeDoTutor;
	private Animal nomeDoAnimal;
	private double valorDaConsulta;
	
	//construtor do atendimento
	
	public Atendimento(Tutor nomeDoTutor, Animal nomeDoAnimal, double valorDaConsulta) {
		this.nomeDoTutor = nomeDoTutor;
		this.nomeDoAnimal = nomeDoAnimal;
		this.valorDaConsulta = valorDaConsulta;
	}
	
	//métodos do atendimento

	public Tutor getNomeDoTutor() {
		return nomeDoTutor;
	}

	public Animal getNomeDoAnimal() {
		return nomeDoAnimal;
	}

	public double getValorDaConsulta() {
		return valorDaConsulta;
	}

	public abstract double getValorTotalDoAtendimento();
}
