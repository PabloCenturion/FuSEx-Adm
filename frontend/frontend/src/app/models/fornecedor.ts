export interface Fornecedor {
  id?: number;
  razaoSocial: string;
  nomeFantasia: string;
  cnpj: string;
  email: string;
  telefone: string;
  ativo: boolean;
}