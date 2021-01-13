package com.kata.demo.core.infrastructure.referential.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Room")
public class MSRoom {
    @Id
    private String id;
    private String name;
    @OneToMany
    private List<MSBooking> bookings;
    private Long version;

    public MSRoom() {
    }

    public MSRoom(Long version) {
        this.version = version;
    }

    public Long getVersion() {
        return version;
    }
}
