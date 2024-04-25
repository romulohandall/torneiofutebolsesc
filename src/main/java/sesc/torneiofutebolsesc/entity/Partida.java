package sesc.torneiofutebolsesc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table
public class Partida {

    private Long id;
    private List<Turma> turmas;

}
