package ProjetFinal.Classes;

/**
 * The type Personne.
 */
public abstract class Personne {

    /**
     * The Name.
     */
    protected String name;
    /**
     * The Contact.
     */
    protected String contact;


    /**
     * Instantiates a new Personne.
     */
    public Personne() {
    }

    /**
     * Instantiates a new Personne.
     *
     * @param name    the name
     * @param contact the contact
     */
    public Personne(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets contact.
     *
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets contact.
     *
     * @param contact the contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * Envoi message.
     *
     * @param nomSms the nom sms
     */
    public void envoiMessage(String nomSms) {
    }

    /**
     * Recherche.
     *
     * @param recherche the recherche
     */
    public void recherche(String recherche){

   }
}
