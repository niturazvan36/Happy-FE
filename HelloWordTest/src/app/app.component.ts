import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'HelloWord';
  public items: MenuItem[] = [];

  ngOnInit() {
    this.items = [{
      label: 'File',
      items: [
        {label: 'New', icon: 'pi pi-plus'},
        {label: 'Open', icon: 'pi pi-download'}
      ]
    },
      {
        label: 'Edit',
        items: [
          {label: 'Undo', icon: 'pi pi-refresh'},
          {label: 'Redo', icon: 'pi pi-repeat'}
        ]
      },
      {
        label: 'login',
        items: [
          {label: 'logIn',icon: 'pi pi-refresh'}
        ]
      },

      ];
  }
}





