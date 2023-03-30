package ClinicaVeterinaria;

public class TestaDono {
	
	public static void main(String[] args) {
		
		Tutor elton = new Tutor();
		Cachorro frida = new Cachorro("Frida", "fêmea", elton, "não");
		
		elton.setNomeDoTutor("Elton");
		elton.setNomeDoAnimal(frida);
		
	
		System.out.println("Frida pode morder: " + frida.getMorde());
		System.out.println(elton.getNomeDoTutor());
		System.out.println(frida.getNomeDoTutor().getNomeDoTutor());
		
		Consulta consultaFrida = new Consulta(frida, 100.0);
		consultaFrida.setValorConsulta(50.0);
		
		System.out.println(consultaFrida.getValorDoAtendimento());
		System.out.println(consultaFrida.getValorConsulta());
		System.out.println(consultaFrida.getTotalDoAtendimento());
	}

}
