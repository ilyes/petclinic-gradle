package org.samples.petclinic.data;

import java.util.UUID;

/**
 * Base interface for a repository that can read data from a data source.
 * Author: neil.howerton
 * Date: 04/22/2015
 */
public interface IReadableRepository<T> {
    T get(UUID id);
}
