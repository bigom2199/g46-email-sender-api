package lexicon.se.g46emailsenderapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class EmailDTo {
    @NotBlank(message = "To fields cannot be blank")
    @Email(message = "To fields must be valid email address ")
    private String to;
    @NotBlank(message = "Subject fields can not be blank")
    private String subject;
  @NotBlank(message = "Html fields cannot be blank")
    private String  html ;
  @NotBlank(message = "Type fields cannot be blank")
  @Positive(message = "Type should be positive number")
    private Integer type;


}