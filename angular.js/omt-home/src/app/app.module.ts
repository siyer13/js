import { BrowserModule } from '@angular/platform-browser';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { NgModule } from '@angular/core';
import { FormsModule }    from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { EditorModule } from '@tinymce/tinymce-angular';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { NewsletterComponent } from './admin/newsletter/newsletter.component';
import {NgxAutoScrollModule} from "ngx-auto-scroll";
import { CookieService } from 'ngx-cookie-service';

const appRoutes: Routes = [
  { path: 'admin', component: AdminComponent },
  { path: 'newsletter', component: NewsletterComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    NewsletterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    EditorModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    NgbModule.forRoot(),
    NgxAutoScrollModule
  ],
  providers: [CookieService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
