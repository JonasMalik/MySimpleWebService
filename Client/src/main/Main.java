package main;

import services.CreatePersonRequest;
import services.CreatePersonResponse;
import services.PersonService;
import services.PersonServiceImplService;


/**
 * Created by jonas on 2017-02-02.
 */
public class Main {

    public static void main(String[] args){


//        String ipAdress = "212.58.246.79";
//        GeoIPService geoIPService = new GeoIPService();
//        GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
//        GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAdress);
//        System.out.println(ipAdress);
//        System.out.println(geoIP.getCountryName());

        CreatePersonRequest person = new CreatePersonRequest();
        person.setEmail("jonasmalik94@gmail.com");
        person.setUsername("Jonas");
        person.setPassword("Password");

        PersonServiceImplService serviceImplService = new PersonServiceImplService();
        PersonService personService = serviceImplService.getPersonServiceImplPort();
        CreatePersonResponse personResponse = personService.personCreate(person);

        System.out.println(personResponse.getStatus());
        System.out.println(personResponse.getMessage());

    }
}
