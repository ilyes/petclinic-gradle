package org.samples.petclinic.data;

import org.samples.petclinic.domain.Owner;

/**
 * Interface for the owner repository.
 * Author: neil.howerton
 * Date: 04/22/2015
 */
public interface IOwnerRepository<T> extends IReadableRepository<T> {
    void add(Owner owner);
}
