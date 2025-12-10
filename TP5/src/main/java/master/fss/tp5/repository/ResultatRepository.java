package master.fss.tp5.repository;

import master.fss.tp5.model.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatRepository extends JpaRepository<Resultat, Long> {

}