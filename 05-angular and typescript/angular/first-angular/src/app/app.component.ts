import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'first-angular';
}


/*
  The Angular cli (command line interface) gives you immense powers over how
    you create your application. We have several commands such as "ng new [project-name]"
    which creates a new Angular project with that name. if you want to run your application
    on the dev server, use "ng serve".

  What is Angular?
    Angular is a Typescript based, open source, front end framework.
    We are on version 9. version 1.x.x is js, this is AngularJS.
      2+ is ts, this is know just as Angular.
    Angular was made, maintained, and backed by Google.
    Angular creates SPA's (single page applications).
      So we only have one html, head and doctype tags. this is because
      only one main html is sitting in the browser at all times. the
      html that you write will be done using javascript.

*/
