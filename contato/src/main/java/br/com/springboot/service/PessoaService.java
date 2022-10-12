package br.com.springboot.service;
/**
 * Classe com as regras de negócio
 */

import br.com.springboot.dto.PessoaDTO;
import br.com.springboot.repository.PessoaRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    public PessoaDTO consultar(Integer id){
        PessoaRepository pessoaRepository = new PessoaRepository();
        List<PessoaDTO> listPessoa = pessoaRepository.getAll();

        PessoaDTO pessoaSelecionada = new PessoaDTO();

        for (PessoaDTO pessoa: listPessoa) {
            if(pessoa.getId().equals(id)){
                pessoaSelecionada = pessoa;
            }
        }
        return pessoaSelecionada;
    }

    public PessoaDTO salvar(PessoaDTO pessoaDTO){
        System.out.println("Acessando a classe Service");
        validarIdade(pessoaDTO);
        return null;
    }
    public void validarIdade(PessoaDTO pessoaDTO){
        if (pessoaDTO.getIdade() < 18){
            System.out.println("Menor de idade não pode cadastrar.");
        }else {
            System.out.println("Cadastro realizado com sucesso.");
        }
    }
}
