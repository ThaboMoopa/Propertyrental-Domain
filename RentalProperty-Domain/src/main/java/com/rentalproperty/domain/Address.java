package com.rentalproperty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


public class Address implements Serializable {

    private long id;
    private String street;
    private String city;
    private String province;
    private int postalCode;
    private Property property;

    private Address() {
    }

    public Address(Builder builder) {
        this.id = builder.id;
        this.property = builder.property;
        this.street = builder.street;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
    }

    public static class Builder{
        private long id;
        private Property property;
        private String street;
        private String city;
        private String province;
        private int postalCode;


        public Builder property(Property value)
        {
            this.property = value;
            return this;
        }
        public Builder id(long value)
        {
            this.id = value;
            return this;
        }

        public Builder street(String value)
        {
            this.street = value;
            return this;
        }
        public Builder city(String value)
        {
            this.city = value;
            return this;
        }
        public Builder province(String value)
        {
            this.province = value;
            return this;
        }
        public Builder postalCode(int value)
        {
            this.postalCode = value;
            return this;
        }
        public Address build() {
            return new Address(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public Property getProperty() {
        return property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return id == address.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
