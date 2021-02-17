package de.silverdawn;

public class Person {
    private String _name;
    private int _alter;

    public Person(String _name, int _alter) {
        this._name = _name;
        this._alter = _alter;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_alter() {
        return _alter;
    }

    public void set_alter(int _alter) {
        this._alter = _alter;
    }

    @Override
    public String toString() {
        return _name + "," +
                _alter +
                " Jahre ";
    }
}
