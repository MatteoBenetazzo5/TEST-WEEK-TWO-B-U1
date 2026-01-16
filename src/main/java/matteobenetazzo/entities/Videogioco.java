package matteobenetazzo.entities;

import matteobenetazzo.enums.Genere;
import matteobenetazzo.enums.Piattaforma;

public class Videogioco extends Gioco {
    private Piattaforma piattaforma;
    private int durataOre;
    private Genere genere;

    // COSTRUTTORE
    public Videogioco(int idGioco, String titolo, int annoPubblicazione, double prezzo, Piattaforma piattaforma, int durataOre, Genere genere) {

        // SUPERCLASSE
        // Chiama il costruttore della classe padre, quindi non devo riscrivere
        // i valori dato che basta mettere super.
        super(idGioco, titolo, annoPubblicazione, prezzo);

        if (piattaforma == null) {
            throw new IllegalArgumentException("Piattaforma non valida");
        }

        if (durataOre < 0) {
            throw new IllegalArgumentException("Durata non valida");
        }

        if (genere == null) {
            throw new IllegalArgumentException("Genere non valido");
        }

        this.piattaforma = piattaforma;
        this.durataOre = durataOre;
        this.genere = genere;
    }

    // GETTER
    public Piattaforma getPiattaforma() {
        return piattaforma;
    }

    // SETTER
    public void setPiattaforma(Piattaforma piattaforma) {
        if (piattaforma == null) {
            throw new IllegalArgumentException("Piattaforma non valida");
        }
        this.piattaforma = piattaforma;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(int durataOre) {
        if (durataOre < 0) {
            throw new IllegalArgumentException("Durata non valida");
        }
        this.durataOre = durataOre;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        if (genere == null) {
            throw new IllegalArgumentException("Genere non valido");
        }
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogioco{" +
                "idGioco=" + getIdGioco() +
                ", titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", prezzo=" + getPrezzo() +
                ", piattaforma=" + piattaforma +
                ", durataOre=" + durataOre +
                ", genere=" + genere +
                '}';
    }
}

