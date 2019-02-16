import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { UserRole } from '../user-role';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { CookieService } from 'ngx-cookie-service';
import {formatDate } from '@angular/common';
import { environment } from '../../environments/environment';



@NgModule({
  declarations: [
    AdminComponent
  ],
  imports: [
    FormsModule
  ],
  providers: [CookieService ]
})

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  private userRole : UserRole;
  private myTextarea : String = '';
  private textValue : String = '';
  title = 'Admin';

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

  private values: String = '';
  private showHide: boolean;
  private cookieValue: string;
  private today = new Date();
  private lastUpdateDateTime : String  = '';
  
  constructor(private http: HttpClient, private cookieService: CookieService) {
    this.showHide = false;
   }

  ngOnInit() {
    
    this.cookieService.set( 'lastupdateby', 'siyer13' ); 
    this.cookieValue = this.cookieService.get('lastupdateby'); 
    this.lastUpdateDateTime = formatDate(this.today, 'MM-dd-yyyy hh:mm:ss a', 'en-US', '+0530');
    console.log(this.lastUpdateDateTime)
    
    this.userRole = new UserRole('a160097',true, true);
    console.log(this.userRole);
    console.log(this.cookieValue);
    console.log('This should get printed');
     this.http.get(environment.apiUrl+'/news/getnews').subscribe(data =>  {
       console.log(data);
       console.log(data[0]);
       console.log(data[0]['id']);
       console.log(data[0]['description']);
      this.lastUpdateDateTime = formatDate(this.today, 'MM-dd-yyyy hh:mm:ss a', 'en-US', '+0530');
        this.textValue = this.lastUpdateDateTime + '\n\n' + data[0]['description'];
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
    this.http.put(environment.apiUrl+'/news/update?newsDescription='+value,value).subscribe()
    ;
    this.log += value;
  }
}
