import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GlueDisplayComponent } from './components/glue-display/glue-display.component';
import { GlueGetterService } from './services/glue-getter.service';
//this is to use HttpClient
import { HttpClientModule } from '@angular/common/http';
import { AddGlueComponent } from './components/add-glue/add-glue.component';
//this is to be able to use ngModel
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    GlueDisplayComponent,
    AddGlueComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [GlueGetterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
