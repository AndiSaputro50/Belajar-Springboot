package com.example.demo.service;

import com.example.demo.model.SekolahModel;
import com.example.demo.repository.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SekolahService {

    private final SekolahRepository sekolahRepository;

    @Autowired
    public SekolahService(SekolahRepository sekolahRepository) {
        this.sekolahRepository = sekolahRepository;
    }

    public List<SekolahModel> getAllData() {
        return sekolahRepository.findAll();
    }

    public Optional<SekolahModel> getById(Long id) {
        return sekolahRepository.findById(id);
    }

    public SekolahModel createData(SekolahModel sekolahModel) {
        return sekolahRepository.save(sekolahModel);
    }

}
