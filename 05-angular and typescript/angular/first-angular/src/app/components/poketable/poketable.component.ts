import { Component, OnInit } from "@angular/core";
import { PokeapiService } from "src/app/services/pokeapi.service";
import { Pokemon } from "src/app/models/pokemon";

@Component({
  selector: "app-poketable",
  templateUrl: "./poketable.component.html",
  styleUrls: ["./poketable.component.css"],
})
export class PoketableComponent implements OnInit {
  pokemans: Pokemon[] = [];
  constructor(private poke: PokeapiService) {}

  getPokeById(ids: any) {
    this.poke
      .getPokesById(ids)
      .toPromise()
      .then((p: any) => {
        this.pokemans.push({
          id: p.id,
          name: p.name,
          type: p.types[0].type.name,
          height: p.height,
        });
      });
  }
  ngOnInit(): void {}
}
