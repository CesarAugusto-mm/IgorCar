package com.IgorCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IgorCar.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro , Long>{

}
