package br.com.fiap.pessoa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TB_PJ")
public class PJ extends Pessoa {

    private String CNPJ;


    public PJ(Long id, String nome, LocalDate nascimento, String CNPJ) {
        super(id, nome, nascimento);
        this.CNPJ = CNPJ;
    }

    public PJ(String CNPJ) {
        super();
        this.CNPJ = CNPJ;
    }

    public PJ() {
        super();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PJ{");
        sb.append("CNPJ='").append(CNPJ).append('\'');
        sb.append(", id=").append(super.getId());
        sb.append(", nome='").append(super.getNome()).append('\'');
        sb.append(", nascimento=").append(super.getNascimento());
        sb.append('}');
        return sb.toString();
    }
}
