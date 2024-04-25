package sesc.torneiofutebolsesc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Aluno {

    private long id;
    private String nome;
    private long idade;
    private Turma turma;
    private long nuTefone;
}
