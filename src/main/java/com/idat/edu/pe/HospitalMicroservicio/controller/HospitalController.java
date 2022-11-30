package com.idat.edu.pe.HospitalMicroservicio.controller;

import com.idat.edu.pe.HospitalMicroservicio.dto.HospitalDTO;
import com.idat.edu.pe.HospitalMicroservicio.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/hospital")
public class HospitalController {

    @Autowired
    private IHospitalService service;

    @GetMapping(path = "/listar")
    public @ResponseBody List<HospitalDTO> listar() {
        return service.findAll();
    }
}
