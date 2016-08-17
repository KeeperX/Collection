package by.keeperx.collection;

import java.io.Serializable;

/**
 * Created by Admin on 16.08.2016.
 */
public class Profile implements Serializable{
    private String surname;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }






}
