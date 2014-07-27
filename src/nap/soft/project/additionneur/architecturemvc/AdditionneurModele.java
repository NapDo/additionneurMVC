package nap.soft.project.additionneur.architecturemvc;

/**
 * Interface que doit présenter le modèle de l'additionneur aux vues et aux contrôleurs.
 *
 * Cette interface pourrait être séparé en deux:
 * <ul>
 * <li>Interface pour vues : reprenant les 4 premières méthodes</li>
 * <li>Interface pour contrôleurs : reprenant la dernière méthode</li>
 * </ul>
 *
 */
public interface AdditionneurModele {
    /**
     * retourne à la vue l'état du modèle
     */
    public Etat getEtat();
    /**
     * permet à la vue de s'abonner en tant qu'observateur du modèle
     */
    public void addAdditionneurListener(AdditionneurVue add);
    /**
     * permet à la vue de se désabonner en tant qu'observateur du modèle
     */
    public void removeAdditionneurListener(AdditionneurVue add);

    /**
     * retourne le nombre de listeners inscrits
     */
    public int getListeners() ; 

    /**
     * Réalise l'addition des termes fournis
     */
    public void calcule(Termes t) throws AdditionneurOverflowException;
 
}
