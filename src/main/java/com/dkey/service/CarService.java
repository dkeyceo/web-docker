package com.dkey.service;

import com.dkey.entity.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Comparator;

@ApplicationScoped
public class CarService {
    @PersistenceContext
    private EntityManager em;

    public Car getCarByVin(String vin){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("vin"),vin));

        return em.createQuery(criteriaQuery).getResultList().stream().filter(car->car.getdReg()!=null).max(Comparator.comparing(Car::getdReg))
                .orElse(null);
    }
}
