import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"],
})
export class HomeComponent implements OnInit {
  constructor() {}

  currentTime: Date;

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

  obj = {
    carAmount: 77,
    favoriteColor: "all of them",
    happy: true,
  };

  toggleBool() {
    this.someBool = !this.someBool;
  }

  ngOnInit(): void {
    setInterval(() => (this.currentTime = new Date()), 1000);
  }

  incrementCounter() {
    this.counter++;
  }
}
