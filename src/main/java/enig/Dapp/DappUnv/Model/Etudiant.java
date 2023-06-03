package enig.Dapp.DappUnv.Model;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdE;
    private String NomE;
    private String prenomE;
    private Date Birthday;
    private String Numerotele ;
    private String Mail;
    private String Pwd;
    @ManyToOne
    private University Uv;
   @OneToOne
    private Diplome DE;

    public Etudiant() {
    }

    public Etudiant(Integer idE, String nomE, String prenomE, Date birthday, String numerotele, String mail, String pwd) {
       this.IdE = idE;
      this.NomE = nomE;
        this.prenomE = prenomE;
        this.Birthday = birthday;
        this.Numerotele = numerotele;
        this.Mail = mail;
        this.Pwd = pwd;
    }



    public Diplome getDE() {
        return DE;
    }

    public void setDE(Diplome DE) {
        this.DE = DE;
    }

    public Integer getIdE() {
        return IdE;
    }

    public void setIdE(Integer idE) {
        IdE = idE;
    }

    public String getNomE() {
        return NomE;
    }

    public void setNomE(String nomE) {
        NomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getNumerotele() {
        return Numerotele;
    }

    public void setNumerotele(String numerotele) {
        Numerotele = numerotele;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }
}
