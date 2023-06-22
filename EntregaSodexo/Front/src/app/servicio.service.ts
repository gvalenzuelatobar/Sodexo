import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs'

const cabecera = {headers: new HttpHeaders({'Content-Type': 'application/json'})}

@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  url: string=""

  constructor(private http: HttpClient) { }

  
  getListaNoticiasService(): Observable<any> {
    this.url =  'http://127.0.0.1:8080/noticias/noticias'
    return this.http.get<any>(this.url)
  }

  getListaFavoritosService(): Observable<any> {
    this.url =  'http://127.0.0.1:8080/noticias/favoritos'
    return this.http.get<any>(this.url)
  }
}
