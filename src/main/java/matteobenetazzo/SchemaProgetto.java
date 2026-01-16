package matteobenetazzo;

/*  SCHEMA PROGETTO

    1) CONSEGNA: Gestire una collezione di giochi usando Java, OOP, Scanner e Stream.

    2) TIPI DI GIOCO:
    - Videogioco
    - GiocoDaTavolo

    3) STRUTTURA:
    - Gioco (abstract)
        * idGioco
        * titolo
        * annoPubblicazione
        * prezzo (> 0)

    - Videogioco extends Gioco
        * piattaforma (enum)
        * durataOre
        * genere (enum)

    - GiocoDaTavolo extends Gioco
        * numeroGiocatori (2 - 10)
        * durataMediaMinuti

    4) ENUM:
    - Genere
    - Piattaforma

    5) CLASSE Collezione:
    - aggiungi gioco (non è possibile inserire elemento con stesso ID)
    - cerca per ID
    - cerca per prezzo massimo
    - cerca giochi da tavolo per numero giocatori
    - rimuovi per ID
    - aggiorna gioco per ID
    - statistiche (conteggi + max prezzo + media prezzi)

    6) Application.java:
    - menu con Scanner
    - switch sulle operazioni
    - gestione errori di base
*/
public class SchemaProgetto {
}

