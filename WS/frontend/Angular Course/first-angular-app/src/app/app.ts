import { Component, signal,ViewChild,AfterViewInit, ViewContainerRef } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AppNavbar } from './navbar/navbar.component';
import { Header } from './header/header';
import { FormsModule } from '@angular/forms'
import { NgFor, NgIf, NgTemplateOutlet, NgSwitch, NgSwitchCase, NgSwitchDefault, NgStyle, NgClass, NgComponentOutlet } from '@angular/common'
import { PostsList } from './posts-list/posts-list';
import { Card } from './card/card';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    AppNavbar, 
    Header, 
    FormsModule, 
    NgIf,
    NgTemplateOutlet, 
    NgFor,
    NgSwitch,
    NgSwitchCase,
    NgSwitchDefault,
    NgStyle,
    NgClass,
    PostsList,
    Card,
    NgComponentOutlet
  ],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App{
// export class App implements AfterViewInit{
  // protected readonly title = signal('first-angular-app');
  // title:string = 'this is loaded dynamically';
  // imgURL:string='https://images.unsplash.com/photo-1773332585754-f1436987743b?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D';

  // isDisabled:boolean=true;
  
  // isActive:boolean=true;

  // fruitName:string='Apple';

  // fruits : string ='Orange';    //class binding

    // event binding
  
  // buttonClick(){
  //   // console.log("button clicked")
  //   alert("button clicked");

  // }

  // mouseOver(){
  //   alert("mouseOver");
  // }

  // keyEnter(event:any){
  //   console.log(event.keyCode)

  //   if(event.keyCode == 13){
  //     console.log('Enter Key Pressed');
  //   }
  //   }

  //   keyupFiltering(){
  //     console.log('KEYUP EVENT FILTERING');
  //   }

  //   keyupFilteringforA(){
  //     console.log('KEYUP EVENT FILTERING FOR A');
  //   }

  //   keyupFilteringforUserInput(user:HTMLInputElement){
  //     console.log(user.id);
  //   }


//TWO WAY DATA BINDING
// onKeyup() {
//   alert(this.textValue);
// }
//   textValue:string=""
 

    isLoggedIn:boolean = true;
    // userName : string = 'Farheen';

    // isAdmin:boolean=true;
    // isMember:boolean=true;
    // isGuest:boolean=true;

    // userRole : string = 'ADMIN';

    // users:Array<string>=['JOHN','JHONNY','JOAN']

    // usersObj:Array<any> = [
    //   {id:1,name:'john',email:'john@gmail.com'},
    //   {id:2,name:'smith',email:'smith@gmail.com'},
    //   {id:3,name:'sam',email:'sam@gmail.com'},
    //   {id:4,name:'raj',email:'raj@gmail.com'},
    // ]

    // onDelete(index:number){
    //     console.log("deleted");
    // }

    // usersRole : string = ''

      postTitle:string = 'Post 1';
      appIsLogin:boolean=false;


      
  //when parent to wants direct access to child data or passing data from child component to parent component
      // message:string='';
      // @ViewChild(PostsList) childMessage:any;
      // constructor(){
      //   console.log(this.childMessage);
      // }
      
      // ngAfterViewInit() {
      //   console.log(this.childMessage.childMessage);
      //   this.message=this.childMessage.childMessage;
      // }


      // receiveMessage(message:string){
      //     console.log(message);
      // }



        //render components programmatically

      // constructor(private viewContainer:ViewContainerRef){}

      // loadComponent(){
      //   // return PostsList;

      //   this.viewContainer.createComponent(PostsList);
      // }

      // removeComponent(){
      //   this.viewContainer.remove();
      // }

      

}
