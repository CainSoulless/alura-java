/*
 * Esta clase determina que se ejecuta ante la aparicion de alguna excepcion,
 * ademas se explica la utilidad del "finally", que su funcion es ejecutar
 * un bloque de codigo independiente de si paso el try o no. 
 * 
 * Tener en cuenta que un try no puede se declarado solo, debe tener un 
 * catch e incluso un finally
 * try
 *      algo
 * finally
 *      otra cosa
 */
public class TestConexion{
    public static void main(String[] args) throws Exception {
        /* 
        Esta es una forma correcta de resolver algunas excepciones,
        pero no la mas optima: 

        Conexion con = null;
        try {
            con = new Conexion();
            con.leerDatos();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Ejecutando finally.");
            if (con != null) {
                con.cerrar();
            }
        }
        */
        try (Conexion con = new Conexion()) {
            con.leerDatos();
        } catch (IllegalStateException ex) {
            System.out.println("Ejecutando catch"); 
            ex.printStackTrace();
        }
    } 
}
