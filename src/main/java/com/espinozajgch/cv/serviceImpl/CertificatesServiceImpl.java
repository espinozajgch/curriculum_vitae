package com.espinozajgch.cv.serviceImpl;

import com.espinozajgch.cv.model.Certificates;
import com.espinozajgch.cv.repository.CertificatesRepo;
import com.espinozajgch.cv.service.ICertificatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificatesServiceImpl implements ICertificatesService {

    @Autowired
    CertificatesRepo cr;

    @Override
    public void guardar(Certificates certificate) {
        cr.save(certificate);
    }

    @Override
    public void eliminar(Integer idCertificate) {
        cr.deleteById(idCertificate);
    }

    @Override
    public List<Certificates> buscarTodas() {
        return cr.findAll();
    }

    @Override
    public Certificates buscarPorId(Integer idCertificate) {
        return cr.findById(idCertificate).get();
    }

    @Override
    public Page<Certificates> buscarTodas(Pageable page) {
        return null;
    }
}
