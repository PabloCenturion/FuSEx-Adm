package GestaoFuSEx.service;

import GestaoFuSEx.entity.FornecedorEntity;
import GestaoFuSEx.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public List<FornecedorEntity> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public FornecedorEntity buscarPorId(Long id) {
        return fornecedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
    }

    public FornecedorEntity salvar(FornecedorEntity fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void excluir(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
