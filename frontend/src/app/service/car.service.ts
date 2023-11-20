import { Injectable } from '@angular/core';
import { Car } from '../model/car.model';
import { BehaviorSubject, Observable, Subject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  private selectedCarSubject = new BehaviorSubject<Car>(new Car('', '', 0));
  private selectedCarObservable$ : Observable<Car>;

  //inject httpService
  constructor(private http: HttpClient) { }

  //get all cars - rest api
  getCars() {
    return this.http.get("url");
  }

  public setSelectedCar(car: Car){
    this.selectedCarSubject.next(car);
  }

  public getSelectedCar() : Observable<Car>{
    this.selectedCarObservable$ = this.selectedCarSubject.asObservable();
    return this.selectedCarObservable$;
  }

  public getSelectedCar2(){
    return this.selectedCarSubject;
  }

}
