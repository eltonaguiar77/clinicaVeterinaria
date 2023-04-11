package ClinicaVeterinaria;

import java.util.ArrayList;

public class Tutor implements Imprimir {
	
	//atributos classe Tutor
	
	private String nomeDoTutor;
	private ArrayList<Animal> pets;
	private Consulta consulta;
	
	//construtor Tutor
	
	public Tutor(String nomeDoTutor) {
		this.nomeDoTutor = nomeDoTutor;
		pets = new ArrayList<Animal>();
	}

	//métodos classe Tutor
	
	public String getNomeDoTutor() {
		return nomeDoTutor;
	}
	
	public void setPet(Animal animal) {
		pets.add(animal);
	}
	
	public void getPet() {
		for (Animal p : pets) {
			System.out.println(p.getNomeDoAnimal());
		}
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	@Override
	public void imprimir(Consulta consulta) {
		this.consulta = consulta;
		if(consulta.getNomeDoTutor().getNomeDoTutor() == this.nomeDoTutor) {
			System.out.println("Animal atendido: " + consulta.getNomeDoAnimal().getNomeDoAnimal());
			System.out.println("Valor da consulta: " + consulta.getValorDaConsulta());
			System.out.println("Valor dos materiais: " + consulta.getValorDosMateriais());
		} else {
			System.out.println("Tutor não é o tutor do animal!");
		}
		
	}
	
}
