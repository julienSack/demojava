package com.ipiecoles.javaexo.mesi.model;

import java.util.ArrayList;
import java.util.List;


import com.ipiecoles.javaexo.mesi.repository.ContactRepository;
import com.ipiecoles.javaexo.mesi.repository.EnfantsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {

    @Autowired
    ContactRepository contactRepository;
    @Autowired
    EnfantsRepository enfantsRepository;

    @RequestMapping("/contact")
    public ArrayList<contact> contacts(@RequestParam(value = "prenom", defaultValue = "aucun") String prenom, @RequestParam(value = "nom", defaultValue = "aucun") String nom)  {
        List<contact> ListContact = (List<contact>) contactRepository.findAll();
        ArrayList<contact> selection = new ArrayList<>();


        for (contact l : ListContact) {
        if ((prenom.equals(l.getPrenom())) && (nom.equals(l.getNom()))) {

                selection.add(l);
                System.out.println(l);
            }

        }
        return selection;

    }




    @RequestMapping("/enfants")
    public ArrayList<enfants> enfant(@RequestParam(value = "prenom", defaultValue = "aucun") String prenom, @RequestParam(value = "nom", defaultValue = "aucun") String nom)  {
        List<enfants> ListEnfant = (List<enfants>) enfantsRepository.findAll();
        ArrayList<enfants> selection = new ArrayList<>();


        for (enfants l : ListEnfant) {
            if ((prenom.equals(l.getPrenom())) | (nom.equals(l.getNom()))) {

                selection.add(l);
                System.out.println(l);
            }

        }
        return selection;

    }

}
