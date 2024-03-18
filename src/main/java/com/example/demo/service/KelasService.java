package com.example.demo.service;

import com.example.demo.model.KelasModel;
import com.example.demo.model.SekolahModel;
import com.example.demo.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KelasService {

    private final KelasRepository kelasRepository;

    @Autowired
    public KelasService(KelasRepository kelasRepository) {
        this.kelasRepository = kelasRepository;
    }

    public List<KelasModel> getAllData() {
        return kelasRepository.findAll();
    }

    public Optional<KelasModel> getById(Long id) {
        return kelasRepository.findById(id);
    }

    public KelasModel createData(KelasModel kelasModel) {
        return kelasRepository.save(kelasModel);
    }

}
