package matteobenetazzo.entities;

public class GiocoDaTavolo extends Gioco {

    private int numeroGiocatori;
    private int durataMediaMinuti;

    // COSTRUTTORE
    public GiocoDaTavolo(int idGioco, String titolo, int annoPubblicazione, double prezzo, int numeroGiocatori, int durataMediaMinuti) {

        // SUPERCLASSE
        // Chiama il costruttore della classe padre, quindi non devo riscrivere
        // i valori dato che basta mettere super.
        super(idGioco, titolo, annoPubblicazione, prezzo);

        if (numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new IllegalArgumentException("Numero di giocatori non valido (2-10)");
        }

        if (durataMediaMinuti <= 0) {
            throw new IllegalArgumentException("Durata media non valida");
        }

        this.numeroGiocatori = numeroGiocatori;
        this.durataMediaMinuti = durataMediaMinuti;
    }

    // GETTER
    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }

    // SETTER
    public void setNumeroGiocatori(int numeroGiocatori) {
        if (numeroGiocatori < 2 || numeroGiocatori > 10) {
            throw new IllegalArgumentException("Numero di giocatori non valido (2-10)");
        }
        this.numeroGiocatori = numeroGiocatori;
    }

    public int getDurataMediaMinuti() {
        return durataMediaMinuti;
    }

    public void setDurataMediaMinuti(int durataMediaMinuti) {
        if (durataMediaMinuti <= 0) {
            throw new IllegalArgumentException("Durata media non valida");
        }
        this.durataMediaMinuti = durataMediaMinuti;
    }

    @Override
    public String toString() {
        return "GiocoDaTavolo{" +
                "idGioco=" + getIdGioco() +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", prezzo=" + getPrezzo() +
                ", numeroGiocatori=" + numeroGiocatori +
                ", durataMediaMinuti=" + durataMediaMinuti +
                '}';
    }
}
