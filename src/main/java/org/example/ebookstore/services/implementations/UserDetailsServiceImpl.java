package org.example.ebookstore.services.implementations;

import org.example.ebookstore.entities.User;
import org.example.ebookstore.security.CustomUserDetails;
import org.example.ebookstore.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;

    @Autowired
    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optional = this.userService.findByUsername(username);
        if (optional.isEmpty()) {
            throw new UsernameNotFoundException("Cannot find user with username: " + username);
        }
        User user = optional.get();

        Set<SimpleGrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                .collect(Collectors.toSet());

        return new CustomUserDetails(user.getFirstName(), user.getLastName(), authorities,
                user.getUsername(), user.getPassword());
    }
}