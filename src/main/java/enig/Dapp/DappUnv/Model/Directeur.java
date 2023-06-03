package enig.Dapp.DappUnv.Model;

import jakarta.persistence.OneToMany;

import java.util.ArrayList;

public class Directeur {
    private Integer IdD;
    private String NomD;
    private String PrenomD;
    private String MaiLD;
    private String PwdD;
@OneToMany
    private ArrayList<Diplome> LD ;

    public Directeur() {
    }

    public Directeur(Integer idD, String nomD, String prenomD, String maiLD, String pwdD, ArrayList<Diplome> LD) {
        IdD = idD;
        NomD = nomD;
        PrenomD = prenomD;
        MaiLD = maiLD;
        PwdD = pwdD;
        this.LD = LD;
    }

    public Integer getIdD() {
        return IdD;
    }

    public void setIdD(Integer idD) {
        IdD = idD;
    }

    public String getNomD() {
        return NomD;
    }

    public void setNomD(String nomD) {
        NomD = nomD;
    }

    public String getPrenomD() {
        return PrenomD;
    }

    public void setPrenomD(String prenomD) {
        PrenomD = prenomD;
    }

    public String getMaiLD() {
        return MaiLD;
    }

    public void setMaiLD(String maiLD) {
        MaiLD = maiLD;
    }

    public String getPwdD() {
        return PwdD;
    }

    public void setPwdD(String pwdD) {
        PwdD = pwdD;
    }

    public ArrayList<Diplome> getLD() {
        return LD;
    }

    public void setLD(ArrayList<Diplome> LD) {
        this.LD = LD;
    }
}
