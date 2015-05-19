package net.formicary.simplewebapp.users.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Created by Zhangariny on 11/05/2015.
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name= "users")
public class User implements java.io.Serializable {
    private Integer id;
    private String name;
    private String email;
    private String dob;
    private String telnumb;
    private String address;

    public User() {
    }

    public User(String name, String email, String dob, String telnumb, String address) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.telnumb = telnumb;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "USER_ID", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "USER_NAME", unique = false, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "USER_EMAIL", unique = false, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "USER_DOB", unique = false, nullable = false)
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Column(name = "USER_TELNUMB", unique = false, nullable = false)
    public String getTelnumb() {
        return telnumb;
    }

    public void setTelnumb(String telnumb) {
        this.telnumb = telnumb;
    }

    @Column(name = "USER_ADDRESS", unique = false, nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + email + " " + dob + " " + telnumb + " " + address;
    }

}
