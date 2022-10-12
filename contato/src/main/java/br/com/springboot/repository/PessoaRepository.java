package br.com.springboot.repository;

import br.com.springboot.dto.PessoaDTO;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {

    public List<PessoaDTO> getAll(){
        List<PessoaDTO> listPessoa = new ArrayList<>();

        PessoaDTO pessoa1 = new PessoaDTO();
        pessoa1.setId(1);
        pessoa1.setNome("Marilainny Martins");
        pessoa1.setTelefone("62 98641-0067");
        pessoa1.setEmail("jkjrodrigues@hotmail.om");
        pessoa1.setIdade(37);
        listPessoa.add(pessoa1);

        PessoaDTO pessoa2 = new PessoaDTO();
        pessoa2.setId(2);
        pessoa2.setNome("Mary Martins");
        pessoa2.setTelefone("62 98641-0067");
        pessoa2.setEmail("jkjrodrigues@gmail.om");
        pessoa2.setIdade(37);
        listPessoa.add(pessoa2);

        return listPessoa;
    }
}
