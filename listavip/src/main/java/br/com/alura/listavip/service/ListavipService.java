package br.com.alura.listavip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import br.com.alura.listavip.entity.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;

@Service
public class ListavipService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public void salvar(Convidado novoConvidado) {
		
		repository.save(novoConvidado);
	}
	
	public List<Convidado> listar(){
		
		Iterable<Convidado> convidados = repository.findAll();
		
		List<Convidado> lista = null;
		
		if(!ObjectUtils.isEmpty(convidados)) {
			lista =  (List<Convidado>) convidados;
		}
		
		return lista;
	}

}
