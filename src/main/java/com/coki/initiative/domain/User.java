package com.coki.initiative.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import com.coki.initiative.config.Constants;

@Entity
@Table(name = "initiative_user")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(regexp = Constants.LOGIN_REGEX)
    @Size(min = 1,max = 10)
    @Column(length = 50,unique = true,nullable = false)
    private String username;


    @JsonIgnore
    @NotNull
    @Size(min = 60)
    @Column(name = "password_hash",length = 60,nullable = false)
    private String password;

    @Size(max = 50)
    @Column(name="last_name",length = 50)
    private String firstName;

    @Size(max = 50)
    @Column(name="last_name",length = 50)
    private String lastName;

    @Size(max = 50)
    @Email
    @Column(name="last_name",length = 50)
    private String email;

    @Size(max = 50)
    @Column(name="last_name",length = 50)
    @Pattern(regexp =Constants.MOBILE_REGEX)
    private String mobileNumber;

    @NotNull
    @Column(nullable = false)
    private boolean activated = false;

    @Size(max = 256)
    @Column(name="image_url",length=256)
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", activated=" + activated +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
