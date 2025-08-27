package entidades;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    public LocalDate horario;

    public Double valorTotal;

    public Integer quantidadeTotal;

    @OneToOne
    public Cliente cliente;

    @OneToOne
    public Funcionario funcionario;
}
