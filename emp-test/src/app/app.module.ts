import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpSkillsComponent } from './emp-skills/emp-skills.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CompanyCandidateComponent } from './company-candidate/company-candidate.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpSkillsComponent,
    CompanyCandidateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
