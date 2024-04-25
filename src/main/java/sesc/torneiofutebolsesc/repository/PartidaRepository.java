package sesc.torneiofutebolsesc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesc.torneiofutebolsesc.entity.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
