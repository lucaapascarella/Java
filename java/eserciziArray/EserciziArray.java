import java.util.Scanner; //permette la lettura di file di dati formattati 

public class EserciziArray 
{

    // Metodo per memorizzare 10 int in un array e calcolare la somma degli elementi
    public static int sommaArrayDiDieciInt() 
    {
        int[] array = new int[10];
        int somma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 10 numeri interi:");
        for (int i = 0; i < 10; i++) 
        {
            array[i] = scanner.nextInt();
            somma += array[i];
        }
        return somma;
    }

    // Metodo per memorizzare X int in un array e calcolare la somma degli elementi
    public static int sommaArrayDiNInt(int n) 
    {
        int[] array = new int[n];
        int somma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci " + n + " numeri interi:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            somma += array[i];
        }
        return somma;
    }

    // Metodo per contare il numero di elementi minori di zero in un array di double
    public static int contaElementiMinoriDiZero(double[] array) 
    {
        int contatore = 0;
        for (double elemento : array) {
            if (elemento < 0) {
                contatore++;
            }
        }
        return contatore;
    }

    // Metodo per trovare il massimo elemento in un array
    public static int trovaMassimo(int[] array) 
    {
        int massimo = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > massimo) 
            {
                massimo = array[i];
            }
        }
        return massimo;
    }

     // Metodo main per testare i metodi
    public static void main(String[] args) 
    {
        // Test del primo metodo
        System.out.println("La somma degli elementi dell'array di 10 interi è: " + sommaArrayDiDieciInt());

        // Test del secondo metodo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la dimensione dell'array di interi: ");
        int dimensione = scanner.nextInt();
        System.out.println("La somma degli elementi dell'array di " + dimensione + " interi è: " + sommaArrayDiNInt(dimensione));

        // Test del terzo metodo
        double[] arrayDouble = {1.5, -2.0, 3.7, -4.2, 5.1};
        System.out.println("Il numero di elementi minori di zero nell'array di double è: " + contaElementiMinoriDiZero(arrayDouble));

        // Test del quarto metodo
        int[] arrayInt = { 20, 30 ,40 ,50 , 60 };
        System.out.println("Il massimo elemento nell'array di interi è: " + trovaMassimo(arrayInt));
    }
}