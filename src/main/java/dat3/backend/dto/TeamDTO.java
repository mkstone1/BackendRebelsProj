package dat3.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.backend.entity.Team;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeamDTO
{
    Integer id;
    String name;
    String division;

    public TeamDTO(Team t, boolean includeAll)
    {
        this.name = t.getName();
        this.division = t.getDivision();
        if (includeAll){
            this.id = t.getId();
        }
    }
}