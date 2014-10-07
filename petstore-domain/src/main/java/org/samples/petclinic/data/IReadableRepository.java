package org.samples.petclinic.data;

import java.util.UUID;

/**
 * Created by neil.howerton on 10/6/2014.
 */
public interface IReadableRepository<T> {
    T get(UUID id);
}
