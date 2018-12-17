package com.ipiecoles.javaexo.mesi;

import com.ipiecoles.javaexo.mesi.model.contact;
import com.ipiecoles.javaexo.mesi.model.enfants;
import com.ipiecoles.javaexo.mesi.repository.ContactRepository;
import com.ipiecoles.javaexo.mesi.repository.EnfantsRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MesiApplicationTests {

    @Autowired
    private EnfantsRepository enfantsRepository;
    @Autowired
    private ContactRepository contactRepository;

    @Test
    public void testConnexionBDD() {

    }

  /*  @Test
    public void test() {
        //Iterable<contact> contacts = contactRepository.findAll();
        Iterable<enfants> listEnfants = enfantsRepository.findAll();
        //for (enfants e : enfant) {
            // System.out.println(e);
        //}
        {

        }
        //for (contact c : contacts) {
            //     System.out.println(c);

            for (enfants e : listEnfants) {
                System.out.println(e);

            }

    }*/

    @Test
    public void testCheckBadIdContact(){
        //Given = Initialisation des données d'entrée
        Integer id_contact = 3;
        contact a = new contact();

        //When = Exécution de la méthode à tester

        boolean b = contactRepository.exists(id_contact);

        //Then = Vérifications de ce qu'a fait la méthode
        Assertions.assertThat(b).isTrue();
    }
}

