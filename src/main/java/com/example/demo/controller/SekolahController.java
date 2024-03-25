package com.example.demo.controller;

import com.example.demo.model.SekolahModel;
import com.example.demo.model.SiswaModel;
import com.example.demo.service.SekolahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sekolah")
public class SekolahController {
    @Autowired
    private SekolahService sekolahService;

    @GetMapping
    public ResponseEntity<List<SekolahModel>> getAllData() {
        List<SekolahModel> sekolahModels = sekolahService.getAllData();
        return ResponseEntity.ok(sekolahModels);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<SekolahModel> getById(@PathVariable Long id) {
        Optional<SekolahModel> sekolahModel = sekolahService.getById(id);
        return  sekolahModel.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<SekolahModel> createData(@RequestBody SekolahModel sekolahModel) {
        SekolahModel newData = sekolahService.createData(sekolahModel);
        return new ResponseEntity<>(newData, HttpStatus.OK);
    }

}
