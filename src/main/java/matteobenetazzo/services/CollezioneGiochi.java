package matteobenetazzo.services;

import matteobenetazzo.entities.Gioco;
import matteobenetazzo.entities.GiocoDaTavolo;

import java.util.ArrayList;
import java.util.List;

public class CollezioneGiochi {

    private List<Gioco> giochi;

    public CollezioneGiochi() {
        this.giochi = new ArrayList<>();
    }

    // 1) AGGIUNTA
    public void aggiungiGioco(Gioco gioco) {
        boolean idEsiste = giochi.stream().anyMatch(g -> g.getIdGioco() == gioco.getIdGioco());

        // Non deve essere possibile inserire un elemento con lo stesso ID
        if (idEsiste) throw new IllegalArgumentException("ID già esistente");

        giochi.add(gioco);
    }

    // 2) RICERCA PER ID
    public Gioco cercaPerId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID non valido");

        return giochi.stream().filter(g -> g.getIdGioco() == id).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Gioco non trovato"));
    }

    // 3) RICERCA PER PREZZO ()
    public List<Gioco> cercaPerPrezzo(double prezzo) {
        if (prezzo < 0) throw new IllegalArgumentException("Prezzo non valido");

        // Deve ritornare una lista con prezzo inferiore al prezzo inserito
        return giochi.stream().filter(g -> g.getPrezzo() < prezzo).toList();
    }

    // 4) RICERCA PER NUMERO DI GIOCATORI
    public List<GiocoDaTavolo> cercaPerNumeroGiocatori(int numero) {
        if (numero < 2 || numero > 10) throw new IllegalArgumentException("Numero giocatori non valido (2-10)");

        return giochi.stream().filter(g -> g instanceof GiocoDaTavolo).map(g -> (GiocoDaTavolo) g)
                .filter(gdt -> gdt.getNumeroGiocatori() == numero)
                .toList();
    }

    // 5) RIMOZIONE PER ID (in Application è il case numero 6)
    public void rimuoviPerId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID non valido");

        boolean rimosso = giochi.removeIf(g -> g.getIdGioco() == id);

        if (!rimosso) throw new IllegalArgumentException("ID non trovato");
    }

    // STAMPA TUTTI
    public List<Gioco> getTuttiIGiochi() {
        return giochi;
    }

    // 6) AGGIORNA GIOCO PER ID (per ora non esiste)


    // 7) STATISTICHE (conteggi + max prezzo + media prezzi) --> per ora non esiste
}


