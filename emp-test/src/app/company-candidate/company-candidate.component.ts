import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-company-candidate',
  templateUrl: './company-candidate.component.html',
  styleUrls: ['./company-candidate.component.css']
})
export class CompanyCandidateComponent implements OnInit {
  companyForm: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.companyForm = this.fb.group({
      companyName : this.fb.control('',
        [
          Validators.minLength(3),
          Validators.maxLength(30),
          Validators.required
        ]),
        location : this.fb.control(''),
        candidateDet: this.fb.array([
        this.skill()
      ])
    });
  }
  skill(): FormGroup {
    return this.fb.group({
      fullName: this.fb.control(''),
      degreePer: this.fb.control(''),
      speciality: this.fb.control('')
    })
  }

  addCandidate() {
    (this.companyForm.get('candidateDet') as FormArray).push(this.skill());
  }

  removeCandidate(i: number) {
    (this.companyForm.get('candidateDet') as FormArray).removeAt(i);
  }

  printForm() {
    console.log(this.companyForm.value);
    this.companyForm.reset();
  }

}
