package org.samples.petclinic.domain;

/**
 * Created by neil.howerton on 10/1/2014.
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
