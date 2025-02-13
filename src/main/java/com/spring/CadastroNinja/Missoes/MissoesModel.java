package com.spring.CadastroNinja.Missoes;

import com.spring.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "db_missoes")

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    private Long id;
    private String nomeMissao;
    private Rank rank;

    @OneToMany(mappedBy = "missoes")
    List<NinjaModel> ninjas;
}
