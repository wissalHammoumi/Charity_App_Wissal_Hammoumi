package ma.emsi.paiementms.Service;

import ma.emsi.paiementms.Entity.Paiement;

import java.util.List;

public interface PaiementService {
    public List<Paiement> getAllPaiements();
    public Paiement createPaiement(Paiement paiement);
    public Paiement updatePaiement(Paiement paiement);
    public void deletePaiement(Long id);
}
