package alan_stadium.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import alan_stadium.manager.TimeManager;
import alan_stadium.model.Time;

@RestController
public class ControllerTimes {

	@Autowired
	private TimeManager manager;
	
	@PostMapping("/cadastrar-time")
	public void cadastrarTimes(@RequestBody Time time) {
		manager.cadastroTime(time);
	}
	
	@GetMapping("/listar-times-todos")
	public List<Time> consultarTimesTodos(){
		return manager.consultarTimesTodos();
	}
	
	@GetMapping("/listar-times-id")
	public Optional<Time> consultarTimeId(@RequestParam long id) {
		return manager.consultarTimesId(id);
	}
	
}
