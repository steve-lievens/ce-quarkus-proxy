package org.ibm.ce.quarkus.starting;

import java.time.Instant;

public class Publisher {

    // ======================================
    // = Attributes =
    // ======================================

    public String name;

    public int id;

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