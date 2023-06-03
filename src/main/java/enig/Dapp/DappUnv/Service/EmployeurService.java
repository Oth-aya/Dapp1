package enig.Dapp.DappUnv.Service;

import enig.Dapp.DappUnv.Model.Employeur;

import java.util.List;

public interface EmployeurService {
   public Employeur saveEmployeur(Employeur employeur);

  public   List<Employeur> getAllEmployeur();
}
