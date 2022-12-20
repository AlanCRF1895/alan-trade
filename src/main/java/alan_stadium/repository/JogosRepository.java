package alan_stadium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alan_stadium.model.Jogos;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long> {

}
