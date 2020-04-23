import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddGlueComponent } from './add-glue.component';

describe('AddGlueComponent', () => {
  let component: AddGlueComponent;
  let fixture: ComponentFixture<AddGlueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddGlueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddGlueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
