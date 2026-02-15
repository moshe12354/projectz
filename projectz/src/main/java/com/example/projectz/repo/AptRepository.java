package com.example.projectz.repo;
import com.example.projectz.model.Apt;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AptRepository extends CrudRepository<Apt,Long> {
    Optional<Apt> findByCity(String city);
    Optional<Apt> findByStreet(String street);
    Optional<Apt> findByType(String Type);
    Optional<Apt> findByPricePerMeter(int pricePerMeter);
    Optional<Apt> findTopByOrderByPricePerMeterAsc();
    Optional<Apt> findTopByOrderByPricePerMeterDesc();


}
