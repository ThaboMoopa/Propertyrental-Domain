package com.rentalproperty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orders implements Serializable{

    private long id;
    private Date date;
    private List<OrdersLine> ordersLine;
    private Customer customer;

    private Orders()
    {

    }
    public Orders(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.ordersLine = builder.ordersLine;
        this.customer = builder.customer;
    }

    public static class Builder{
        private long id;
        private Date date;
        private List<OrdersLine> ordersLine;
        private Customer customer;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder date(Date value)
        {
            this.date = value;
            return this;
        }
        public Builder ordersLine(List<OrdersLine> value)
        {
            this.ordersLine = value;
            return this;
        }
        public Builder customer(Customer value)
        {
            this.customer = value;
            return this;
        }
        public Orders build()
        {
            return new Orders(this);
        }
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public List<OrdersLine> getOrdersLine() {
        return ordersLine;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        return id == orders.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
