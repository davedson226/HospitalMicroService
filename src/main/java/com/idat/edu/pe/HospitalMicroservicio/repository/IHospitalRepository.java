package com.idat.edu.pe.HospitalMicroservicio.repository;

import com.idat.edu.pe.HospitalMicroservicio.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalRepository extends JpaRepository<Hospital, Integer> {
}
