package enig.Dapp.DappUnv.Service;

import enig.Dapp.DappUnv.Model.Diplome;
import enig.Dapp.DappUnv.Model.Etudiant;

import java.util.List;

public interface DiplomeService {
    public Diplome saveDiplome( Diplome  Diplome );
    public List< Diplome> getAllDiplome();
}
