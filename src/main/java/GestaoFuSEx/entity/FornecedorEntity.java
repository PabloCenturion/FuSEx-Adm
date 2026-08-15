package GestaoFuSEx.entity;
import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "fornecedores")
public class FornecedorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String razaoSocial;

    @Setter
    private String nomeFantasia;

    @Setter
    @Column(nullable = false, unique = true)
    private String cnpj;

    @Setter
    private String email;

    @Setter
    private String telefone;

    @Setter
    private Boolean ativo = true;

    public Long getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }
    /*
    ├── id
    ├── razaoSocial
    ├── nomeFantasia
    ├── cnpj
    ├── email
    ├── telefone
    └── ativo*/
}

