package enig.Dapp.DappUnv.Service;

import enig.Dapp.DappUnv.Model.Diplome;
import enig.Dapp.DappUnv.Repository.DiplomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDiplomeImp implements DiplomeService{

    @Autowired
    private DiplomeRepository DR;

    @Override
    public Diplome saveDiplome(Diplome Diplome) {
        return DR.save(Diplome);

    }

    @Override
    public List<Diplome> getAllDiplome() {
        return DR.findAll();
    }
}
