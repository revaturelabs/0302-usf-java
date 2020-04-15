//access modifiers: public (default), private, protected
class idontknow {
  private _reasons: number;
  public cares: boolean;
  protected secrets: string[];
  public static doneknows: number;

  constructor(raisons: number, caresel: boolean, screts: string[]) {
    this._reasons = raisons;
    this.cares = caresel;
    this.secrets = screts;
  }
  get reasons(): number {
    return this._reasons;
  }
  set reasons(num: number) {
    this._reasons = num;
  }
}


//when we put the access modifier next to a parameter in the constructor
//  it will create the instance fields for us and assign the value.
class birds {
  constructor(private span: number, private col: string, private fli: boolean) {}

  print(){
      console.log(this.col, this.fli, this.span);
  }
}


const bird = new birds(55, 'burgundy brown', true);
bird.print();

//the question mark behind parameters makes them optional
//  the rule is that every parameter following it must also be optional
class Birds2 {
    constructor(private span:number, private col?:string, private fli?:boolean){}
}

const biard = new Birds2(44, 'fuggiuerw');