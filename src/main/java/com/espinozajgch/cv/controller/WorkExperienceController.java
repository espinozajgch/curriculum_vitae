package com.espinozajgch.cv.controller;

import com.espinozajgch.cv.model.Training;
import com.espinozajgch.cv.model.WorkExperience;
import com.espinozajgch.cv.serviceImpl.TrainingServiceImpl;
import com.espinozajgch.cv.serviceImpl.WorkExperiencieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work_experience")
public class WorkExperienceController {

    @Autowired
    private WorkExperiencieServiceImpl workExperiencieService;

    @GetMapping("/")
    public List<WorkExperience> getAll(){
        return workExperiencieService.buscarTodas();
    }

    @GetMapping("/{id}")
    public WorkExperience getById(@PathVariable("id") int id){
        return workExperiencieService.buscarPorId(id);
    }

    @PostMapping("/")
    public WorkExperience create(@RequestBody WorkExperience workExperience){
        workExperiencieService.guardar(workExperience);
        return workExperience;
    }

    @PutMapping(value="/")
    public WorkExperience update(@RequestBody WorkExperience workExperience){
        workExperiencieService.guardar(workExperience);
        return workExperience;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        workExperiencieService.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado!", HttpStatus.OK);
    }
}
