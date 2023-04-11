package ClinicaVeterinaria;

public abstract class Animal {
	
	//atributos de Animal: nome, gênero e tutor
	
	private String nomeDoAnimal;
	private String genero;
	private Tutor nomeDoTutor;
	
	
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

	public String getGenero() {
		return genero;
	}

} 
