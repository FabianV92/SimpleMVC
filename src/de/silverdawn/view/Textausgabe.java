package de.silverdawn.view;

import de.silverdawn.model.Datamodel;
import de.silverdawn.model.Person;

public class Textausgabe {

    public static void printData() {

        for (Person p: Datamodel.getInstance().get_data()) {
            System.out.println(p.toString());
        }

    }

}
