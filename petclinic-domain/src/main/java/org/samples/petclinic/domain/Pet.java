package org.samples.petclinic.domain;

/**
 * Class for domain Pet object
 * Author: neil.howerton
 * Date: 04/22/2015
 */
public class Pet {
    private String name;
    private PetType petType;

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        name = petName;
    }

    public Enum getPetType() {
        return petType;
    }

    public void setPetType(PetType type) {
        petType = type;
    }
}
