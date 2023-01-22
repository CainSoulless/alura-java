
public class Flujo {

	public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }

    private static void metodo1() {
        System.out.println("Fin de metodo1");
        metodo2();
    }

    private static void metodo2() {
        System.out.println("Inicio de metodo2");
        System.out.println("Fin de metodo2");
        throw new ArithmeticException("Mal mal mal");
    }
}
