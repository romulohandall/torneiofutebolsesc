package sesc.torneiofutebolsesc.entity;

import jakarta.persistence.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "aluno")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Aluno {
    @Id
    @GeneratedValue()
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private long idade;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private Turma turma;
    @Column(nullable = false)
    private long nuTefone;
}
