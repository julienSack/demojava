package com.ipiecoles.javaexo.mesi.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "personnel")

public class contact {
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "contacts")
    @JsonManagedReference(value = "a_name")


    private List<enfants> enfants;

    public contact() {
    }

    public contact(List<com.ipiecoles.javaexo.mesi.model.enfants> enfants, Integer id, String nom, String prenom, String adresse, String mail, Integer numero_telephone) {
        this.enfants = enfants;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.numero_telephone = numero_telephone;
    }

    public contact(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public List<com.ipiecoles.javaexo.mesi.model.enfants> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<com.ipiecoles.javaexo.mesi.model.enfants> enfants) {
        this.enfants = enfants;
    }

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private Integer numero_telephone;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getNumero_telephone() {
        return numero_telephone;
    }

    public void setNumero_telephone(Integer numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                '}' + ", nom=" + nom + " , prenom=" + prenom + '}';
    }


}

