import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarmodelsComponent } from './view/carmodels/carmodels.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MyUpperCasePipe } from './util/my-upper-case.pipe';
import { UserInfoComponent } from './view/user-info/user-info.component';
import { CarComponent } from './view/car/car.component';

@NgModule({
  declarations: [
    AppComponent,
    CarmodelsComponent,
    MyUpperCasePipe,
    UserInfoComponent,
    CarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
