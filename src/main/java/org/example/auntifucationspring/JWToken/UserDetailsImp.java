package org.example.auntifucationspring.JWToken;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.auntifucationspring.Model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@Data
@AllArgsConstructor
public class UserDetailsImp implements UserDetails {

    private Long id;
    private String username;
    private String email;
    private String password;


    public static UserDetailsImp build(User user) {
        return new UserDetailsImp(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword());
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
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
}
