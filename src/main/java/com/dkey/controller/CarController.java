package com.dkey.controller;


import com.dkey.entity.*;
import com.dkey.service.CarService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Path("cars/")
public class CarController {
    @Inject
    private CarService carService;
/*
    @GET
    @Path("/inn/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByOwnerInn (@PathParam("inn") String inn){
        return carRepository.getCarByOwnerInn(inn);
    }
    @GET
    @Path("/nreg/{nreg}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCarByNReg (@PathParam("nreg") String nReg){
        return carRepository.getCarByNReg(Transliterator.toTranslit(nReg));
    }
    */
    @GET
    @Path("/vin/{vin}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCarByVin (@PathParam("vin") String vin){
        return carService.getCarByVin(vin);
    }
    @GET
    @Path("/vin1/{vin}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseInfo getResponseByVin (@PathParam("vin") String vin){
        Car car = carService.getCarByVin(vin);
        ResponseInfo responseInfo = new ResponseInfo();
        HashMap operationKind = new HashMap();
        operationKind.put(car.getOperCode(),car.getOperName());
        HashMap operationOrgan = new HashMap();
        operationOrgan.put(car.getDepCode(),car.getDep());
        HashMap licensePlateKind = new HashMap();
        licensePlateKind.put("50","Номерні знаки білі");
        HashMap passportKind = new HashMap();
        passportKind.put("1","Свідоцтво про реєстрацію");
        HashMap vehicleKind = new HashMap();
        vehicleKind.put("1",car.getKind());
        HashMap vehicleBrand = new HashMap();
        vehicleBrand.put("3356",car.getBrand());
        HashMap vehicleModel = new HashMap();
        vehicleModel.put("1245",car.getBrand());
        HashMap vehicleColor = new HashMap();
        vehicleColor.put("1",car.getColor());
        Person person = new Person();
        person.setSurname(car.getName());
        person.setName(car.getName());
        person.setMiddlename(car.getName());
        person.setBirthday(car.getBirthday());
        person.setSex("M");
        person.setPin(car.getInnChar());
        person.setPhone("9379992");
        person.setPersonDocument(new PersonDocument());

        responseInfo.setId(UUID.randomUUID().toString());
        responseInfo.setProcessed(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));

        responseInfo.setOperation(new Operation(operationKind, car.getOperCode(),
                DateTimeFormatter.ofPattern("yyy-MM-dd").format(car.getdReg()),operationOrgan,car.getNote(),
                DateTimeFormatter.ofPattern("yyy-MM-dd").format(car.getdReg())));
        responseInfo.setLicensePlate(new LicensePlate(licensePlateKind, car.getnRegNew()));
        responseInfo.setPassport(new Passport(passportKind, car.getNewCert().substring(0,3),Integer.parseInt(car.getNewCert().substring(4))));
        responseInfo.setVehicle(new Vehicle(vehicleKind, car.getMakeYear(),vehicleBrand,
               vehicleModel, car.getVin(),car.getnEngine(),car.getnShassis(),car.getnBody(),vehicleColor));
        responseInfo.setOwner(new Owner(person));
        responseInfo.setAddress(new Address());
        return responseInfo;
    }
    /*
    @GET
    @Path("/body/{body}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCarByBody (@PathParam("body") String body){
        return carRepository.getCarByBody(body);
    }
    @GET
    @Path("/chassis/{chassis}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCarByChassis (@PathParam("chassis") String chassis){
        return carRepository.getCarByChassis(chassis);
    }
    @GET
    @Path("/engine/{engine}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCarByEngine (@PathParam("engine") String engine){
        return carRepository.getCarByEngine(engine);
    }
    @GET
    @Path("/cert/{cert}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByCert (@PathParam("cert") String cert){
        return carRepository.getCarByCert(Transliterator.toTranslit(cert));
    }
    */
}