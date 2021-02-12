package com.espinozajgch.cv.serviceImpl;

import com.espinozajgch.cv.model.Skills;
import com.espinozajgch.cv.repository.SkillsRepo;
import com.espinozajgch.cv.service.ISkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillsServiceImpl implements ISkillsService {

    @Autowired
    SkillsRepo sr;

    @Override
    public void guardar(Skills skills) {
        sr.save(skills);
    }

    @Override
    public void eliminar(Integer idSkills) {
        sr.deleteById(idSkills);
    }

    @Override
    public List<Skills> buscarTodas() {
        return sr.findAll();
    }

    @Override
    public Skills buscarPorId(Integer idSkills) {
        return sr.findById(idSkills).get();
    }

    @Override
    public Page<Skills> buscarTodas(Pageable page) {
        return null;
    }

}
