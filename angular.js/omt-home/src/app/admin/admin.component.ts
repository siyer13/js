import { Component, OnInit } from '@angular/core';
import { UserRole } from '../user-role';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  private userRole : UserRole;
  
   clickMessage = '';
   array = [
    {
      guid: '900ea552-ef68-42cc-b6a6-b8c4dff10fb7',
      age: 32,
      name: 'Powers Schneider'
    },
    {
      guid: '880381d3-8dca-4aed-b207-b3b4e575a15f',
      age: 25,
      name: 'Adrian Lawrence'
    },
    {
      guid: '87b47684-c465-4c51-8c88-3f1a1aa2671b',
      age: 32,
      name: 'Boyer Stanley'
    }
  ];

  values = '';
  
  constructor() {
    
   }

  ngOnInit() {
    this.userRole = new UserRole('a160097',true, true);
    console.log(this.userRole);
  }


public onClickMe() {
  this.clickMessage = 'Hey Sri, how are you ?';
}

public onKey(event: KeyboardEvent) { // with type info
    this.values += (<HTMLInputElement>event.target).value + ' | ';
    console.log(this.userRole);
  }
}
