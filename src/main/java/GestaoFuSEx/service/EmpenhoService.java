package GestaoFuSEx.service;

import GestaoFuSEx.entity.EmpenhoEntity;
import GestaoFuSEx.repository.EmpenhoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpenhoService {

    private final EmpenhoRepository empenhoRepository;

    public EmpenhoService(EmpenhoRepository empenhoRepository) {
        this.empenhoRepository = empenhoRepository;
    }

    public List<EmpenhoEntity> listarTodos() {
        return empenhoRepository.findAll();
    }

    public EmpenhoEntity buscarPorId(Long id) {
        return empenhoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empenho não encontrado"));
    }

    public EmpenhoEntity salvar(EmpenhoEntity empenho) {
        return empenhoRepository.save(empenho);
    }

    public void excluir(Long id) {
        empenhoRepository.deleteById(id);
    }
}