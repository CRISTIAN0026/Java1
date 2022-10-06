public class Encasulacion {


    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Cristian");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setEdad(25);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelefono(30439588);
        System.out.println("Mi teléfono es " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}
