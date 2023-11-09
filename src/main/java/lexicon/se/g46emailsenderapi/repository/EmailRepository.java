package lexicon.se.g46emailsenderapi.repository;

import lexicon.se.g46emailsenderapi.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email,String> {



}
