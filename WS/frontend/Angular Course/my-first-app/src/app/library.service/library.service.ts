import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-library.service',
  imports: [],
  templateUrl: './library.service.html',
  styleUrl: './library.service.scss',
})



export interface BookPost {
  id:number;
  author :string;
  isbn: string;
  title: string;
  category:string;
  totalCopies:number;
  availableCopies:number;
  price: number;


}

export class LibraryService {

  
}
