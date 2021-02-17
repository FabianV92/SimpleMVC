package de.silverdawn.model;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Datamodel {

    private static Datamodel _instance;

    private ArrayList<Person> _data;

    public static Datamodel getInstance(){
        if(_instance == null){
            _instance = new Datamodel();
        }
        return _instance;
    }

    private Datamodel(){
        _data = new ArrayList<>();
        _data.add(new Person("Alf",19));
        _data.add(new Person("Bert",22));
        _data.add(new Person("Cedric",20));
        _data.add(new Person("Dörte",18));
    }

    public Person getObjectAtIndex(int index)
    {
        return _data.get(index);
    }

    public ArrayList<Person> get_data() {
        return _data;
    }
}
