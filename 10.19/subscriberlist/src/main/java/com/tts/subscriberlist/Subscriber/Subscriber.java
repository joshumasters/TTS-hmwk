package com.tts.subscriberlist.Subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Subscriber {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    @Column
    @CreationTimestamp
    private Date signedUp;

    public Subscriber(){

    }


    public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.signedUp = signedUp;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUp() {
        return this.signedUp;
    }

    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }


    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", userName='" + getUserName() + "'" +
            ", signedUp='" + getSignedUp() + "'" +
            "}";
    }
    

}
