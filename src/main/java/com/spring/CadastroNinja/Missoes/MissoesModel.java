package com.spring.CadastroNinja.Missoes;

import com.spring.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    @Enumerated(EnumType.STRING)
    private Rank rank;

    @OneToMany(mappedBy = "missoes")
    List<NinjaModel> ninjas;
}
