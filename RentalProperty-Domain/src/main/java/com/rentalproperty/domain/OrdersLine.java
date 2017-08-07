package com.rentalproperty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class OrdersLine implements Serializable {

    private long id;
    private int quantity;
    private double price;
    private Property property;
    private Orders order;

    private OrdersLine()
    {

    }

    public OrdersLine(Builder builder) {
        this.id = builder.id;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.property = builder.property;
        this.order = builder.order;
    }
    public static class Builder{
        private long id;
        private int quantity;
        private double price;
        private Property property;
        private Orders order;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder quantity(int value)
        {
            this.quantity = value;
            return this;
        }
        public Builder price(double value)
        {
            this.price = value;
            return this;
        }
        public Builder property(Property value)
        {
            this.property = value;
            return this;
        }
        public Builder order(Orders value)
        {
            this.order = value;
            return this;
        }
        public OrdersLine build()
        {
            return new OrdersLine(this);
        }
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Property getProperty() {
        return property;
    }

    public Orders getOrder() {
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersLine that = (OrdersLine) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
