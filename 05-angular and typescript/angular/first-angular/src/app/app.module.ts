import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { FormsModule } from '@angular/forms';
import { APageComponent } from './components/a-page/a-page.component';
@NgModule({
  //the classes related to views that you create go here. There can
  //  can be three types of classes that relate to views:
  //  components, directives, and pipes
  declarations: [
    AppComponent,
    HomeComponent,
    APageComponent
  ],
  imports: [
    //we need to import other modules when we need its classes
    //  inside our components
    BrowserModule,
    FormsModule
  ],
  //this is where we register our services
  providers: [],
  //this is the root component which is the main view of the app
  bootstrap: [AppComponent]
})
export class AppModule { }

/*
  Angular provides its own system of organization of code and funcitonality
    and this is accomplished by containers called modules.

  A module is a cohesive block of code with a related set of capabilities which
    have a specific application domain or a workflow.

  All Angular applications have at least one module, the root module typically
    is defined in the file app-module.ts. Now this module ties together all
    of our components and defines where to start to bootstrap our application.

  Some applications utilize more than one module and most commonly these modules
    define some particular features. For example, the HTTPModule defines an API
    to use to send AJAX requests. The BrowserModule defines functionality for running
    your application inside a webbrowser.

  All modules are typescript classes annotated with the @NgModule decorator which
    takes in an object of properties or metadata that specify how to construct the
    module.

  Bootstrapping:
    -Bootstrapping is an essential part in Angular where the application is loaded.
    -the bootstrap process loads main.ts which is the entry point of the app.
    -this process also starts the dependency injection system in Angular.

  IOC
    -Inversion of control
    -Basically it means you are letting something else take control of something
    -Dependency injection is a subset of ioc

  Dependency Injection:
    -A core concept that predates Angular
      The purpose of dependency injection is to simplify dependency management in software
        components. By reducing the amount of information a component needs to know
        about its dependencies.
*/
