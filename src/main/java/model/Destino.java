package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String pais;
    private String descricao;

    protected Destino(){}

    private Destino(Builder builder){
        this.cidade = builder.cidade;
        this.pais = builder.pais;
        this.descricao = builder.descricao;
    }

    public Long getId() {
        return id;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

    public String getDescricao() {
        return descricao;
    }

    public static final class Builder{
        private String cidade;
        private String pais;
        private String descricao;

        public Builder setPais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder setCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Destino build(){
            Objects.requireNonNull(cidade, "Cidade é obrigatória");
            Objects.requireNonNull(pais, "País é obrigatório");
            return new Destino(this);
        }
    }
}
