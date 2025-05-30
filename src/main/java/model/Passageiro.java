package model;

import java.time.LocalDate;
import java.util.Objects;

public class Passageiro {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private LocalDate nascimento;

    private Passageiro(Builder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.senha = builder.senha;
        this.nascimento = builder.nascimento;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String nome;
        private String email;
        private String senha;
        private LocalDate nascimento;

        public Builder nome(String username) {
            this.nome = nome;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder senha(String password) {
            this.senha = senha;
            return this;
        }

        public Builder nascimento(LocalDate nascimento) {
            this.nascimento = nascimento;
            return this;
        }


        public Passageiro build() {
            Objects.requireNonNull(nome, "É necessario o uso do nome");
            Objects.requireNonNull(email, "É necessario o uso do email");
            Objects.requireNonNull(senha, "É necessario o uso da senha");

            return new Passageiro(this);
        }
    }
}
