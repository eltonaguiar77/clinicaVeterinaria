package ClinicaVeterinaria;

public class Tutor {
	
	//atributos classe Tutor
	
	private String nomeDoTutor;
	private Animal nomeDoAnimal;
	
	//construtor Tutor
	
	public void Tutor(String nomeDoTutor) {
		this.nomeDoTutor = nomeDoTutor;
	}

	//métodos classe Tutor
	
	public String getNomeDoTutor() {
		return nomeDoTutor;
	}

	public void setNomeDoTutor(String nomeDoTutor) {
		this.nomeDoTutor = nomeDoTutor;
	}

	public Animal getNomeDoAnimal() {
		return nomeDoAnimal;
	}

	public void setNomeDoAnimal(Animal nomeDoAnimal) {
		this.nomeDoAnimal = nomeDoAnimal;
	}
	
}
