package org.samples.petclinic.data;

import org.samples.petclinic.domain.Owner;

/**
 * Created by neil.howerton on 10/6/2014.
 */
public interface IOwnerRepository<T> extends IReadableRepository<T> {
    void add(Owner owner);
}
