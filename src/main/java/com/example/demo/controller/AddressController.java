//package com.example.demo.controller;
//
//import com.example.demo.entity.Address;
//import com.example.demo.repository.AddressRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class AddressController {
//
//    @Autowired
//    private AddressRepository addressRepository;
//
//    @GetMapping("/getAddress")
//    public List<Address> getEmployees(){
//        return addressRepository.findAll();
//    }
//}
