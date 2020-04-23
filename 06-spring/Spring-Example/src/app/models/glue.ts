export class Glue {
  constructor(
    // tslint:disable: variable-name
    private _id: number,
    private _brand: string,
    private _stickyLevel: number,
    private _crazy: boolean
  ) {}
  get id(): number {
    return this._id;
  }
  set id(id: number) {
    this._id = id;
  }
  get brand(): string {
    return this._brand;
  }
  set brand(brand: string) {
    this._brand = brand;
  }
  get stickyLevel(): number {
    return this._stickyLevel;
  }
  set stickyLevel(sticky: number) {
    this._stickyLevel = sticky;
  }
  get crazy(): boolean {
    return this._crazy;
  }
  set crazy(crazy: boolean) {
    this._crazy = crazy;
  }
}
