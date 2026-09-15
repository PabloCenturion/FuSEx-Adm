import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FornecedorService } from '../../services/fornecedor.service';
import { Fornecedor } from '../../models/fornecedor';

@Component({
  selector: 'app-fornecedores',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './fornecedores.component.html',
  styleUrl: './fornecedores.component.css'
})
export class FornecedoresComponent implements OnInit {

  fornecedores: Fornecedor[] = [];

  constructor(private fornecedorService: FornecedorService) {}

  ngOnInit(): void {
    this.listarFornecedores();
  }

  listarFornecedores(): void {
    this.fornecedorService.listar().subscribe({
      next: (dados) => {
        this.fornecedores = dados;
        console.log('Fornecedores:', dados);
      },
      error: (erro) => {
        console.error('Erro ao buscar fornecedores:', erro);
      }
    });
  }
}