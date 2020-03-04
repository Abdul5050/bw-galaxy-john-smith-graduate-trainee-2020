package com.byteworks.TaskDeliveryApp.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String adminUserName;
    private String lastName;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
    
    private Date registeredDate;
    
    private String userName;

    public User() {
    	
    }

    public User(String firstName, String lastName, String email, String password,String user,String admin, Date registeredDate, boolean isDone) {
    	super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userName = user;
        this.adminUserName = admin;
        this.registeredDate = registeredDate;
    }

    public User(String firstName, String lastName, String email, String password,String user,String admin, Collection<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userName = user;
        this.adminUserName = admin;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String AdminUserName) {
        this.adminUserName = AdminUserName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + "*********" + '\'' +
                ", userName='" + userName + '\'' +
                ", adminUserName='" + adminUserName + '\'' +
                ", roles=" + roles +
                '}';
    }
    
    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
    public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
}
