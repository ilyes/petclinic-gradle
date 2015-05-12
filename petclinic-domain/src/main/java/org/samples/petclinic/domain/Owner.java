package org.samples.petclinic.domain;

import java.util.List;

/**
 * Class for domain Owner object, which is a type of Person
 * Author: neil.howerton
 * Date: 04/22/2015
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
