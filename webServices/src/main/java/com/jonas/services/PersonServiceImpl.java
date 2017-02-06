package com.jonas.services;

import com.jonas.requests.CreatePersonRequest;
import com.jonas.responses.CreatePersonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonServiceImpl implements PersonService {

  private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);

  @Override
  public CreatePersonResponse personCreate(CreatePersonRequest createPerson) {

    log.info(createPerson.getEmail());

    CreatePersonResponse createPersonResponse = new CreatePersonResponse();
    createPersonResponse.setMessage("CREATION SUCCESSFUL");
    createPersonResponse.setStatus("SUCCESS");

    return createPersonResponse;
  }
}
