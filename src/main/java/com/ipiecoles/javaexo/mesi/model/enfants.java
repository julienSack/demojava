package com.ipiecoles.javaexo.mesi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "enfants")


public class enfants {
    public enfants(List<contact> contacts, Integer id, String prenom, String nom, Integer age) {
        this.contacts = contacts;
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    @Override
    public String toString() {
        String nomParent = "";
        String nomParent2 = "";
        String prenomParent = "";
        String prenomParent2 = "";
        if ( this.getContacts().size() > 0) {

            nomParent = enfants.this.getContacts().get(0).getNom();
            prenomParent = enfants.this.getContacts().get(0).getPrenom();
            if ( this.getContacts().size() == 2) {
                nomParent2 = enfants.this.getContacts().get(1).getNom();
                prenomParent2 = enfants.this.getContacts().get(1).getPrenom();
            }


        /*} else {
            nomParent = "aucun";
            prenomParent= "aucun";*/
        }
        return "enfants{" +
                //"contacts=" + contacts +
                ", id=" + id +
                '}' + " , nom= " + nom + " , prenom= " + prenom +
                " Nom du parent= " + nomParent + " Prenom du parent= " + prenomParent +
                " Nom du parent= " + nomParent2 + " Prenom du parent= " + prenomParent2 +
                '}' ;
    }



    @ManyToMany(fetch = FetchType.EAGER)
   @JsonBackReference(value = "a_name")

    @JoinTable(name = "parent_enfant",
            joinColumns = @JoinColumn(name = "id_enfant"),
            inverseJoinColumns = @JoinColumn(name = "id_parents")
    )

    private List<contact> contacts;

    public List<contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<contact> contacts) {
        this.contacts = contacts;
    }

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String prenom;
    private String nom;
    private Integer age;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public enfants() {
    }
}

