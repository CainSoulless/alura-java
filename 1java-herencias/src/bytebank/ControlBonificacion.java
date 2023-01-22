package bytebank;

public class ControlBonificacion {

	private double suma;
	
	public double registrarSalario(AbstractFuncionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	
}
