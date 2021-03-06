package demo;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import uni.plovdiv.models.enums.UserRoles;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Enumerated(EnumType.STRING)
    private UserRoles role;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private Byte active;

    @Column(name = "remember_token")
    private String rememberToken;

    @JsonIgnore
    @Column(name = "deleted_at")
    private Date deletedAt;

    @JsonIgnore
    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @JsonIgnore
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;


    public String getFullName() {
        return this.firstName != null ? this.firstName.concat(" ").concat(this.lastName) : "";
    }
}
