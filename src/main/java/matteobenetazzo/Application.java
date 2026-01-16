package matteobenetazzo;

import matteobenetazzo.entities.Gioco;
import matteobenetazzo.entities.GiocoDaTavolo;
import matteobenetazzo.entities.Videogioco;
import matteobenetazzo.enums.Genere;
import matteobenetazzo.enums.Piattaforma;
import matteobenetazzo.services.CollezioneGiochi;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CollezioneGiochi collezione = new CollezioneGiochi();

        int scelta = -1;
        while (scelta != 0) {
            System.out.println("---- MENU ----");
            System.out.println("1) Aggiungi Videogioco");
            System.out.println("2) Aggiungi Gioco da Tavolo");
            System.out.println("3) Cerca gioco per ID");
            System.out.println("4) Cerca giochi sotto un prezzo");
            System.out.println("5) Cerca giochi da tavolo per numero giocatori");
            System.out.println("6) Rimuovi giochi per numero di ID");
            System.out.println("7) Aggiorna giochi per numeri di ID (per ora non esiste)");
            System.out.println("8) Statistiche dei giochi (per ora non esiste)");


            System.out.println("0) Esci");
            System.out.print("Scelta: ");

            try {
                scelta = Integer.parseInt(scanner.nextLine());
                switch (scelta) {
                    case 1: {
                        System.out.println("---- AGGIUNGI VIDEOGIOCO ----");

                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Titolo: ");
                        String titolo = scanner.nextLine();

                        System.out.print("Anno pubblicazione: ");
                        int anno = Integer.parseInt(scanner.nextLine());

                        System.out.print("Prezzo: ");
                        double prezzo = Double.parseDouble(scanner.nextLine());

                        System.out.print("Durata ore: ");
                        int durataOre = Integer.parseInt(scanner.nextLine());

                        System.out.println("Piattaforma:");
                        System.out.println("1) PC  2) PS5  3) PS4  4) XBOX  5) NINTENDO_SWITCH  6) MOBILE  7) TV");
                        int p = Integer.parseInt(scanner.nextLine());
                        Piattaforma piattaforma = Piattaforma.values()[p - 1];

                        System.out.println("Genere:");
                        System.out.println("1) AZIONE  2) AVVENTURA  3) RPG  4) SPORT  5) STRATEGIA  6) SIMULAZIONE");
                        int g = Integer.parseInt(scanner.nextLine());
                        Genere genere = Genere.values()[g - 1];

                        // PER OGNI CASE è UGUALE, MA CAMBIA SOLO IL CONTENUTO
                        Videogioco vg = new Videogioco(id, titolo, anno, prezzo, piattaforma, durataOre, genere);
                        collezione.aggiungiGioco(vg);
                        System.out.println("Videogioco aggiunto!");
                        break;
                    }

                    case 2: {
                        System.out.println("---- AGGIUNGI GIOCO DA TAVOLO ----");

                        System.out.print("ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Titolo: ");
                        String titolo = scanner.nextLine();

                        System.out.print("Anno pubblicazione: ");
                        int anno = Integer.parseInt(scanner.nextLine());

                        System.out.print("Prezzo: ");
                        double prezzo = Double.parseDouble(scanner.nextLine());

                        System.out.print("Numero giocatori (2-10): ");
                        int giocatori = Integer.parseInt(scanner.nextLine());

                        System.out.print("Durata media minuti: ");
                        int durataMin = Integer.parseInt(scanner.nextLine());

                        // PER OGNI CASE è UGUALE, MA CAMBIA SOLO IL CONTENUTO
                        GiocoDaTavolo gdt = new GiocoDaTavolo(id, titolo, anno, prezzo, giocatori, durataMin);
                        collezione.aggiungiGioco(gdt);
                        System.out.println("Gioco da tavolo aggiunto!");
                        break;
                    }

                    case 3: {
                        System.out.println("---- CERCA PER ID ----");

                        System.out.print("Inserisci ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        // PER OGNI CASE è UGUALE, MA CAMBIA SOLO IL CONTENUTO
                        Gioco trovato = collezione.cercaPerId(id);
                        System.out.println(trovato);
                        break;
                    }

                    case 4: {
                        System.out.println("---- CERCA PER PREZZO ----");

                        System.out.print("Inserisci prezzo massimo: ");
                        double prezzo = Double.parseDouble(scanner.nextLine());


                        // PER OGNI CASE è UGUALE, MA CAMBIA SOLO IL CONTENUTO
                        List<Gioco> risultati = collezione.cercaPerPrezzo(prezzo);
                        if (risultati.isEmpty()) {
                            System.out.println("Nessun gioco trovato sotto questo prezzo.");
                        } else {
                            risultati.forEach(System.out::println); // lambda
                        }
                        break;
                    }

                    case 5: {
                        System.out.println("---- CERCA PER NUMERO GIOCATORI ----");

                        System.out.print("Inserisci numero giocatori (2-10): ");
                        int num = Integer.parseInt(scanner.nextLine());

                        // PER OGNI CASE è UGUALE, MA CAMBIA SOLO IL CONTENUTO
                        List<GiocoDaTavolo> risultati = collezione.cercaPerNumeroGiocatori(num);

                        if (risultati.isEmpty()) {
                            System.out.println("Nessun gioco da tavolo trovato.");
                        } else {
                            risultati.forEach(System.out::println); // lambda
                        }
                        break;
                    }

                    case 6: {
                        System.out.println("---- RIMUOVI PER ID ----");

                        System.out.print("Inserisci ID da rimuovere: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        collezione.rimuoviPerId(id);

                        System.out.println("Gioco rimosso correttamente dalla lista!");
                        break;
                    }

                    case 7: {
                        System.out.println("---- AGGIORNA GIOCO PER ID: (per ora non esiste) ----");


                        break;
                    }

                    case 8: {
                        System.out.println("---- STATISTICHE DEI GIOCHI (per ora non esiste) ----");
                        

                        break;
                    }

                    case 0:
                        System.out.println("PROGRAMMA TERMINATO, GRAZIE E A PRESTO!!");
                        break;

                    default:
                        System.out.println("Scelta non valida.");
                }

            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}


