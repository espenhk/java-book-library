// Oblig 2, del A, oppg. 1 og 3
// Espen H. Kristensen

/**
 * Class to represent books, that are all loanable (TilUtlaan).
 */

public class Bok implements TilUtlaan {
    /**
     * Title of book.
     */
    private String tittel;
    /**
     * Author of book.
     */
    private String forfatter;
    /**
     * Loaner of book, initialized to null.
     */
    private String laaner;

    /**
     * Simple constructor, assigning instance variables. 
     * Note laaner is not given a value here, this only happens throught the laanUt() method.
     * @param tittel    Title of book.
     * @param forfatter Author of book.
     */
    Bok(String tittel, String forfatter) {
        this.tittel = tittel;
        this.forfatter = forfatter;
    }

    /**
     * Loans out a book, printing to STDERR if already loaned out.
     * @param   laaner  Person to loan out to
     * @return          Success value, true if successful loan and false otherwise.
     */
    public boolean laanUt(String laaner) {
        if (this.hentLaaner() == null) {
            this.laaner = laaner;
            return true;
        } else {
            System.err.printf("Boken %s er allerede laant ut!\n", this);
            return false;
        }
    }

    /**
     * Returns a book, printing to stderr if book is not already loaned out.
     * @param utlaant   Book to be returned.
     * @return          Success value; true if successful, false if error.
     */
    public boolean leverTilbake(Bok utlaant) {
        if (utlaant.laaner != null) {
            utlaant.laaner = null;
            return true;
        } else {
            System.err.printf("Boken %s er ikke utlaant!\n", utlaant.laaner);
            return false;
        }
    }

    public String hentLaaner() {
        return this.laaner;
    }

    public String toString() {
        return tittel + " - " + forfatter;
    }
}
