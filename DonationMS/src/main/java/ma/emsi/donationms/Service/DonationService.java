package ma.emsi.donationms.Service;

import ma.emsi.donationms.Entity.Donation;

import java.util.List;

public interface DonationService {
    public List<Donation> getAllDonations();
    public Donation createDonation(Donation donation);
    public Donation updateDonation(Donation donation);
    public void deleteDonation(Long id);
}
