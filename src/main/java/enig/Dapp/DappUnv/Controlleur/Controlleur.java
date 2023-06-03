package enig.Dapp.DappUnv.Controlleur;

import enig.Dapp.DappUnv.Model.Diplome;
import enig.Dapp.DappUnv.Model.Employeur;
import enig.Dapp.DappUnv.Model.Etudiant;
import enig.Dapp.DappUnv.Service.ServiceDiplomeImp;
import enig.Dapp.DappUnv.Service.ServiceEmoloyeur;
import enig.Dapp.DappUnv.Service.ServiceEtudiantImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
@CrossOrigin
public class Controlleur {

    @Autowired
    private ServiceEtudiantImp Etd;
    @Autowired
    private ServiceDiplomeImp dip;
@Autowired
    private ServiceEmoloyeur Emp;

    @PostMapping("/addE")
    public String addE(@RequestBody Etudiant Etudiant){
        Etd.saveEtudiant(Etudiant);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Etudiant> list(){
        return  Etd.getAllEtudiant();
    }

    @PostMapping("/addD")
    public String addD(@RequestBody Diplome Diplome){
        dip.saveDiplome(Diplome);
        return "New Diplome is added";
    }

    @GetMapping("/getAllD")
    public List<Diplome> listD(){
        return  dip.getAllDiplome();
    }


    @PostMapping("/addC")
    public String addC(@RequestBody Employeur Employeur){
        Emp.saveEmployeur(Employeur);
        return "New Employeur is added";
    }

    @GetMapping("/getAllC")
    public List<Employeur> listC(){
        return  Emp.getAllEmployeur();
    }

}
