package sesc.torneiofutebolsesc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesc.torneiofutebolsesc.entity.Partida;
import sesc.torneiofutebolsesc.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
