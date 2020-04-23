import { TestBed } from '@angular/core/testing';

import { GlueGetterService } from './glue-getter.service';

describe('GlueGetterService', () => {
  let service: GlueGetterService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GlueGetterService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
