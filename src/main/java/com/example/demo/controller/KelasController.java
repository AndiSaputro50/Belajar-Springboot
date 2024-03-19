//package com.example.demo.controller;
//
//import com.example.demo.model.KelasModel;
//import com.example.demo.model.SiswaModel;
//import com.example.demo.service.KelasService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/kelas")
//public class KelasController {
//
//    @Autowired
//    private KelasService kelasService;
//
//    @GetMapping
//    public ResponseEntity<List<KelasModel>> getAllData() {
//        List<KelasModel> kelasModels = kelasService.getAllData();
//        return ResponseEntity.ok(kelasModels);
//    }
//
//    @GetMapping("/{id}")
//    public  ResponseEntity<KelasModel> getById(@PathVariable Long id) {
//        Optional<KelasModel> kelasModels = kelasService.getById(id);
//        return  kelasModels.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping
//    public ResponseEntity<KelasModel> createData(@RequestBody KelasModel kelasModel) {
//        KelasModel newData = kelasService.createData(kelasModel);
//        return new ResponseEntity<>(newData, HttpStatus.OK);
//    }
//
//}
