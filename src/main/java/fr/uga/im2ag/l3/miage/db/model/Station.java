package fr.uga.im2ag.l3.miage.db.model;


import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Station {
    @Id
    private Long id ;

    private String adresse ;

    private Statut status;

    @OneToMany
    private List<Bornette> Contient ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatut() {
        return adresse;
    }

    public void setStatus(Statut status) {
        this.status = status;
    }

    public void setStatut(String adresse) {
        this.adresse = adresse;
    }
}
