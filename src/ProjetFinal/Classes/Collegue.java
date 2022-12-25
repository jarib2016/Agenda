package ProjetFinal.Classes;

/**
 * The type Collegue.
 */
public class Collegue extends  Personne{

    /**
     * The Departement.
     */
    protected String departement;

    /**
     * Instantiates a new Collegue.
     */
    public Collegue(){

    }

    /**
     * Instantiates a new Collegue.
     *
     * @param name        the name
     * @param contact     the contact
     * @param departement the departement
     */
    public Collegue(String name, String contact, String departement) {
        super(name, contact);
        this.departement = departement;
    }

    /**
     * Gets departement.
     *
     * @return the departement
     */
    public String getDepartement() {
        return departement;
    }

    /**
     * Sets departement.
     *
     * @param departement the departement
     */
    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public void envoiMessage(String nomSms) {
        System.out.println("Bonjour monsieur comment allez vous ? je suis deja au travail");
    }

    @Override
    public void recherche(String recherche) {
        if (getDepartement().equalsIgnoreCase(recherche)) {
            System.out.println(getName());
        }
    }
}
