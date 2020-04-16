import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PoketableComponent } from './poketable.component';

describe('PoketableComponent', () => {
  let component: PoketableComponent;
  let fixture: ComponentFixture<PoketableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PoketableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PoketableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
