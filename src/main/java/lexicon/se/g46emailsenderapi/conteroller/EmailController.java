package lexicon.se.g46emailsenderapi.conteroller;

import jakarta.validation.Valid;
import lexicon.se.g46emailsenderapi.dto.EmailDTo;
import lexicon.se.g46emailsenderapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/email")
public class EmailController {
    private final  EmailService emailService;
@Autowired

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }
    @PostMapping
    public ResponseEntity<String> doSendEmail(@RequestBody  @Valid EmailDTo dTo){
        System.out.println("DTO:" + dTo);
       String response = emailService.sendEmail(dTo);
       return ResponseEntity.ok().body(response);
       
    }
}
