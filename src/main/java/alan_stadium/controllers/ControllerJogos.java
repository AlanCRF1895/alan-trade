package alan_stadium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import alan_stadium.manager.JogosManager;
import alan_stadium.model.Jogos;

@RestController
public class ControllerJogos {

	@Autowired
	private JogosManager manager;
	
	@PostMapping("cadastrar-jogos")
	public void cadastrarJogos(@RequestBody Jogos jogos) {
		manager.cadastroJogos(jogos);
	}
	
	@GetMapping("listar-todos-jogos")
	public List<Jogos> listarTodosJogos(){
		return manager.listarTodosJogos();
	}
	
}
