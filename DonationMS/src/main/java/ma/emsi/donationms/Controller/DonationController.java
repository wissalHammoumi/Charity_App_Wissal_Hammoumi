package ma.emsi.donationms.Controller;

import ma.emsi.donationms.Entity.Donation;
import ma.emsi.donationms.Service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonationController {
    @Autowired
    private DonationService donationService;

    @GetMapping("/listDonations")
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @PostMapping("/createDonation")
    public Donation createDonation(@RequestBody Donation donation) {
        return donationService.createDonation(donation);
    }

    @PutMapping("/updateDonation")
    public Donation updateDonation(@RequestBody Donation donation) {
        return donationService.updateDonation(donation);
    }

    @DeleteMapping("/deleteDonation")
    public void deleteDonation(@RequestParam("id") Long id) {
        donationService.deleteDonation(id);
    }

}
