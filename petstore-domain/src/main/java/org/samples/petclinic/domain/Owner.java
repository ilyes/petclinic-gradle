package org.samples.petclinic.domain;

import java.util.List;

/**
 * Created by neil.howerton on 10/1/2014.
 */
public class Owner extends Person {
    private List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
