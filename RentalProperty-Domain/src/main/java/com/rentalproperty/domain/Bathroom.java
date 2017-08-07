package com.rentalproperty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Bathroom implements Serializable {

    private long id;
    private String type;

    private Bathroom()
    {

    }

    public Bathroom(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
    }
    public static class Builder{
        private long id;
        private String type;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder type(String value)
        {
            this.type = value;
            return this;
        }
        public Bathroom build()
        {
            return new Bathroom(this);
        }

    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bathroom bathroom = (Bathroom) o;

        return id == bathroom.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
