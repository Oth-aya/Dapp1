package enig.Dapp.DappUnv.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer NumDip;
    private Date DateDip;
    @OneToOne
    private Etudiant Etd;
    @ManyToOne
    private University Unv;


    public Diplome() {
    }

    public Diplome(Integer numDip, Date dateDip, Etudiant etd, University unv) {
        NumDip = numDip;
        DateDip = dateDip;
        Etd = etd;
        Unv = unv;
    }

    public Integer getNumDip() {
        return NumDip;
    }

    public void setNumDip(Integer numDip) {
        NumDip = numDip;
    }

    public Date getDateDip() {
        return DateDip;
    }

    public void setDateDip(Date dateDip) {
        DateDip = dateDip;
    }

    public Etudiant getEtd() {
        return Etd;
    }

    public void setEtd(Etudiant etd) {
        Etd = etd;
    }

    public University getUnv() {
        return Unv;
    }

    public void setUnv(University unv) {
        Unv = unv;
    }
}

