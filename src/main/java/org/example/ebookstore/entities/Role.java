package org.example.ebookstore.entities;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    public enum UserRole {
        USER, ADMIN
    }

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private UserRole name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
    }

    public UserRole getName() {
        return name;
    }

    public void setName(UserRole name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return Collections.unmodifiableSet(this.users);
    }
    public void addUser(User user) {
        this.users.add(user);
    }
    public void removeUser(User user) {
        this.users.remove(user);
    }
}
