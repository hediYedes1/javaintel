package classesPackage;

public final class Service extends Prestation
{
    private int nombre_heures ;
    private int prix_heures ;

    public int getNombre_heures() {
        return nombre_heures;
    }

    public int getPrix_heures() {
        return prix_heures;
    }

    public void setNombre_heures(int nombre_heures) {
        this.nombre_heures = nombre_heures;
    }

    public void setPrix_heures(int prix_heures) {
        this.prix_heures = prix_heures;
    }

    public Service(int id, String nom_projet, String nom_client, int nombre_heures, int prix_heures) {
        super(id, nom_projet, nom_client);
        this.nombre_heures = nombre_heures;
        this.prix_heures = prix_heures;
    }

    @Override
    public String toString() {
        String d = super.toString();
                return d+= ", prix_heures=" + prix_heures +
                ", nombre_heures=" + nombre_heures

                ;
    }
}
