package org.samples.petclinic.service;

import org.samples.petclinic.domain.Owner;

import java.util.UUID;

/**
 * Business service for anything dealing with an Owner
 * Author: neil.howerton
 * Date: 04/22/2015
 */
public interface IOwnerService {
    Owner get(UUID id);
}
