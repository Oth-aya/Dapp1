package enig.Dapp.DappUnv.Repository;

import enig.Dapp.DappUnv.Model.Employeur;
import enig.Dapp.DappUnv.Model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeurRepository  extends JpaRepository<Employeur,Integer> {
}
