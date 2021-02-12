package com.espinozajgch.cv.service;

import com.espinozajgch.cv.model.CurriculumVitae;
import com.espinozajgch.cv.model.Training;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITrainingService{
    void guardar(Training training);
    void eliminar(Integer idTraining);
    List<Training> buscarTodas();
    Training buscarPorId(Integer idTraining);
    Page<Training> buscarTodas(Pageable page);
}
