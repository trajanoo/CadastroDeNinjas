package com.spring.CadastroNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    // Create
    @PostMapping("/criarMissoes")
    public String criar() {
        return "Missão criado com sucesso";
    }

    // Read
    @GetMapping("/listarMissoes")
    public String listar() {
        return "Missões listadas com sucesso";
    }

    // Update
    @PutMapping("/atualizarMissao")
    public String atualizar() {
        return "Missões atualizadas com sucesso";
    }

    // Delete
    @DeleteMapping("/removerMissao")
    public String remover() {
        return "Missões removidas com sucesso";
    }
}
