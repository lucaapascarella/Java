public class EquazioneSecondoGrado {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessun numero inserito.");
            return;
        }

        double somma = 0;
        double min = Double.POSITIVE_INFINITY; //NUMERO DOUBLE PIù GRANDE
        double max = Double.NEGATIVE_INFINITY; //NUMERO DOUBLE PIù PICCOLO

        for (String arg : args) {
            double n = Double.parseDouble(arg); //CONVERTO ARG IN DOUBLE
            somma = somma + n;

            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }

        int nSequenza = args.length;
        double media = somma / nSequenza;

        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);
        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
    }
}