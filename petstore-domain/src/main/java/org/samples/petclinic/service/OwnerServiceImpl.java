package org.samples.petclinic.service;

import org.samples.petclinic.data.IOwnerRepository;
import org.samples.petclinic.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * Created by neil.howerton on 10/6/2014.
 */
public class OwnerServiceImpl implements IOwnerService {
    private IOwnerRepository<Owner> ownerRepository;

    @Autowired
    public OwnerServiceImpl(IOwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner get(UUID id) {
        return ownerRepository.get(id);
    }
}
