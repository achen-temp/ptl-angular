package com.volvo.backend.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.volvo.backend.domain.Appointment;
import com.volvo.backend.domain.Car;
import com.volvo.backend.domain.Dealer;

public class Schema {
    public static List<Car> cars;
    public static List<Appointment> appointments;
    public static List<Dealer> dealers;

    static{
        //create "car" table
        cars = new ArrayList<>();
        cars.add(new Car("XC90", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my23/xc90.png?h=192&iar=0&w=517", 56000.00));
        cars.add(new Car("XC60", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my23/xc60.png?iar=0", 46450.00));
        cars.add(new Car("XC40", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my24/xc40.png?iar=0", 40100.00));
    
        //create dealer table
        dealers = new ArrayList<>();
        
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
            dealers.add(dealer);
        }

        //appointment
        appointments = new ArrayList<>();
    }
}
