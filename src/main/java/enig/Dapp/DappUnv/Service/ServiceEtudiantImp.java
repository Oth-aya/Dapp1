package enig.Dapp.DappUnv.Service;

import enig.Dapp.DappUnv.Model.Etudiant;
import enig.Dapp.DappUnv.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEtudiantImp implements EtudiantService{

    @Autowired
    private EtudiantRepository ER;



    @Override
    public Etudiant saveEtudiant(Etudiant Etudiant) {
        return ER.save(Etudiant);

    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return ER.findAll();
    }




}
