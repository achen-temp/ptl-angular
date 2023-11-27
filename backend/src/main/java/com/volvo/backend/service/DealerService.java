package com.volvo.backend.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.volvo.backend.domain.Dealer;

@Service
public class DealerService {

    public List<Dealer> getDealerList(){
        List<Dealer> list = new ArrayList<>();
        
        for(int i = 1; i < 10; i++){
            Dealer dealer = new Dealer();
            dealer.setName("New York Dealer #" + i);
            StringBuilder address = new StringBuilder();
            address.append(123 - i).append(" ")
                    .append('A' + i).append("th Street, New York, NY,")
                    .append("1000").append(i);
            dealer.setAddress(address.toString());
            dealer.setPhone("347-625-174" + i);
            dealer.setZip("1000" + i);
            Map<String, Boolean> slots = new HashMap<>();
            slots.put("2023-11-20 Morning", true);
            slots.put("2023-11-20 Afternoon", true);
            slots.put("2023-11-20 Evening", true);
            dealer.setSlots(slots);
            list.add(dealer);
        }

        return list;
    }
    
}
