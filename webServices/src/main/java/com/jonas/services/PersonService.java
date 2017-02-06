package com.jonas.services;

import com.jonas.requests.CreatePersonRequest;
import com.jonas.responses.CreatePersonResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;


@WebService
public interface PersonService {

  @WebMethod
  @WebResult(name = "createPersonResponse")
  @XmlElement(required = true, nillable = false)
  CreatePersonResponse personCreate(
        @XmlElement(required = true, nillable = false)
        @WebParam(name = "createUserRequest")
              CreatePersonRequest createUserRequest);
}
