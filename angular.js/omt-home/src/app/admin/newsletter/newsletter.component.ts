import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-newsletter',
  templateUrl: './newsletter.component.html',
  styleUrls: ['./newsletter.component.css']
})
export class NewsletterComponent implements OnInit {

  private showHide: boolean;
  constructor(private router: Router, private http: HttpClient) {
    this.showHide = false;
   }

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

  changeShowStatus(element) {
    this.showHide = !this.showHide;
    element.disabled = true; 
  }


}
