import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Glue } from '../models/glue';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root',
})
export class GlueGetterService {
  constructor(private http: HttpClient) {}

  public getGlues(): Promise<Glue[]> {
    return this.http
      .get<Glue[]>(environment.base_url+'all.app')
      .toPromise();
  }

  public saveGlue(glue: Glue): Promise<Glue> {
    return this.http.post<Glue>(environment.base_url+'glue.app', glue).toPromise();
  }
}
