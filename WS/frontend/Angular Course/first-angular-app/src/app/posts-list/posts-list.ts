import { Component, Input, input ,EventEmitter,OutputDecorator, Output} from '@angular/core';
import { Card } from "../card/card";

@Component({
  selector: 'app-posts-list',
  imports: [Card],
  templateUrl: './posts-list.html',
  styleUrl: './posts-list.css',
})
export class PostsList {

  //passing data from parent component to child component
  // @Input() postListTitle:string='';
  // @Input() postIsLogin:boolean=false;


  //when parent to wants direct access to child data or passing data from child component to parent component 
  // childMessage:string='HELLO!!!! FROM CHILD COMPONENT';

  postCount:number=0;

  //passing data from child component to parent component using @output  and event emitter interaction that happens on buttonclicks or user interaction
  // parentMessage:string='Message from child component using click event';
  //   @Output() MessageEvent = new EventEmitter();


  // sendMessage(){
  //   console.log("button clicked");
  //   this.MessageEvent.emit(this.parentMessage);
  // }
  
}
