/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nap.soft.project.additionneur.architecturemvc;

/**
 * Exception lancée par le modèle lorsque les termes fournis entraînent, lors du calcul, un Overflow
 */
public class AdditionneurOverflowException extends Exception {

    /**
     * Creates a new instance of <code>AdditionneurOverflowException</code> without detail message.
     */
    public AdditionneurOverflowException() {
    }


    /**
     * Constructs an instance of <code>AdditionneurOverflowException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public AdditionneurOverflowException(String msg) {
        super(msg);
    }
}
