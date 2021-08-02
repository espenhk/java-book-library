// Oblig 2, del A, oppg. 2
// Espen H. Kristensen

/**
 * Interface for loanable books.
 */

public interface TilUtlaan {

    /**
     * Method to loan a loanable, and assign loaner ID (name) to the loanable object.
     * @param laaner    Person loaning the object.
     * @return boolean  Success value - successful loan gives true, object already loaned out gives false.
     */
    public boolean laanUt(String laaner);

    /**
     * Method to return a loanable.
     * @param utlaant Loanable to return. Note: Object to return, not loaner who is returning.
     * @return        Success value, same as laanUt().
     */
    public boolean leverTilbake(Bok utlaant);
}
