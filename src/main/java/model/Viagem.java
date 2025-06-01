package model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;
    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private String meioTransporte;
    private double preco;

    protected Viagem() {}

    private Viagem(Builder builder) {
        this.destino = builder.destino;
        this.dataPartida = builder.dataPartida;
        this.dataRetorno = builder.dataRetorno;
        this.meioTransporte = builder.meioTransporte;
        this.preco = builder.preco;
    }



    public static class Builder {
        private String destino;
        private LocalDate dataPartida;
        private LocalDate dataRetorno;
        private String meioTransporte;
        private double preco;

        public Builder setDestino(String destino) {
            this.destino = destino;
            return this;
        }
        public Builder setDataPartida(LocalDate dataPartida) {
            this.dataPartida = dataPartida;
            return this;
        }
        public Builder setDataRetorno(LocalDate dataRetorno) { this.dataRetorno = dataRetorno;
            return this;
        }
        public Builder setMeioTransporte(String meioTransporte) { this.meioTransporte = meioTransporte;
            return this;
        }
        public Builder setPreco(double preco) { this.preco = preco;
            return this;
        }

        public Viagem build() {
            return new Viagem(this);
        }
    }
}
