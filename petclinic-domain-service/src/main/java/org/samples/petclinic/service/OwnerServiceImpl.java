package org.samples.petclinic.service;

import org.samples.petclinic.data.IOwnerRepository;
import org.samples.petclinic.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * Implementation of Owner service
 * Author: neil.howerton
 * Date: 04/22/2015
 */
public class OwnerServiceImpl implements IOwnerService {
    private IOwnerRepository<Owner> ownerRepository;

    @Autowired
    public OwnerServiceImpl(IOwnerRepository<Owner> ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner get(UUID id) {
        return ownerRepository.get(id);
    }
}
