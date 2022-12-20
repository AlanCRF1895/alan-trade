package alan_stadium.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alan_stadium.model.Jogos;
import alan_stadium.repository.JogosRepository;

@Service
public class JogosManager {

	@Autowired
	private JogosRepository jogosRepository;
	
	public Jogos cadastroJogos(Jogos jogos) {
		return jogosRepository.save(jogos);
	}
	
	public List<Jogos> listarTodosJogos(){
		return jogosRepository.findAll();
	}
	
}
