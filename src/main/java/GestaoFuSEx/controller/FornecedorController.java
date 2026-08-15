package GestaoFuSEx.controller;

import GestaoFuSEx.entity.FornecedorEntity;
import GestaoFuSEx.service.FornecedorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {

    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public List<FornecedorEntity> listarTodos() {
        return fornecedorService.listarTodos();
    }

    @GetMapping("/{id}")
    public FornecedorEntity buscarPorId(@PathVariable Long id) {
        return fornecedorService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FornecedorEntity salvar(@RequestBody FornecedorEntity fornecedor) {
        return fornecedorService.salvar(fornecedor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        fornecedorService.excluir(id);
    }
}