import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Glue } from '../models/glue';

@Injectable({
  providedIn: 'root',
})
export class GlueGetterService {
  constructor(private http: HttpClient) {}

  public getGlues(): Promise<Glue[]> {
    return this.http
      .get<Glue[]>('localhost:8080/Spring-MVC/all.app')
      .toPromise();
  }
}
