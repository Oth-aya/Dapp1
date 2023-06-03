package enig.Dapp.DappUnv.Repository;

import enig.Dapp.DappUnv.Model.Diplome;
import enig.Dapp.DappUnv.Model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomeRepository  extends JpaRepository<Diplome,Integer> {
}
