package ClinicaVeterinaria;

public abstract class Animal {
	
	//atributos de Animal: nome, tutor e valor de antendimento
	
	private String nomeDoAnimal;
	private Tutor nomeDoTutor;
	private String genero;
	
	// construtor de Animal
	
	public Animal(String nomeDoAnimal, String genero, Tutor nomeDoTutor) {
		this.nomeDoAnimal = nomeDoAnimal;
		this.genero = genero;
		this.nomeDoTutor = nomeDoTutor;
	}
	
	//métodos da classe Animal
	
	public String getNomeDoAnimal() {
		return nomeDoAnimal;
	}

	public Tutor getNomeDoTutor() {
		return nomeDoTutor;
	}

	public void setNomeDoTutor(Tutor nomeDoTutor) {
		this.nomeDoTutor = nomeDoTutor;
	}

	public String getGenero() {
		return genero;
	}

} 
