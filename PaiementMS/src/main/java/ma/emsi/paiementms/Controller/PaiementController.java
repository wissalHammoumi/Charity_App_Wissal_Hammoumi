package ma.emsi.paiementms.Controller;

import ma.emsi.paiementms.Entity.Paiement;
import ma.emsi.paiementms.Service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaiementController {
    @Autowired
    private PaiementService paiementService;

    @PostMapping("/createPaiement")
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }

    @GetMapping("/listPaiements")
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }

    @DeleteMapping("/deletePaiement")
    public void deletePaiement(@RequestParam("id") Long id) {
        paiementService.deletePaiement(id);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement user) {
        return paiementService.updatePaiement(user);
    }
}
