package bytebank;

public class Contador extends AbstractFuncionario implements InterfaceAutenticar {

	@Override
	public double getBonificacion() {
		System.out.println("Llamando metodo del Contador");
		return 200;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
}
