package com.espinozajgch.cv.service;

import com.espinozajgch.cv.model.Certificates;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICertificatesService {
    void guardar(Certificates certificate);
    void eliminar(Integer idCertificate);
    List<Certificates> buscarTodas();
    Certificates buscarPorId(Integer idCertificate);
    Page<Certificates> buscarTodas(Pageable page);
}
