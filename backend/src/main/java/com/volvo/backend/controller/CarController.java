package com.volvo.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.volvo.backend.domain.Car;
import com.volvo.backend.service.CarService;

@CrossOrigin
@Controller
@RequestMapping("/car")
public class CarController {
    
    @Autowired
    private CarService service;

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCarModels(){
         return new ResponseEntity<List<Car>>(service.getCarList(), null, HttpStatus.OK);
    }

}
