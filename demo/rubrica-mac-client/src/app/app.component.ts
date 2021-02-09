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
  rubrica: RubricaReqDto[] = []; //array che contiene i contatti
  contatto: RubricaReqDto = new RubricaReqDto(); //singolo contatto composto da id nome cognome e tel

  constructor(private http: HttpClient) { }

  aggiungiContatto() {
    if (this.contatto.nome != null && this.contatto.cognome != null && this.contatto.telefono != null) {
      let oss: Observable<RubricaReqDto[]> = this.http.post<RubricaReqDto[]>("http://localhost:8080/aggiungiContatto",
        this.contatto);
      oss.subscribe(r => this.rubrica = r);
      this.contatto = new RubricaReqDto();
    }
  }

  rimuoviContatto(i: number) {
    let oss: Observable<RubricaReqDto[]> = this.http.post<RubricaReqDto[]>("http://localhost:8080/rimuoviContatto",
      this.rubrica[i]);
    oss.subscribe(r => this.rubrica = r);

  }

  recuperaContatto() {
    let oss = this.http.get<RubricaReqDto[]>("http://localhost:8080/recuperaContatto");
    oss.subscribe(r => this.rubrica = r);

  }


  svuotaRubrica() {
    let oss = this.http.get<RubricaReqDto[]>("http://localhost:8080/svuotaRubrica");
    oss.subscribe(r => this.rubrica = r);
  }


}



