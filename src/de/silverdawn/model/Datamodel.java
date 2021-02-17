package de.silverdawn.model;

import java.util.ArrayList;

public class Datamodel {

    ArrayList<Person> _data;

    public Datamodel(){
        _data = new ArrayList<>();
        _data.add(new Person("Alf",19));
        _data.add(new Person("Bert",22));
        _data.add(new Person("Cedric",20));
        _data.add(new Person("Dörte",18));
    }

    public ArrayList<Person> get_data() {
        return _data;
    }
}
