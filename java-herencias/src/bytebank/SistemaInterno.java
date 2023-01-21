package bytebank;

public class SistemaInterno {
    private String clave = "Alura";

    public boolean autenticar(Gerente gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } 
        System.out.println("Error con iniciar sesion.");
        return false;
    }
}
