package br.com.fiap.pessoa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_PF")
public class PF extends Pessoa {

    @Column(name = "NR_CPF")
    private String CPF;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PF{");
        sb.append("CPF='").append(CPF).append('\'');
        sb.append(", id=").append(super.getId());
        sb.append(", nome='").append(super.getNome()).append('\'');
        sb.append(", nascimento=").append(super.getNascimento());
        sb.append('}');
        return sb.toString();
    }
}
