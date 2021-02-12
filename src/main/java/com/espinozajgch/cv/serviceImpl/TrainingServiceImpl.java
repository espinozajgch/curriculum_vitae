package com.espinozajgch.cv.serviceImpl;

import com.espinozajgch.cv.model.Training;
import com.espinozajgch.cv.repository.TrainingRepo;
import com.espinozajgch.cv.service.ITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements ITrainingService {

    @Autowired
    TrainingRepo tr;


    @Override
    public void guardar(Training training) {
        tr.save(training);
    }

    @Override
    public void eliminar(Integer idTraining) {
        tr.deleteById(idTraining);
    }

    @Override
    public List<Training> buscarTodas() {
        return tr.findAll();
    }

    @Override
    public Training buscarPorId(Integer idTraining) {
        return tr.findById(idTraining).get();
    }

    @Override
    public Page<Training> buscarTodas(Pageable page) {
        return null;
    }
}
