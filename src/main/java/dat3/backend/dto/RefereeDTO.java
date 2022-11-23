package dat3.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.backend.entity.Referee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefereeDTO {
    String username;
    String password;
    String email;
    String firstname;
    String lastname;
    String position;
    String license;
    String bankInformation;

    public RefereeDTO(String username, String password, String email, String firstname, String lastname, String position, String bankInformation) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.license = license;
        this.bankInformation = bankInformation;
    }

    public RefereeDTO(Referee r){
        this.username = r.getUsername();
        this.password = r.getPassword();
        this.email = r.getEmail();
        this.firstname = r.getFirstname();
        this.lastname = r.getLastname();
        this.position = r.getPosition();
        this.license = r.getLicense().toString();
        this.bankInformation = r.getBankInformation();
    }
}