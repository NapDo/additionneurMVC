package nap.soft.project.additionneur.architecturemvc;

/**
 * Interface que les vues doivent présenter au modèle
 */
public interface AdditionneurVue {
    
    /**
     * Permet à la vue de se mettre à jour car le modèle lui notifie le 
     * changement (éventuellement par le biais d'un contrôleur). 
     */
    public void notifieChangement() ; 

}
