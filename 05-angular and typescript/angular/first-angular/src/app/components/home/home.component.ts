import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"],
})
export class HomeComponent implements OnInit {
  constructor() {}

  name: string = "home";

  counter: number = 0;

  color: string = "red";

  someBool: boolean = true;

  myName: string = "slim shady";

  superheroes: string[] = [
    "deadpool",
    "spiderman",
    "captain america",
    "batman aquaman",
    "question",
    "flash",
    "riddler",
    "black panther",
    "wonder woman",
  ];

  url: string = "https://i.ytimg.com/vi/KIBmT9UfATs/maxresdefault.jpg";

  styles = {
    background: "yellow",
    border: "30px dashed yellow",
  };

  toggleBool() {
    this.someBool = !this.someBool;
  }

  ngOnInit(): void {}

  incrementCounter() {
    this.counter++;
  }
}
