package ClinicaVeterinaria;

public class Gato extends Animal {
	
	// atributos de Gato
	
	private String arranha;
	
	// construtor de Gato
	
	public Gato(String nomeDoAnimal, String genero, Tutor nomeDoTutor, String arranha) {
		super(nomeDoAnimal, genero,nomeDoTutor);
		this.arranha = arranha;
	}
	
	// métodos de Gato
	
	public String podeArranhar (String arranha) {
		if (this.arranha == "sim") {
			return "sim";
		}
		return "não";
	}
	
	public void setArranha(String arranha) {
		this.arranha = arranha;
	}
	
	public String getArranha() {
		return this.arranha;
	}
	
}
