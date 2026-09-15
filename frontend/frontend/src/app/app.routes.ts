import { Routes } from '@angular/router';
import { FornecedoresComponent } from './pages/fornecedores/fornecedores.component';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'fornecedores',
    pathMatch: 'full'
  },
  {
    path: 'fornecedores',
    component: FornecedoresComponent
  }
];