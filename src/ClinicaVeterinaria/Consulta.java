package ClinicaVeterinaria;

public class Consulta extends Atendimento {
	
	double valorDosMateriais;
	
	//construtor consulta
	
	public Consulta(Tutor nomeDoTutor, Animal nomeDoAnimal, double valorDaConsulta, double valorDosMateriais) {
		super(nomeDoTutor, nomeDoAnimal, valorDaConsulta);
		this.valorDosMateriais = valorDosMateriais;
	}
	
	//métodos consulta
	
	public double getValorDosMateriais() {
		return valorDosMateriais;
	}

	public void setValorDosMateriais(double valorDosMateriais) {
		this.valorDosMateriais = valorDosMateriais;
	}
	
	@Override
	public double getValorTotalDoAtendimento() {
		return getValorDaConsulta() + valorDosMateriais;
	}
		
}
