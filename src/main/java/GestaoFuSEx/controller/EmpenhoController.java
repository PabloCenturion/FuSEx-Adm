package GestaoFuSEx.controller;

import GestaoFuSEx.entity.EmpenhoEntity;
import GestaoFuSEx.service.EmpenhoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empenhos")
public class EmpenhoController {

    private final EmpenhoService empenhoService;

    public EmpenhoController(EmpenhoService empenhoService) {
        this.empenhoService = empenhoService;
    }

    @GetMapping
    public List<EmpenhoEntity> listarTodos() {
        return empenhoService.listarTodos();
    }

    @GetMapping("/{id}")
    public EmpenhoEntity buscarPorId(@PathVariable Long id) {
        return empenhoService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpenhoEntity salvar(@RequestBody EmpenhoEntity empenho) {
        return empenhoService.salvar(empenho);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        empenhoService.excluir(id);
    }
}