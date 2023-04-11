package ClinicaVeterinaria;

public class Retorno extends Atendimento {
	
	double valorDosMateriaisDoRetorno;
	
	//construtor de retorno
	
	public Retorno(Tutor nomeDoTutor, Animal nomeDoAnimal, double valorDaConsulta, double valorDosMateriaisDoRetorno) {
		super(nomeDoTutor, nomeDoAnimal, valorDaConsulta);
		this.valorDosMateriaisDoRetorno = valorDosMateriaisDoRetorno;
	}
	
	public double getValorDosMateriaisDoRetorno() {
		return valorDosMateriaisDoRetorno;
	}

	public void setValorDosMateriaisDoRetorno(double valorDosMateriaisDoRetorno) {
		this.valorDosMateriaisDoRetorno = valorDosMateriaisDoRetorno;
	}

	@Override
	public double getValorTotalDoAtendimento() {
		return valorDosMateriaisDoRetorno;
	}
}
