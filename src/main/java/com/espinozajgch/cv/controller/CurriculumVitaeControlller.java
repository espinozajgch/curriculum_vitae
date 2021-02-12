package com.espinozajgch.cv.controller;

import com.espinozajgch.cv.Application;
import com.espinozajgch.cv.model.CurriculumVitae;
import com.espinozajgch.cv.model.PersonalInformation;
import com.espinozajgch.cv.model.Skills;
import com.espinozajgch.cv.model.WorkExperience;
import com.espinozajgch.cv.serviceImpl.CurriculumVitaeServiceImpl;
import com.espinozajgch.cv.serviceImpl.PersonalInformationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CurriculumVitaeControlller {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Autowired
    private CurriculumVitaeServiceImpl curriculumVitaeService;

    @GetMapping("/")
    public List<CurriculumVitae> getAll(){
        return curriculumVitaeService.buscarTodas();
    }

    @GetMapping("/{id}")
    public CurriculumVitae getById(@PathVariable("id") int id){
        return curriculumVitaeService.buscarPorId(id);
    }

    @PostMapping("/")
    public CurriculumVitae create(@RequestBody CurriculumVitae curriculumVitae){
        curriculumVitaeService.guardar(curriculumVitae);
        return curriculumVitae;
    }

    @PutMapping(value="/")
    public CurriculumVitae update(@RequestBody CurriculumVitae curriculumVitae){
        curriculumVitaeService.guardar(curriculumVitae);
        return curriculumVitae;
    }

    /*@DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        curriculumVitaeService.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado!", HttpStatus.OK);
    }*/
}
