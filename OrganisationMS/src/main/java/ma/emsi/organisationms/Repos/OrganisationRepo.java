package ma.emsi.organisationms.Repos;


import ma.emsi.organisationms.Entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepo extends JpaRepository<Organisation, Long> {
}
