package com.idat.edu.pe.HospitalMicroservicio.service;

import com.idat.edu.pe.HospitalMicroservicio.dto.HospitalDTO;
import com.idat.edu.pe.HospitalMicroservicio.model.Hospital;
import com.idat.edu.pe.HospitalMicroservicio.repository.IHospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HospitalServiceImpl implements IHospitalService {

    @Autowired
    private IHospitalRepository repository;

    @Override
    public List<HospitalDTO> findAll() {
        return repository.findAll().stream().map(hospital -> new HospitalDTO(hospital.getIdHospital(), hospital.getHospital())).collect(Collectors.toList());
    }
}
