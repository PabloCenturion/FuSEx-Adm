import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Fornecedor } from '../models/fornecedor';

@Injectable({
  providedIn: 'root'
})
export class FornecedorService {

  private apiUrl = 'http://localhost:8080/api/fornecedores';

  constructor(private http: HttpClient) {}

  listar(): Observable<Fornecedor[]> {
    return this.http.get<Fornecedor[]>(this.apiUrl);
  }

  buscarPorId(id: number): Observable<Fornecedor> {
    return this.http.get<Fornecedor>(`${this.apiUrl}/${id}`);
  }

  cadastrar(fornecedor: Fornecedor): Observable<Fornecedor> {
    return this.http.post<Fornecedor>(this.apiUrl, fornecedor);
  }

  atualizar(id: number, fornecedor: Fornecedor): Observable<Fornecedor> {
    return this.http.put<Fornecedor>(`${this.apiUrl}/${id}`, fornecedor);
  }

  excluir(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}