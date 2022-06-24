package AutomationTests.UsersModel;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsersModel {
    @JsonProperty("meta")
    private String meta;
    @JsonProperty("data")
    private ModelClient data;

}
