package lexicon.se.g46emailsenderapi.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
public class Email {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column( name = " _from ",nullable = false)
    private String from;

    @Column(name = "_to",nullable = false)
    private String to;

    private String subject ;
    @Lob
    @Column(length = 65000)
    private String content;
    @Lob
    private List<String> attachment;

    private LocalDate dateTime ;
    private Integer Type;


    @PrePersist
    public void initialData(){
        dateTime = LocalDateTime.now();
    }
}
