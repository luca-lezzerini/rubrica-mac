import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { RubricaReqDto } from './rubrica-req-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  contatti: RubricaReqDto[] = [];
  contatore: number;
  rubrica: RubricaReqDto = new RubricaReqDto();

  constructor(private http: HttpClient) { }

 
  aggiungi() {
    this.contatti.push(this.rubrica);
    this.rubrica = new RubricaReqDto();
  }
  rimuovi(i: number) {
    this.contatti.splice(i, 1);
  }

}
