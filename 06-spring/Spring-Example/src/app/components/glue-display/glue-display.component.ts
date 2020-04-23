import { Component, OnInit } from '@angular/core';
import { Glue } from 'src/app/models/glue';

@Component({
  selector: 'app-glue-display',
  templateUrl: './glue-display.component.html',
  styleUrls: ['./glue-display.component.scss'],
})
export class GlueDisplayComponent implements OnInit {
  glues: Glue[] = [new Glue(1, 'elmer', 2, false)];
  constructor() {}

  ngOnInit(): void {}
}
