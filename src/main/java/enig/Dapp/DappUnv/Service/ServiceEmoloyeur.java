package enig.Dapp.DappUnv.Service;

import enig.Dapp.DappUnv.Model.Employeur;
import enig.Dapp.DappUnv.Repository.EmployeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmoloyeur  implements EmployeurService{
    @Autowired
    private EmployeurRepository empR;
    @Override
    public Employeur saveEmployeur(Employeur employeur) {

        return empR.save(employeur);
    }

    @Override
    public List<Employeur> getAllEmployeur() {
        return empR.findAll();
    }
}
