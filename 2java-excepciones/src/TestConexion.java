public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.leerDatos();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        con.cerrar();
    } 
}
