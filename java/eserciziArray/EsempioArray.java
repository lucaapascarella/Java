import java.io.*;

public class EsempioArray {

    public static void es_a() throws IOException {
        int i = 0;
        int v[] = new int[10];
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);

        for (i = 0; i < 10; i++) {
            System.out.print("Valore di v[" + i + "]: ");
            v[i] = Integer.parseInt(Tastiera.readLine());
        }
        for (i = 0; i < 10; i++) {
            System.out.println("v[" + i + "]=" + v[i]);
        }
        int S = 0;
        for (i = 0; i < 10; i++) {
            S = S + v[i];
        }
        System.out.println("somma=" + S);
    }

    public static void es_b() throws IOException {
        int x;
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        do {
            System.out.print("Immettere un numero: ");
            x = Integer.parseInt(Tastiera.readLine());
        } while (x <= 0);
        System.out.println("numero inserito: " + x);
        int i = 0;
        int v[] = new int[x];
        for (i = 0; i < x; i++) {
            System.out.print("Valore: ");
            v[i] = Integer.parseInt(Tastiera.readLine());
        }

        for (i = 0; i < x-1; i++) {
            System.out.println("v[" + i + "]=" + v[i]);
        }


        int S = 0;
        for (i = 0; i < x; i++) {
            S = S + v[i];
        }
        System.out.println("somma=" + S);

    }

    public static void es_c() throws IOException {

    }

    public static void es_d() throws IOException {

    }

    public static void main(String args[]) throws NumberFormatException, IOException {
        es_a();
        es_b();
    }
}