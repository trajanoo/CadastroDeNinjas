package com.spring.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    // CRUD: Create, Read, Update, Delete

    // Create
    @PostMapping("/criar")
    public String criar() {
        return "Ninja criado com sucesso";
    }

    // Read
    @GetMapping("/listarID")
    public String mostrarNinjasPorId() {
        return "Ninjas mostrados por ID";
    }

    // Update
    @PutMapping("/atualizarID")
    public String atualizar() {
        return "Alterar ninja por ID";
    }

    // Delete
    @DeleteMapping("/removerID")
    public String remover() {
        return "Remover ninja por ID";
    }
}
