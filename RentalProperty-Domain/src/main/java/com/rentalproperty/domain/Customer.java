package com.rentalproperty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

    private long id;
    private String name;
    private String surname;
    private String email;
    private int contact;
    private String password;


    public List<Orders> getOrders() {
        return orders;
    }

    private List<Orders> orders;

    private Customer() {

    }

    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.contact = builder.contact;
        this.password = builder.password;

        this.orders = builder.orders;
    }


    public static class Builder {
        long id;
        private String name;
        private String surname;
        private String email;
        private int contact;
        private String password;

        private List<Orders> orders;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder contact(int value) {
            this.contact = value;
            return this;
        }

        public Builder password(String value) {
            this.password = value;
            return this;
        }


        public Builder orders(List<Orders> value) {
            this.orders = value;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}



