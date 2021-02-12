package com.espinozajgch.cv.service;

import com.espinozajgch.cv.model.CurriculumVitae;
import com.espinozajgch.cv.model.Skills;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISkillsService{
    void guardar(Skills skills);
    void eliminar(Integer idSkills);
    List<Skills> buscarTodas();
    Skills buscarPorId(Integer idSkills);
    Page<Skills> buscarTodas(Pageable page);
}
