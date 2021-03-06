package demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;
import uni.plovdiv.models.RolesRegistered;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@Accessors(chain = true)
public class RegisterInfo {

    private String firstName;
    private String lastName;
    private String email;
    private Byte active;
}
