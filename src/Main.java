public class Main {

    public static void main(String[] args) {


        Coche miCoche = new Coche();
        miCoche.agregarPuertas(1);
        miCoche.agregarPuertas(3);
        miCoche.agregarPuertas(1);
        System.out.println(miCoche.puertas);

    }
}
