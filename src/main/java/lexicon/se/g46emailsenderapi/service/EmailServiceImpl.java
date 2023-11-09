package lexicon.se.g46emailsenderapi.service;

import lexicon.se.g46emailsenderapi.dto.EmailDTo;
import lexicon.se.g46emailsenderapi.entity.Email;
import lexicon.se.g46emailsenderapi.repository.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    private final EmailRepository emailRepository;

    public EmailServiceImpl(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    public String sendEmail(EmailDTo dto) {
        if (dto == null) throw new IllegalAccessException("Email is null");
        Email emailEntity = Email.builder()
                .to(dto.getTo())
                .from("test@test.se")
                .content(dto.getHtml())
                .content(dto.getHtml())
                .Type(dto.getType())
                .build();
       Email saveEmail = emailRepository.save(emailEntity);
       // todo: implement to logic to send to email to user
  return saveEmail.getId();
    }
}
