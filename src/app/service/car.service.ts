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
    return this.http.get("https://jsonplaceholder.typicode.com/users");

    /*
    let cars : Car[] = [
      new Car("XC90", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my23/xc90.png?h=192&iar=0&w=517", 56000),
      new Car("XC60", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my23/xc60.png?iar=0", 46450),
      new Car("XC40", "https://www.volvocars.com/images/v/-/media/project/contentplatform/data/media/navigation/my24/xc40.png?iar=0", 40100)
    ];
    return cars;
    */
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
