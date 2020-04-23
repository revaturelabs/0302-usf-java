import { Component, OnInit } from '@angular/core';
import { GlueGetterService } from 'src/app/services/glue-getter.service';
import { Glue } from 'src/app/models/glue';

@Component({
  selector: 'app-add-glue',
  templateUrl: './add-glue.component.html',
  styleUrls: ['./add-glue.component.scss']
})
export class AddGlueComponent implements OnInit {

  glue:Glue=new Glue(0,'',0,false);

  constructor(private glueGetter: GlueGetterService) { }

  ngOnInit(): void {
  }

  public addGlue(glue: Glue) {
    console.log(glue)
    this.glueGetter.saveGlue(glue).then(console.log);
  }
}
