package com.espinozajgch.cv.service;

import com.espinozajgch.cv.model.Certificates;
import com.espinozajgch.cv.model.PersonalInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPersonalInformationService {
    void guardar(PersonalInformation personalInformation);
    void eliminar(Integer idPersonalInformation);
    List<PersonalInformation> buscarTodas();
    PersonalInformation buscarPorId(Integer idPersonalInformation);
    Page<PersonalInformation> buscarTodas(Pageable page);
}
