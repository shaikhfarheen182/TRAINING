import { Component } from "@angular/core";

@Component({
  selector: 'app-navbar',
  standalone: true,
  template: `
    <h2>Nav bar component</h2>
    <p>This is a paragraph</p>
    <button>Submit</button>
  `,
  styles: [
    `h2 { color: red;background:black}`
     
  ],

  templateUrl:`./navbar.component.html`,
  styleUrl:`./navbar.component.css`

})
export class AppNavbar {

}