package pl.zajavka.myfoodapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zajavka.myfoodapp.infrastructure.database.entity.OpinionEntity;

@Repository
public interface OpinionJpaRepository extends JpaRepository<OpinionEntity, Integer> {
}
