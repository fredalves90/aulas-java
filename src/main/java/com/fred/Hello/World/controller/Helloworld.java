package com.fred.Hello.World.controller;


import com.fred.Hello.World.models.Notas;
import com.fred.Hello.World.models.Teste;
import com.fred.Hello.World.repository.Leads;
import com.fred.Hello.World.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Helloworld {

    @Autowired
    private NotasRepository notasRepository;
    private Leads leads
    @GetMapping("/rota1/{id}")
    public Notas buscaPorId(@PathVariable("id") Long id) {
        Notas t = notasRepository.findById(id).get();
        return t;
    }

    @GetMapping("/rota1/")
    public List<Notas> listaTodos() {

        return notasRepository.findAll();


        //Teste teste = new Teste();
        //teste.setAtributo("Joao");
        //teste.setAtributoint(19);
        //teste.setAtributodouble(2.5);

    }

    @PostMapping("/Notas")
    public Notas salvar(@RequestBody Notas notas) {

        return notasRepository.save(notas);
    }


    @PutMapping("/Notas/{id}")
    public Notas editar(@PathVariable("id") Long id, @RequestBody Notas notas) throws Exception {//detalhe aqui eu ha  via colocado ; depois de teste o teste depois de return ficou desconhecido, pq isso acontece?

        Notas n = notasRepository.findById(id).get();

        if (n == null) // pq não se usa {?
            throw new Exception("notas não existe");

        notas.setId(id);
        return notasRepository.save(notas);
    }

    @DeleteMapping("/Notas/{id}")

    public void delete(@PathVariable("id") Long id) throws Exception {// public Long delete(@PathVariable("id")Long id) neste caso o long é uma classe? Ele não seria o tipo de uma variável? Qual a questão envolvida nessa diferença?{
        Notas n = notasRepository.findById(id).get();
        if (n == null)
            throw new Exception("Teste nao existe");
        notasRepository.delete(n);
    }
}