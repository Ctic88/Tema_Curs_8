public class Main {
    public static void main(String[] args) {

        //Variabile 2,4,6
        int a =20;
        int b =3;
        int c = 5;
        //Variabila 7
        int f = 50;
        //Variabila 8
        int inches = 79;
        //Variabila 9
        int distanta = 10000;
        int ore = 0;
        int minute = 37;
        int secunde = 30;


        // 1
        printHelloName();

        // 2
        System.out.println("Rezultatul adunarii: " + adunare(a,b));
        System.out.println("Rezultatul Scaderii: " + scadere(a, b));
        System.out.println("Rezultatul Inmultirii: " + inmultire(a, b));
        System.out.println("Rezultatul Impartirii: " + impartire(a, b));

        // 3
        printJavaLogo();

        // 4
        System.out.println("Media: " + media(a, b, c));

        // 5
        printSmiley();

        // 6
        System.out.println("Restul impartirii: " + restImpartire(a, b));

        // 7
        System.out.println("Temperatura in grade Celsius: " + fahrenheitToCelsius(f));

        // 8
        System.out.println("Distanta in metri: " + inchIntoMeters(inches));

        // 9
        calculViteza(distanta, ore, minute,secunde);
    }

    // Problema 1
    public static void printHelloName() {
        System.out.println("Hello\nCristian");
    }

    // Problema 2
    public static int adunare(int a, int b) {
        return a + b;
    }

    public static int scadere(int a, int b) {
        return a - b;
    }

    public static int inmultire(int a, int b) {
        return a * b;
    }

    public static double impartire(double a, double b) {
        return a / b;
    }

    // Problema 3
    public static void printJavaLogo() {
        System.out.println("""
           J    a   v     v  a
           J   a a   v   v  a a
        J  J  aaaaa   V V  aaaaa
         JJ  a     a   V  a     a""");
    }

    // Problema 4
    public static double media(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Problema 5
    public static void printSmiley() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    // Problema 6
    public static int restImpartire(int a, int b) {
        return a % b;
    }

    // Problema 7
    public static double fahrenheitToCelsius(double f) {
        return 5.0 / 9 * (f - 32);
    }

    // Problema 8
    public static double inchIntoMeters(double inch) {
        return inch * 0.0254;
    }

    // Problema 9
    public static void calculViteza(double distanta, int ore, int minute, int secunde) {
        double timpInSecunde = ore * 3600 + minute * 60 + secunde;
        double vitezaMs = distanta / timpInSecunde;
        double vitezaKmh = (distanta / 1000) / (timpInSecunde / 3600);
        double vitezaMph = (distanta / 1609) / (timpInSecunde / 3600);

        System.out.println("Viteza in m/s: " + vitezaMs);
        System.out.println("Viteza in km/h: " + vitezaKmh);
        System.out.println("Viteza in mph: " + vitezaMph);
    }
}