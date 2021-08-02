// Oblig 2, del D
// Espen H. Kristensen
// Frivillig: implementer en ordrelokke

/**
 * Class implementing the generic GenHylle-interface,
 * providing methods and variables to create a shelf
 * and store objects in it.
 */
public class Hylle<T> implements GenHylle<T> {
    /**
     * Size of array.
     */
    private int storrelse;
    /**
     * Array representing shelf.
     */
    private T[] hylle;

    /**
     * Initializes a shelf, always empty.
     * @param   storrelse   Size of array.
     */
    Hylle(int storrelse) {
        this.storrelse = storrelse;
        this.hylle = (T[]) new Object[storrelse];
    }

    /**
     * Remove and get object at the given positon,
     * checking for valid and in use position.
     * @param   pos Position to remove from.
     * @return      The removed object, null if failure.
     */
    public T taUtVedPos(int pos) {
        if (sjekkGyldigPos(pos)) {
            if (!sjekkLedigVedPos(pos)) {
                T hentes = this.hylle[pos];
                System.out.printf("Henter ut %s fra posisjon %d\n", hentes, pos);
                this.hylle[pos] = null;
                return hentes;
            }
        }
        System.err.println("Feil! Ikke mulig aa hente ut.");
        return null;
    }

    /**
     * Check availability at given position,
     * checking that position is within bounds of array.
     * @param   pos Position to check.
     * @return      Success value, true if vacant.
     */
    public boolean sjekkLedigVedPos(int pos) {
        if (sjekkGyldigPos(pos)) {
            if (this.hylle[pos] == null) {
                return true;
            }
        }
        // Shorthand. Hvis begge feiler returneres false, dermed ikke behov for else-case.
        return false;
    }

    /**
     * Insert object obj at position pos, checking
     * valid and vacant position before inserting.
     * @param obj   Object to insert.
     * @param pos   Position to insert at.
     */
    public boolean settInnVedPos(T obj, int pos) {
        if (sjekkGyldigPos(pos)) {
            if (sjekkLedigVedPos(pos) == true) { // suksess! 
                System.out.printf("Setter inn bok %s ved posisjon %d\n", obj, pos);
                this.hylle[pos] = obj;
                return true; // for sikkerhets skyld
            } else {
                System.err.println("Feil! Posisjon er ikke ledig.");
            }
        } else  {
            System.err.println("Feil! Posisjon er ikke gyldig, utenfor grensene for hyllen.");
        }

        return false; // har feilet dersom kjoring naar hit
    }

    public int hentStorrelse() {
        return this.storrelse;
    }

    /**
     * Check if given position pos is within bounds
     * of the shelf.
     */
    public boolean sjekkGyldigPos(int pos) {
        if (pos > hentStorrelse()-1 || pos < 0) {
            return false;
        }
        return true;
    }
}

