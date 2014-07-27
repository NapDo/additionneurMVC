package nap.soft.project.additionneur.architecturemvc;

import java.io.Serializable;

/**
 * Reprend les termes d'une adddition.
 *
 * Il s'agit d'un DTO (data transfer Object) dont le seul rôle est le stockage de données en vue de transfert.
 *
 */
public class Termes implements Serializable{
    private int terme1;
    private int terme2;
    /** Creates a new instance of Termes */
    public Termes(int terme1, int terme2) {
        if (terme1<0 || terme2<0) 
            throw new IllegalArgumentException(
                    "Les termes doivent être positifs");
        this.terme1=terme1;
        this.terme2=terme2;        
    }

    /**
     * retourne le premier terme
     */
    public int getTerme1() {
        return terme1;
    }

    /**
     * retourne le deuxième terme
     */
    public int getTerme2() {
        return terme2;
    }
    
}
