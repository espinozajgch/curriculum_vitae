package com.espinozajgch.cv.serviceImpl;

import com.espinozajgch.cv.model.CurriculumVitae;
import com.espinozajgch.cv.repository.CurriculumVitaeRepo;
import com.espinozajgch.cv.service.ICurriculumVitaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumVitaeServiceImpl implements ICurriculumVitaeService {

    @Autowired
    CurriculumVitaeRepo cvr;

    @Override
    public void guardar(CurriculumVitae curriculumVitae) {
        cvr.save(curriculumVitae);
    }

    @Override
    public void eliminar(Integer idCurriculumVitae) {
        cvr.deleteById(idCurriculumVitae);
    }

    @Override
    public List<CurriculumVitae> buscarTodas() {
        return cvr.findAll();
    }

    @Override
    public CurriculumVitae buscarPorId(Integer idCurriculumVitae) {
        return cvr.findById(idCurriculumVitae).get();
    }

    @Override
    public Page<CurriculumVitae> buscarTodas(Pageable page) {
        return null;
    }
}
