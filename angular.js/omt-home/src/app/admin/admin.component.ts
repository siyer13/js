import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

   clickMessage = '';
   keyValue = '';

  constructor() { }

  ngOnInit() {
  }
public onClickMe() {
  this.clickMessage = 'Hey Sri, how are you ?';
}

values = '';

public onKey(event: KeyboardEvent) { // with type info
    this.values += (<HTMLInputElement>event.target).value + ' | ';
  }
}
