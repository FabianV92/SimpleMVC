package de.silverdawn.view;

import de.silverdawn.model.Datamodel;
import de.silverdawn.model.Person;

public class Textausgabe {

    public static void printData() {

        Datamodel d = new Datamodel();
        for (Person p: d.get_data()) {
            System.out.println(p.toString());
        }

    }

}
