package sesc.torneiofutebolsesc.entity;

import jakarta.persistence.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "turma")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Turma implements Serializable {

    @Id
    @GeneratedValue()
    private Long id;
    @OneToMany(mappedBy="turma")
    private Set<Aluno> alunos;

    @ManyToMany
    private Set<Partida> partidas;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turma other = (Turma) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
