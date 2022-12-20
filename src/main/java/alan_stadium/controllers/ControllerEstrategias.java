package alan_stadium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import alan_stadium.manager.EstrategiasManager;
import alan_stadium.model.Estrategias;

@RestController
public class ControllerEstrategias {

	@Autowired
	private EstrategiasManager manager;
	
	@PostMapping("/cadastro-estrategias")
	public void cadastroEstrategias(@RequestBody  Estrategias estrategias) {
		manager.cadastrarEstrategias(estrategias);
	}
	
	@GetMapping("listar-todas-estrategias")
	public List<Estrategias> listarEstrategiasTodos(){
		return manager.listarEstrategiasTodos();
	}
	
}
