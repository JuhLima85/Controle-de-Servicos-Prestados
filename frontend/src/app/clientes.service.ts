import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'

import { Cliente } from "./clientes/cliente"

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor( private http: HttpClient) { }

  getCliente() : Cliente {
      let cliente : Cliente = new Cliente();
      cliente.nome = 'Jesus Cristo';
      cliente.cpf = '77777777777';
      return cliente;
  }
}
