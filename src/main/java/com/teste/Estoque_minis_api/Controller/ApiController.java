package com.teste.Estoque_minis_api.Controller;


import com.teste.Estoque_minis_api.entites.Modelos;
import com.teste.Estoque_minis_api.repositories.ModeloRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/minis")
public class ApiController {


    //injeção de dados
    private ModeloRepository modeloRepository;
    public ApiController(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }


    @PostMapping("/teste")
    public ResponseEntity<Modelos> testePost( @RequestBody Modelos modelos){
        var token = UUID.randomUUID().toString();
        modelos.setToken(token);
        modeloRepository.save(modelos);
        System.out.println("\uD83D\uDCE5Novo item adicionado ao inventário " + modelos);
        return ResponseEntity.ok(modelos);

    }

    @GetMapping("/teste")
    public ResponseEntity<List<Modelos>> consultaBanco(){
        List<Modelos> all = modeloRepository.findAll();
        System.out.println("\uD83D\uDDC3\uFE0FConsulta Realizada");
        return ResponseEntity.ok(all);
    }

    @GetMapping("/teste/{id}")
    public Modelos buscaBanco(@PathVariable("id") String Id){
        System.out.println("\uD83D\uDDC3\uFE0FConsulta realizada!");
        return modeloRepository.findById(Id).orElse(null);
    }

    @DeleteMapping("/teste/{id}")
        public void deletaItem(@PathVariable("id") String Id){
            System.out.println("\uD83D\uDCE4 Item retirado do iventario");
            modeloRepository.deleteById(Id);
    }

    @PutMapping("/teste/{id}")
    public void atualizar(@PathVariable("id") String Id, @RequestBody Modelos modelos){
        modelos.setIdLong(Id);
        System.out.println("\uD83D\uDEE0\uFE0F Objeto atualizado!");
        modeloRepository.save(modelos);
    }

}
