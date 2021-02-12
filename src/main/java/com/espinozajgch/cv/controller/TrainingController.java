package com.espinozajgch.cv.controller;

import com.espinozajgch.cv.model.Skills;
import com.espinozajgch.cv.model.Training;
import com.espinozajgch.cv.serviceImpl.SkillsServiceImpl;
import com.espinozajgch.cv.serviceImpl.TrainingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController {

    @Autowired
    private TrainingServiceImpl trainingService;

    @GetMapping("/")
    public List<Training> getAll(){
        return trainingService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Training getById(@PathVariable("id") int id){
        return trainingService.buscarPorId(id);
    }

    @PostMapping("/")
    public Training create(@RequestBody Training training){
        trainingService.guardar(training);
        return training;
    }

    @PutMapping(value="/")
    public Training update(@RequestBody Training training){
        trainingService.guardar(training);
        return training;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        trainingService.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado!", HttpStatus.OK);
    }
}
