package org.ibm.ce.quarkus.starting;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

public class Publisher {

    // ======================================
    // = Attributes =
    // ======================================

    public String name;

    public Instant createdDate = Instant.now();

    // ======================================
    // = Constructors =
    // ======================================

    public Publisher(String name) {
        this.name = name;
    }

    public Publisher() {
    }

}