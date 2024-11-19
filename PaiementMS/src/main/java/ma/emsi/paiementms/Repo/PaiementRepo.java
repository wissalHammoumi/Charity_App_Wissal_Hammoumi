package ma.emsi.paiementms.Repo;

import ma.emsi.paiementms.Entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepo extends JpaRepository<Paiement, Long> {
}
