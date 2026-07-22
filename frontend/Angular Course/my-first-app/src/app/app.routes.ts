import { Routes } from '@angular/router';
import { FirstComponent } from './first-component/first-component';

export const routes: Routes = [
    
  { 
    path: 'abc', 
    component: FirstComponent
 }, 


  { path: '**', redirectTo: '' },   

];