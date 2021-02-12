package com.espinozajgch.cv.service;

import com.espinozajgch.cv.model.CurriculumVitae;
import com.espinozajgch.cv.model.WorkExperience;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IWorkExperienceService{
    void guardar(WorkExperience workExperience);
    void eliminar(Integer idworkExperience);
    List<WorkExperience> buscarTodas();
    WorkExperience buscarPorId(Integer idworkExperience);
    Page<WorkExperience> buscarTodas(Pageable page);
}
