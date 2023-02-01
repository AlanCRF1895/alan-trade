package alan_stadium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alan_stadium.model.Apostas;
import alan_stadium.model.Jogos;

public interface ApostasRepository extends JpaRepository<Apostas, Long> {

}
