package com.espinozajgch.cv.controller;

import com.espinozajgch.cv.model.Certificates;
import com.espinozajgch.cv.model.PersonalInformation;
import com.espinozajgch.cv.serviceImpl.PersonalInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal_information")
public class PersonalInformationController {

    @Autowired
    private PersonalInformationServiceImpl personalInformationService;

    @GetMapping("/")
    public List<PersonalInformation> getAll(){
        return personalInformationService.buscarTodas();
    }

    @GetMapping("/{id}")
    public PersonalInformation getById(@PathVariable("id") int id){
        return personalInformationService.buscarPorId(id);
    }

    @PostMapping("/")
    public PersonalInformation create(@RequestBody PersonalInformation personalInformation){
        personalInformationService.guardar(personalInformation);
        return personalInformation;
    }

    @PutMapping(value="/")
    public PersonalInformation update(@RequestBody PersonalInformation personalInformation){
        personalInformationService.guardar(personalInformation);
        return personalInformation;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        personalInformationService.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado!", HttpStatus.OK);
    }
}

