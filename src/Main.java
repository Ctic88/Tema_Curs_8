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
        double distanta = 10000;
        int ore = 0;
        int minute = 37;
        int secunde = 30;


        // 1
        printHelloName();

        // 2
        System.out.println("Rezultatul adunarii este: " + adunare(a,b));
        System.out.println("Rezultatul Scaderii este: " + scadere(a, b));
        System.out.println("Rezultatul Inmultirii este: " + inmultire(a, b));
        System.out.println("Rezultatul Impartirii este: " + impartire(a, b));

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
        speed(distanta, ore, minute,secunde);
    }

    //  1
    public static void printHelloName() {
        System.out.println("Hello\nCristian");
    }

    //  2
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

    //  3
    public static void printJavaLogo() {
        System.out.println("""
           J    a   v     v  a
           J   a a   v   v  a a
        J  J  aaaaa   V V  aaaaa
         JJ  a     a   V  a     a""");
    }

    //  4
    public static double media(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    //  5
    public static void printSmiley() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    //  6
    public static int restImpartire(int a, int b) {

        return a % b;
    }

    //  7
    public static double fahrenheitToCelsius(double f) {

        return 5.0 / 9 * (f - 32);
    }

    //  8
    public static double inchIntoMeters(double inch) {

        return inch * 0.0254;
    }

    //  9
    public static void speed(double distance, int hours, int minutes, int seconds) {
        double timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double vitezaMs = distance / timeInSeconds;
        double vitezaKmh = (distance / 1000) / (timeInSeconds / 3600);
        double vitezaMph = (distance / 1609) / (timeInSeconds / 3600);

        System.out.println("Viteza in m/s este: " + vitezaMs);
        System.out.println("Viteza in km/h este: " + vitezaKmh);
        System.out.println("Viteza in mph este: " + vitezaMph);
    }
}