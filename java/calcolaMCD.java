/*Scrivere un programma che, dati due numeri interi, calcoli il Massimo Comune Divisore (MCD) tra i due numeri utilizzando l'algoritmo di Euclide. Implementare e richiamare dal mail il metodo calcolaMCD(int a, int b) per calcolare il MCD tra due numeri.

Algoritmo di Euclide:
1. Dati due numeri interi a e b, con a > b, si eseguono le seguenti operazioni:
2. Si divide a per b e si pone il resto r.
3. Se r = 0, b è il MCD tra a e b.
4. Se r ≠ 0, si pone a = b, b = r e si ritorna al punto 2.
*/

// Funzione che calcola il Massimo Comune Divisore (MCD) fra  due numeri interi 


public class calcolaMCD {

    public static int calcolaMCD(int a, int b) 
    {
        if (a < b) 
        {
            int temp = a;
            a = b;
            b = temp;
        }

        int r = a % b;
        while (r != 0) 
        {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }

    public static void main(String[] args) 
    {
        int num1 = 4;
        int num2 = 2;
        System.out.println("MCD(" + num1 + ", " + num2 + ") = " + calcolaMCD(num1, num2));
    }
}