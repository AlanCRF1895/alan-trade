package alan_stadium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import alan_stadium.manager.ApostasManager;
import alan_stadium.model.Apostas;


@RestController
public class ControllerApostas {

	@Autowired
	private ApostasManager apostasManager;
	
	@GetMapping("listar-apostas")
	public List<Apostas> listarEstrategiasTodos(){
		return apostasManager.consultarApostasTodas();
	}
	
}
