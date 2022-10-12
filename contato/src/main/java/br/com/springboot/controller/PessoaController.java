package br.com.springboot.controller;

import br.com.springboot.dto.PessoaDTO;
import br.com.springboot.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/status")
    public String status(){
        return "Hello World";
    }

    @GetMapping("/consultar")
    public PessoaDTO consultar(@RequestParam("ID") Integer id){
        return pessoaService.consultar(id);
    }

    @PostMapping("/salvar")
    public PessoaDTO salvar(@RequestBody PessoaDTO pessoaDTO){
        System.out.println(pessoaDTO.getNome());
        System.out.println(pessoaDTO.getTelefone());
        System.out.println(pessoaDTO.getEmail());
        return pessoaDTO;
    }
    /**
     * No controller faz chamadas com a PessoaDTO onde tem o comportamento (atributos da classe)
     * Cria a anotação @Service em PessoaService onde tem as regras de negócio
     * Assim não necessita criar o objeto PessoaService pessoaService = new PessoaService();
     */
    @PostMapping("/salvarComRetorno")
    @ResponseBody
    public PessoaDTO salvarComRetorno(@RequestBody PessoaDTO pessoaDTO){
        return pessoaService.salvar(pessoaDTO);
    }

}
