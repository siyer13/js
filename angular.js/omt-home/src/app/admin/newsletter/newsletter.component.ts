import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-newsletter',
  templateUrl: './newsletter.component.html',
  styleUrls: ['./newsletter.component.css']
})
export class NewsletterComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  textValue = '';
  preview = '';

  logText(value: string): void {
    this.preview = `${value}`;
  }

}
