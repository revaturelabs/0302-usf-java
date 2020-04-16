import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

/**
 * a service serves some kind of functional purpose
 *  other than dealing with a view. A service is just
 *  a typescript class that uses the injectable decorator.
 *
 * the injectable decorator:
 *    it means that this class has the ability to be
 *    injected with another service. we can utilize
 *    dependency injection by creating an instance member
 *    inside the parameters of the constructor. by using
 *    an access modifier with the parameter, we create
 *    the instance field for that object.
 *
 * with a service, we can register it with one of
 *    a few types of injectors that angular offers.
 *    1. the root injector, will create an instance once
 *      per application. so it survives as long as the
 *      application does.
 *    2. the module injector, will create an instance once
 *      per module load. so it survives as long as the
 *      module does.
 *    3. the component injector, will create an instance once
 *      per component load. so it survives as long as
 *      the component does.
 */
@Injectable({
  providedIn: "root",
})
export class PokeapiService {
  constructor(private http: HttpClient) {}

  getPokesById(id: any) {
    return this.http.get("https://pokeapi.co/api/v2/pokemon/" + id);
  }
}
