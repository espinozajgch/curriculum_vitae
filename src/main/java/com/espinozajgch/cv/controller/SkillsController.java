package com.espinozajgch.cv.controller;

import com.espinozajgch.cv.model.PersonalInformation;
import com.espinozajgch.cv.model.Skills;
import com.espinozajgch.cv.serviceImpl.SkillsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillsServiceImpl skillsService;

    @GetMapping("/")
    public List<Skills> getAll(){
        return skillsService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Skills getById(@PathVariable("id") int id){
        return skillsService.buscarPorId(id);
    }

    @PostMapping("/")
    public Skills create(@RequestBody Skills skills){
        skillsService.guardar(skills);
        return skills;
    }

    @PutMapping(value="/")
    public Skills update(@RequestBody Skills skills){
        skillsService.guardar(skills);
        return skills;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        skillsService.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado!", HttpStatus.OK);
    }
}
