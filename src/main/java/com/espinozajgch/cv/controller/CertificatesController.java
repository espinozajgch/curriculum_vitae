package com.espinozajgch.cv.controller;

import com.espinozajgch.cv.model.Certificates;
import com.espinozajgch.cv.serviceImpl.CertificatesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificatesController {

    @Autowired
    private CertificatesServiceImpl certificatesService;

    @GetMapping("/")
    public List<Certificates> getAll(){
        return certificatesService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Certificates getById(@PathVariable("id") int id){
        return certificatesService.buscarPorId(id);
    }

    @PostMapping("/")
    public Certificates create(@RequestBody Certificates certificates){
        certificatesService.guardar(certificates);
        return certificates;
    }

    @PutMapping(value="/")
    public Certificates update(@RequestBody Certificates certificates){
        certificatesService.guardar(certificates);
        return certificates;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        certificatesService.eliminar(id);
        return new ResponseEntity<>("Registro Eliminado!", HttpStatus.OK);
    }


}
