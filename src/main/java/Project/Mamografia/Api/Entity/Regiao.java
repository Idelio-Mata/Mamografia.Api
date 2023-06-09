package Project.Mamografia.Api.Entity;


import jakarta.persistence.*;

@Entity
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String regiao;
    private Long qnt_exames;


    public Regiao(String regiao, Long qnt_exames) {
        this.regiao = regiao;
        this.qnt_exames = qnt_exames;
    }

    public Regiao() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getQnt_exames() {
        return qnt_exames;
    }
    public void setQnt_exames(Long qnt_exames) {
        this.qnt_exames = qnt_exames;
    }
}
