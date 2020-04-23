import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GlueDisplayComponent } from './components/glue-display/glue-display.component';
import { GlueGetterService } from './services/glue-getter.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    GlueDisplayComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [GlueGetterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
