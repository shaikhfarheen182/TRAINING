import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LibraryService } from './library.service';

describe('LibraryService', () => {
  let component: LibraryService;
  let fixture: ComponentFixture<LibraryService>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LibraryService],
    }).compileComponents();

    fixture = TestBed.createComponent(LibraryService);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
