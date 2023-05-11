package br.com.fiap.authentication.model;

import br.com.fiap.sistema.model.Sistema;
import jakarta.persistence.*;

/**
 * É uma permissão de um sistema em específico
 */
@Entity
@Table(
        name = "TB_ROLE",
        uniqueConstraints = @UniqueConstraint(
                name = "UK_NOME_ROLE",
                columnNames = "NM_ROLE"
        )
)
public class Role {

    @Id
    @SequenceGenerator(
            name = "SQ_ROLE",
            sequenceName = "SQ_ROLE",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_ROLE"
    )
    @Column(
            name = "ID_ROLE"
    )
    private Long id;

    @Column(name = "NM_ROLE")
    private String nome;

    @Column(name = "DS_ROLE")
    private String descricao;
    @ManyToOne(
            fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "ID_SISTEMA",
            referencedColumnName = "ID_SISTEMA",
            foreignKey = @ForeignKey(name = "FK_ROLE_SISTEMA"
            )
    )
    private Sistema sistema;


    public Role() {
    }

    public Role(Long id, String nome, String descricao, Sistema sistema) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.sistema = sistema;
    }

    public Long getId() {
        return id;
    }

    public Role setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Role setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Role setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public Role setSistema(Sistema sistema) {
        this.sistema = sistema;
        return this;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", sistema=" + sistema +
                '}';
    }
}
