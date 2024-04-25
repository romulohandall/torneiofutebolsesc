package sesc.torneiofutebolsesc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table
public class Turma {

    private Long id;
    private List<Aluno> alunos;
}
