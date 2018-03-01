import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-02-26.
 */
public class Entreprise {
    private String nomJob;
    private Adresse adresseJob;
    private Scanner sc=new Scanner(System.in);

    public String getNomJob() {
        return nomJob;
    }

    public void setNomJob(String nomJob) {
        this.nomJob = nomJob;
    }

    public Adresse getAdresseJob() {
        return adresseJob;
    }

    public void setAdresseJob(Adresse adresseJob) {
        this.adresseJob = adresseJob;
    }
    public void ajouterEntreprise(){
        System.out.println("  Entreprise :");
        System.out.println("    Nom :");
        setNomJob(sc.next());
        Adresse adresseJob=new Adresse();
        adresseJob.ajouterAdresse();
        setAdresseJob(adresseJob);
    }
}
