package lexicon.se.g46emailsenderapi.service;

import lexicon.se.g46emailsenderapi.dto.EmailDTo;

public interface EmailService {
    String sendEmail(EmailDTo dTo);


}
