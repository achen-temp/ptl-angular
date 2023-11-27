import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Subscription } from 'rxjs';
import { Car } from 'src/app/model/car.model';
import { UserInfo } from 'src/app/model/user-info.model';
import { CarService } from 'src/app/service/car.service';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit, OnDestroy {

  userInfo: UserInfo = new UserInfo('','','');

  userSelectedCar: Car;
  private subscription : Subscription;

  constructor(private carService: CarService){
    
  }

  submitForm(){
    //debugger;
    console.log(this.userInfo);
  }

  allFieldsEntered(): boolean{
    return this.userInfo.email != null && this.userInfo.name != null && this.userInfo.zip != null;
  }

  ngOnInit(): void {
    this.subscription  = this.carService.getSelectedCar().subscribe(
      car => this.userSelectedCar = car
    )
  }

  ngOnDestroy(): void {
      //nothing here
    this.subscription.unsubscribe();
  }

  
}


