package enig.Dapp.DappUnv.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdUv;
    private String NameUv;
    private String location;

    public University() {
    }


    public University(Integer idUv, String nameUv, String location) {
        IdUv = idUv;
        NameUv = nameUv;
        this.location = location;
    }

    public Integer getIdUv() {
        return IdUv;
    }

    public void setIdUv(Integer idUv) {
        IdUv = idUv;
    }

    public String getNameUv() {
        return NameUv;
    }

    public void setNameUv(String nameUv) {
        NameUv = nameUv;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
