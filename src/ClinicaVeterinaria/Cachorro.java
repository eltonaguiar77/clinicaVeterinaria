package ClinicaVeterinaria;

public class Cachorro extends Animal {
	
	// atributos de Cachorro
	
	private String morde;
	
	// construtor de Cachorro
	
	public Cachorro(String nomeDoAnimal, String genero, Tutor nomeDoTutor, String morde) {
		super(nomeDoAnimal, genero, nomeDoTutor);
		this.morde = morde;
	}
	
	// métodos de Cachorro
	
	public String podeMorder (String morde) {
		if (this.morde == "sim") {
			return "sim";
		}
		return "não";
	}
	
	public void setMorde(String morde) {
		this.morde = morde;
	}
	
	public String getMorde() {
		return this.morde;
	}

}

