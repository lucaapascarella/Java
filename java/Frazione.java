public class Frazione 
{
    // Campi
    private int numeratore;
    private int denominatore;
    // Costruttore

    public static void main(String[] args)
    {
        int x;
        Frazione f1 = new Frazione(10, 2);
        Frazione f2 = new Frazione(5, 15);

        System.out.println("Frazione f1 = " + f1);
        System.out.println("Frazione f2 = " + f2);

        x = f1.getDenominatore();
        System.out.println("Denominatore f1 = " + x);

        x = f1.getNumeratore();
        System.out.println("Numeratore f1 = " + x);

        Frazione somma = f1.somma(f2);
        System.out.println("Somma f1 + f2 = " + somma);

        somma.semplifica();
        System.out.println("Frazione somma semplificata = " + somma);

        Frazione differenza = f1.sottrai(f2);
        System.out.println("Differenza f1 - f2 = " + differenza);

        Frazione prodotto = f1.moltiplica(f2);
        System.out.println("Prodotto f1 * f2 = " + prodotto);

        Frazione quoziente = f1.dividi(f2);
        System.out.println("Quoziente f1 / f2 = " + quoziente);
    }
    
    public Frazione(int numeratore, int denominatore) 
    {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
    // Metodo per ottenere il numeratore
    public int getNumeratore() 
    {
        return numeratore;
    }
// Metodo per ottenere il denominatore
    public int getDenominatore() 
    {
        return denominatore;
    }
    // Metodo per ottenere la rappresentazione testuale della frazione
    @Override
    public String toString() 
    {
        return numeratore + "/" + denominatore;
    }
    // Metodo per sommare due frazioni
    public Frazione somma(Frazione altraFrazione) 
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                + altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore); //return nuova Frazione
    }

    // Metodo per calcolare il Massimo Comune Divisore (MCD) con l'algoritmo di Euclide
    private int calcolaMCD(int a, int b) 
    {
        int z, r;
        if (a<b) {
            z = a;
            a = b;
            b = z;
        }


        do {
            r = a % b;
            if (r == 0) return b;
            a = b;
            b = r;
        } while(r!=0);

        return 0;
    }

    // Metodo per semplificare la frazione
    public void semplifica()
    {
        int mcd = calcolaMCD(this.numeratore, this.denominatore);
        if(mcd != 0)
        {
        this.numeratore /= mcd;
        this.denominatore /= mcd;
        }
    }

    // Metodo per moltipicare la frazione
    public Frazione moltiplica(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.numeratore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore); //return nuova Frazione
    }

    // Metodo per sottrarre due frazioni
    public Frazione sottrai(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore - altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore); //return nuova Frazione
    }

    // Metodo per dividere due frazioni
    public Frazione dividi(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.numeratore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);//return nuova Frazione
    }
}
