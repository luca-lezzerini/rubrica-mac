import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { RubricaReqDto } from './rubrica-req-dto';
import { RubricaResDto } from './rubrica-res-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  contatti: RubricaReqDto[] = [];
  contatore: number;
  rubrica: RubricaReqDto = new RubricaReqDto();
  contatto: String;
  

  constructor(private http: HttpClient) { }

 
  aggiungiContatto() {
    this.contatti.push(this.rubrica);
    this.rubrica = new RubricaReqDto();
  }
  rimuoviContatto(i: number) {
    this.contatti.splice(i, 1);
  }

  recuperaContatto(){
    let dto = new RubricaReqDto();
    let ox: Observable<RubricaResDto> = this.http
      .post<RubricaResDto>("http://localhost:8080/recuperaContatto",
        dto);
    ox.subscribe(r => this.contatto = r.contatto);
    
  }


}
