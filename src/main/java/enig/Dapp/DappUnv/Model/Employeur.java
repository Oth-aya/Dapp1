package enig.Dapp.DappUnv.Model;

import jakarta.persistence.*;

@Entity
public class Employeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer IdC;
    private String NomC;
    private String MailC;
    private String pwdC;


    public Employeur() {
    }

    public Employeur(Integer idC, String nomC, String mailC, String pwdC) {
        IdC = idC;
        NomC = nomC;
        MailC = mailC;
        this.pwdC = pwdC;
    }

    public Integer getIdC() {
        return IdC;
    }

    public void setIdC(Integer idC) {
        IdC = idC;
    }

    public String getNomC() {
        return NomC;
    }

    public void setNomC(String nomC) {
        NomC = nomC;
    }

    public String getMailC() {
        return MailC;
    }

    public void setMailC(String mailC) {
        MailC = mailC;
    }

    public String getPwdC() {
        return pwdC;
    }

    public void setPwdC(String pwdC) {
        this.pwdC = pwdC;
    }
}
