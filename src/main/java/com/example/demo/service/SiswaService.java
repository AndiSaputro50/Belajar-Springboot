package com.example.demo.service;

import com.example.demo.model.SiswaModel;
import com.example.demo.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiswaService {

    private final SiswaRepository siswaRepository;

    @Autowired
    public SiswaService(SiswaRepository siswaRepository) {
        this.siswaRepository = siswaRepository;
    }

    public List<SiswaModel> getAllData() {
        return siswaRepository.findAll();
    }

    public Optional<SiswaModel> getById(Long id) {
        return siswaRepository.findById(id);
    }

    public SiswaModel createData(SiswaModel siswaModel) {
        return siswaRepository.save(siswaModel);
    }

    public SiswaModel updateData(Long id, SiswaModel updateSiswa) {
        Optional<SiswaModel> exiting =  siswaRepository.findById(id);
        if (exiting.isPresent()) {
            SiswaModel exitingSiswa = exiting.get();
            exitingSiswa.setNISN(updateSiswa.getNISN());
            exitingSiswa.setNama_siswa(updateSiswa.getNama_siswa());
            exitingSiswa.setUmur(updateSiswa.getUmur());
            exitingSiswa.setAlamat(updateSiswa.getAlamat());
            exitingSiswa.setKelas(updateSiswa.getKelas());
            exitingSiswa.setJurusan(updateSiswa.getJurusan());
            return siswaRepository.save(exitingSiswa);
        } else {
            throw new IllegalArgumentException("Id Siswa" + id + " Tidak Di Temukan");
        }
    }

    public void deleteData(Long id) {
        Optional<SiswaModel> hapusSiswa = siswaRepository.findById(id);
        if (hapusSiswa.isPresent()) {
            siswaRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Siswa dengan id = " + id + " tidak ada");
        }
    }
}
