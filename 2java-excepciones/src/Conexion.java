public class Conexion implements AutoCloseable {

   public Conexion() {
       System.out.println("Abriendo conexion");
   }

   public void leerDatos() {
       System.out.println("Recibiendo datos");
       throw new IllegalStateException();
   }

   public void cerrar() {
       System.out.println("Cerrando conexion");
   }

    /*
     * Metodo close() funcionaria como un finally que se crea
     * de forma automatica.
     */
    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        cerrar();
    }
}