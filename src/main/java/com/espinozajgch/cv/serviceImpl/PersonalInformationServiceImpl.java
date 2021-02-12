package com.espinozajgch.cv.serviceImpl;

import com.espinozajgch.cv.model.PersonalInformation;
import com.espinozajgch.cv.repository.PersonalInformationRepo;
import com.espinozajgch.cv.service.IPersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalInformationServiceImpl implements IPersonalInformationService {

    @Autowired
    private PersonalInformationRepo pir;

    @Override
    public void guardar(PersonalInformation personalInformation) {
        pir.save(personalInformation);
    }

    @Override
    public void eliminar(Integer idPersonalInformation) {
        pir.deleteById(idPersonalInformation);
    }

    @Override
    public List<PersonalInformation> buscarTodas() {
        return pir.findAll();
    }

    @Override
    public PersonalInformation buscarPorId(Integer idPersonalInformation) {
        return pir.findById(1).get();
    }

    @Override
    public Page<PersonalInformation> buscarTodas(Pageable page) {
        return null;
    }
}
