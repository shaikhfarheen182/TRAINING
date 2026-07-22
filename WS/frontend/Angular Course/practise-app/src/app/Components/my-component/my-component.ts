import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-my-component',
  imports: [CommonModule,FormsModule],
  templateUrl: './my-component.html',
  styleUrl: './my-component.css',
})
export class MyComponent {
  //appName = 'TEST APP';  //data binding
  //imageUrl = 'https://static.vecteezy.com/system/resources/thumbnails/057/068/323/small/single-fresh-red-strawberry-on-table
  // -green-background-food-fruit-sweet-macro-juicy-plant-image-photo.jpg';  //propertybinding

  // showMessage(){
  //   alert('button clicked');  //event binding
  // }

  username:string='happy';
}
