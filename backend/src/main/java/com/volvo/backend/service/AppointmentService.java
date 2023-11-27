package com.volvo.backend.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.volvo.backend.database.Schema;
import com.volvo.backend.domain.Appointment;
import com.volvo.backend.domain.Dealer;

@Service
public class AppointmentService {

    public Appointment addAppointment(Appointment appointment) throws Exception {
        //appointment is recorded.
        Dealer matchedDealer = null;
        for(Dealer dealer: Schema.dealers){ //find dealer
            if(dealer.getName().equalsIgnoreCase(appointment.getDealer().getName())){
                matchedDealer = dealer;
                break;
            }
        }
        if(matchedDealer == null){
            throw new Exception("Dealer not found");
        }else{
            Map<String, Boolean> map = matchedDealer.getSlots();
            if(!map.containsKey(appointment.getSlot()) || map.get(appointment.getSlot()) == false){ //dealer slot should be available
                throw new Exception("Slot is not available");
            }else{
                matchedDealer.getSlots().put(appointment.getSlot(), false); //set to not available
            }
        }
        
        appointment.setAppointmentId(System.nanoTime());
        Schema.appointments.add(appointment);

        return appointment;
    }
    

}
