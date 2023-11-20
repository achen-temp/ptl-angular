package com.volvo.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.volvo.backend.domain.Dealer;
import com.volvo.backend.service.DealerService;

@CrossOrigin
@Controller
@RequestMapping("/dealer")
public class DealerController {
    
    @Autowired
    private DealerService service;

    @GetMapping("/{zip}")
    public ResponseEntity<Dealer> findDealer(@PathVariable String zip){
        List<Dealer> dealers = service.getDealerList();
        
        //find nearest dealer
        Dealer nearstDealer = null;
        int minDistance = Integer.MAX_VALUE;
        for(Dealer dealer : dealers){
            int distance = Math.abs(Integer.valueOf(zip) - Integer.valueOf(dealer.getZip()));
            if(distance < minDistance){
                minDistance = distance;
                nearstDealer = dealer;
            }
        }
        if(minDistance > 5000){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else{
            return ResponseEntity.ok().body(nearstDealer);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Dealer>> findAll(){
        List<Dealer> dealers = service.getDealerList();
        return ResponseEntity.ok().body(dealers);
    }
}
