package org.samples.petclinic.service;

import org.samples.petclinic.domain.Owner;

import java.util.UUID;

/**
 * Created by neil.howerton on 10/6/2014.
 */
public interface IOwnerService {
    Owner get(UUID id);
}
