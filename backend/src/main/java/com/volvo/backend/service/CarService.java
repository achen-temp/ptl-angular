package com.volvo.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.volvo.backend.domain.Car;

@Service
public class CarService {
    
    public List<Car> getCarList(){
        List<Car> list = new ArrayList<>();
        list.add(new Car("XC90", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my23/xc90.png?h=192&iar=0&w=517", 56000.00));
        list.add(new Car("XC60", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my23/xc60.png?iar=0", 46450.00));
        list.add(new Car("XC40", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my24/xc40.png?iar=0", 40100.00));
        return list;
    }
}
