package sesc.torneiofutebolsesc.entity;

import jakarta.persistence.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "hotel")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    @ManyToMany
    private Set<Turma> turmas;

}
