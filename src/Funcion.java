public class Funcion {
    public static void main(String[] args) {

    int results = iva(1500);
        System.out.println(results);
    }

    static int iva(int num){
        int results1 = ((num * 19) / 100) + num;

        return results1;

    }
}