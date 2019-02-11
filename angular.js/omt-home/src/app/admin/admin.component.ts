import { Component, OnInit } from '@angular/core';
import { UserRole } from '../user-role';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  private userRole : UserRole;
  private myTextarea : String = '';
  private textValue : String = '';

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
 

  showHide: boolean;
  constructor(private http: HttpClient) {
    this.showHide = false;
   }

  ngOnInit() {

    this.userRole = new UserRole('a160097',true, true);
    console.log(this.userRole);
    console.log('This should get printed');
     this.http.get('http://localhost:1337/localhost:8080/news/getnews').subscribe(data =>  {
       console.log(data);
       console.log(data[0]);
       console.log(data[0]['id']);
       console.log(data[0]['description']);
        this.textValue = data[0]['description'];
    });
  }



public onClickMe() {
  this.clickMessage = 'Hey Sri, how are you ?';
}

public onKey(event: KeyboardEvent) { // with type info
    this.values = (<HTMLInputElement>event.target).value ;
    console.log(this.userRole);
  }

  changeShowStatus(element) {
    this.showHide = !this.showHide;
    element.disabled = true; 
  }

  
  log = '';

  logText(value: string): void {
    this.http.put('http://localhost:1337/localhost:8080/news/update?newsDescription='+value,value).subscribe();
    this.log += value;
  }
}
