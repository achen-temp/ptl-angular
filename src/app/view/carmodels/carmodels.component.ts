import { Component, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { Subscription } from 'rxjs';
import { Car } from 'src/app/model/car.model';
import { CarService } from 'src/app/service/car.service';

@Component({
  selector: 'app-carmodels',
  templateUrl: './carmodels.component.html',
  styleUrls: ['./carmodels.component.css']
})
export class CarmodelsComponent implements OnInit, OnDestroy{

  selectedCar : Car | undefined;

  cars : Car[] = [];

  private subscription: Subscription;

  constructor(private carService : CarService){
    
  }

  ngOnInit(): void {
    this.subscription = this.carService.getCars().subscribe(
      cars => console.log(cars)
    )
  }

  ngOnDestroy(): void {
      this.subscription.unsubscribe();
  }

  userSelected(car: Car | any){
    this.selectedCar = car;
    this.carService.setSelectedCar(car);
  }


}
