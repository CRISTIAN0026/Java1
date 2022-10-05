public class ArrayClass {

    public static void main(String[] args) {

        String []tre ={"tango", "tango1", "tango2"};
        String results = array1(tre);
        System.out.println(results);

    }
    static String array1(String[] args) {
        String sasw = " ";
        for (int i = 0; i < args.length; i++) {
            sasw += " " + args[i];

        }
        return sasw;
    }
}
