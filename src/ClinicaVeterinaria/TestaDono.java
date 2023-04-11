package ClinicaVeterinaria;

public class TestaDono {
	
	public static void main(String[] args) {
		
		Tutor elton = new Tutor("Elton");
		Cachorro frida = new Cachorro("Frida", "Fêmea", elton, "Não");
		Gato coruja = new Gato("Coruja", "Fêmea", elton, "Não");

		elton.setPet(frida);
		elton.setPet(coruja);
		elton.getPet();
		
		
	}

}
