// Oblig 2, del C
// Espen H. Kristensen

/**
 * Generic interface to describe a shelf, containing a given
 * type of objects. No constraints on the type of the object
 * is given.
 */
public interface GenHylle<T> {

    /**
     * Removes an object from the given position,
     * checking that position is valid and in use.
     * @param   pos   Position to remove from.
     * @return    The removed object, or null if error.
     */
    public T taUtVedPos(int pos);

    /**
     * Check that the given position is vacant.
     * @param   pos Position to check.
     * @return  Success value, true if vacant.
     */
    public boolean sjekkLedigVedPos(int pos);

    /**
     * Insert given object obj at the given position,
     * checking that position is valid and vacant.
     * @param   obj Object to insert.
     * @param   pos Position to insert at.
     * @return  Success value, true if successful.
     */
    public boolean settInnVedPos(T obj, int pos);

    /**
     * Get size of shelf. No hokey pokey there.
     * @return  Size of shelf.
     */
    public int hentStorrelse();

    // Ikke strengt nodvendig, men praktisk
    /**
     * Check if the given position is valid,
     * that is within the boundaries of the array.
     * @return  Success value, true if valid.
     */
    public boolean sjekkGyldigPos(int pos);

}
