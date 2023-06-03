package enig.Dapp.DappUnv.Model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer IDA;
    private String NamA;
    private String MailA;
    private String PwdA;
     @OneToMany
    private ArrayList<Etudiant> LE;

    public Admin() {
    }

    public Admin(Integer IDA, String namA, String mailA, String pwdA) {
        this.IDA = IDA;
        NamA = namA;
        MailA = mailA;
        PwdA = pwdA;
    }

    public Integer getIDA() {
        return IDA;
    }

    public void setIDA(Integer IDA) {
        this.IDA = IDA;
    }

    public String getNamA() {
        return NamA;
    }

    public void setNamA(String namA) {
        NamA = namA;
    }

    public String getMailA() {
        return MailA;
    }

    public void setMailA(String mailA) {
        MailA = mailA;
    }

    public String getPwdA() {
        return PwdA;
    }

    public void setPwdA(String pwdA) {
        PwdA = pwdA;
    }
}
