import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-newsletter',
  templateUrl: './newsletter.component.html',
  styleUrls: ['./newsletter.component.css']
})
export class NewsletterComponent implements OnInit {

  constructor(private router: Router) { }

  messages: string[] = [
    'Hello, this is Sridhar',
    'This is the second line',
    'This is the third line',
    'This is the fourth line',
    'This is the fifth line'
  ];

  ngOnInit() {
  }

  textValue = '';
  preview = '';

  logText(value: string): void {
    this.preview = `${value}`;
  }

}
