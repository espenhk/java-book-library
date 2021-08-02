// Oblig 2, del E
// Espen H. Kristensen

public class HovedProgram {
    private static Hylle<Bok> bokhylle;
    public static void printTest(String name, boolean result) {
        System.out.print(name + ": ");
        if (result) {
            System.out.println("Passerte!");
        }
        else {
            System.out.println("Feilet!");
        }
    }

    public static void settInnTest(Bok bok, int pos) {
        printTest("Sett inn", bokhylle.settInnVedPos(bok, pos));
        printTest("Sjekk ledig", bokhylle.sjekkLedigVedPos(pos));
        printTest("Ta ut", (bokhylle.taUtVedPos(pos) != null));
        printTest("Sjekk ledig", bokhylle.sjekkLedigVedPos(pos));
    }

    public static void settInnTre(Bok bok1, Bok bok2, Bok bok3, int startpos) {
        settInnTest(bok1, startpos);
        settInnTest(bok2, startpos+1);
        settInnTest(bok3, startpos+2);
    }

    public static void settInnUtenfor(Bok bok) {
        // tester eksakte grenser, for aa vaere sikker paa
        // at disse er angitt korrekt
        System.out.println("Setter inn utenfor ovre grense");
        bokhylle.settInnVedPos(bok, bokhylle.hentStorrelse());
        System.out.println("Setter inn utenfor nedre grense");
        bokhylle.settInnVedPos(bok, -1);
    }

    public static void settInnOgOppaa(Bok bok1, Bok bok2, int pos) {
        bokhylle.settInnVedPos(bok1, pos);
        bokhylle.settInnVedPos(bok2, pos);
        bokhylle.taUtVedPos(pos);
    }
    public static void main(String[] args) {

        bokhylle = new Hylle<Bok>(100);

        Bok bok1 = new Bok("1984", "George Orwell");
        Bok bok2 = new Bok("Animal Farm", "George Orwell");
        Bok bok3 = new Bok("Kollektivt selvmord", "Aarto Paasilinna");
        System.out.println("*** TEST 1: Sett inn og ta ut en bok");
        settInnTest(bok1, 0);

        System.out.println("*** TEST 2: Sett inn og ta ut tre boker, paa de siste plassene");
        settInnTre(bok1, bok2, bok3, bokhylle.hentStorrelse() - 3);

        System.out.println("*** TEST 3: Setter inn under og over grensene");
        settInnUtenfor(bok1);

        System.out.println("*** TEST 4: Setter inn og setter inn paa samme posisjon");
        settInnOgOppaa(bok1, bok2, 1);
    }
}
