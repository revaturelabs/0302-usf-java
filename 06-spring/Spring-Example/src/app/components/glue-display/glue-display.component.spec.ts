import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GlueDisplayComponent } from './glue-display.component';

describe('GlueDisplayComponent', () => {
  let component: GlueDisplayComponent;
  let fixture: ComponentFixture<GlueDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GlueDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GlueDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
