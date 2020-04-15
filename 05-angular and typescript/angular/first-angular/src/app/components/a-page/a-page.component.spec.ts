import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { APageComponent } from './a-page.component';

describe('APageComponent', () => {
  let component: APageComponent;
  let fixture: ComponentFixture<APageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ APageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(APageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
