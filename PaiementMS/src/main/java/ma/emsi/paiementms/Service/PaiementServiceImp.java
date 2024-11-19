package ma.emsi.paiementms.Service;

import ma.emsi.paiementms.Entity.Paiement;
import ma.emsi.paiementms.Repo.PaiementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PaiementServiceImp implements PaiementService{

    @Autowired
    private PaiementRepo paiementRepo;
    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepo.findAll();
    }

    @Override
    public Paiement createPaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepo.deleteById(id);
    }
}
