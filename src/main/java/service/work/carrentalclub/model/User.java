package service.work.carrentalclub.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "leaser")
public class User extends BaseRecord implements UserDetails {

    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "driving_rate")
    private Integer drivingRate;
    @Column(name = "full_name")
    private String fullName;

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Rent> rents;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private Set<TopOfCars> topOfCars;



    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getDrivingRate() {
        return drivingRate;
    }

    public void setDrivingRate(Integer drivingRate) {
        this.drivingRate = drivingRate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Rent> getRents() {
        if (this.rents == null) {
            this.rents = new HashSet<>();
            return this.rents;
        }

        return rents;
    }

    public void setRents(Set<Rent> rents) {
        this.rents = rents;
    }

    public Set<TopOfCars> getTopOfCars() {
        if (this.topOfCars == null) {
            this.topOfCars = new HashSet<>();
            return this.topOfCars;
        }
        return topOfCars;
    }

    public void setTopOfCars(Set<TopOfCars> topOfCars) {
        this.topOfCars = topOfCars;
    }
}
