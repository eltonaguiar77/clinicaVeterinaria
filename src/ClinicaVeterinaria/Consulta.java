package ClinicaVeterinaria;

public class Consulta extends Atendimento {
	
	double valorConsulta;
	
	//construtor consulta
	
	public Consulta(Animal nomeDoAnimal, double valorDoAtendimento) {
		super(nomeDoAnimal, valorDoAtendimento);
	}
	
	//métodos consulta
	
	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	@Override
	public double getTotalDoAtendimento() {
		return super.getValorDoAtendimento() + valorConsulta;
	}
		
}
