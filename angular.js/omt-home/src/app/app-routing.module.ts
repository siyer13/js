import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NewsletterComponent } from './admin/newsletter/newsletter.component';

const routes: Routes = [
  { path: 'newsletter', component: NewsletterComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
