package com.espinozajgch.cv.serviceImpl;

import com.espinozajgch.cv.model.WorkExperience;
import com.espinozajgch.cv.repository.WorkExperienceRepo;
import com.espinozajgch.cv.service.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkExperiencieServiceImpl implements IWorkExperienceService {

    @Autowired
    WorkExperienceRepo wer;

    @Override
    public void guardar(WorkExperience workExperience) {
        wer.save(workExperience);
    }

    @Override
    public void eliminar(Integer idworkExperience) {
        wer.deleteById(idworkExperience);
    }

    @Override
    public List<WorkExperience> buscarTodas() {
        return wer.findAll();
    }

    @Override
    public WorkExperience buscarPorId(Integer idworkExperience) {
        return wer.findById(idworkExperience).get();
    }

    @Override
    public Page<WorkExperience> buscarTodas(Pageable page) {
        return null;
    }
}
