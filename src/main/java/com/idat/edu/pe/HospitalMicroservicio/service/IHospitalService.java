package com.idat.edu.pe.HospitalMicroservicio.service;

import com.idat.edu.pe.HospitalMicroservicio.dto.HospitalDTO;
import com.idat.edu.pe.HospitalMicroservicio.model.Hospital;

import java.util.List;

public interface IHospitalService {
    List<HospitalDTO> findAll();
}
