import { Component, EventEmitter, Input, Output } from '@angular/core';
import { BehaviorSubject, filter, first, map, take } from 'rxjs';
import { Car } from 'src/app/model/car.model';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent {
    @Input() car : Car | undefined;
    @Output() selectedCar = new EventEmitter<Car>();

    isFreeCar : boolean = false;

    constructor(){}

    selectCar(car: Car | any){
      this.selectedCar.emit(car);
    }
}
