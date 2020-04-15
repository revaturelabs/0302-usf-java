import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  constructor() {}

  name: string = "home";

  counter:number = 0;

  ngOnInit(): void {}

  incrementCounter() {
    this.counter++;
  }

}
