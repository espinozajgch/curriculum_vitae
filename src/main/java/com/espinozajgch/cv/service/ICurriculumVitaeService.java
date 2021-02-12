package com.espinozajgch.cv.service;

import com.espinozajgch.cv.model.CurriculumVitae;
import com.espinozajgch.cv.model.PersonalInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICurriculumVitaeService {
    void guardar(CurriculumVitae curriculumVitae);
    void eliminar(Integer idCurriculumVitae);
    List<CurriculumVitae> buscarTodas();
    CurriculumVitae buscarPorId(Integer idCurriculumVitae);
    Page<CurriculumVitae> buscarTodas(Pageable page);
}
