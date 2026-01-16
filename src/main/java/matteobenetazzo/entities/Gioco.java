package matteobenetazzo.entities;

public abstract class Gioco {
    private int idGioco;
    private String titolo;
    private int annoPubblicazione;
    private double prezzo;

    //COSTRUTTORE
    public Gioco(int idGioco, String titolo, int annoPubblicazione, double prezzo) {
        // 1) Controllo ID (l'utente sceglie un id univoco): deve essere un numero positivo
        if (idGioco <= 0) {
            throw new IllegalArgumentException("Id non valido: inserisci solo numeri >= 0");
        }

        // 2) Controllo titolo: non deve serre null
        if (titolo == null) {
            throw new IllegalArgumentException("Titolo non valido: cambia titolo");
        }

        // 3) Controllo anno
        if (annoPubblicazione < 1970 || annoPubblicazione > 2050) {
            throw new IllegalArgumentException("Anno di pubblicazione non valido: cambia anno");
        }

        // 4) Controllo Prezzo: deve essere un numero positivo
        if (prezzo < 0) {
            throw new IllegalArgumentException("Prezzo non valido: non può essere negativo");
        }

        this.idGioco = idGioco;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
    }

    // GETTER: metodo per leggere i valori
    public int getIdGioco() {
        return idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    // SETTER: metodo per modificare i valori
    public void setTitolo(String titolo) {
        if (titolo == null || titolo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titolo non valido: cambia titolo");
        }
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        if (annoPubblicazione < 1970 || annoPubblicazione > 2050) {
            throw new IllegalArgumentException("Anno di pubblicazione non valido: cambia anno");
        }
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Prezzo non valido: non può essere negativo");
        }
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Gioco{" +
                "idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                '}';
    }
}
