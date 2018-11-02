package com.kodilla.good.patterns.airtrafic;

import java.util.Objects;

public final class Connection {
    private final String from;
    private final String to;

    public Connection(final String from, final String to) {
        this.from = from;
        this.to = to;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connection that = (Connection) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to);
    }
    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
