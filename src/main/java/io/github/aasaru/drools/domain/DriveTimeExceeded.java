package io.github.aasaru.drools.domain;

import java.util.Objects;

public class DriveTimeExceeded {
    private Drive exceeded;

    public DriveTimeExceeded(Drive exceeded) {
        this.exceeded = exceeded;
    }


    /*public boolean equals(Object o) {
        return o instanceof DriveTimeExceeded && ((DriveTimeExceeded) object).getExceeded().equals();
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(exceeded);
    }

    @Override
    public String toString() {
        return "DriveTimeExceeded{" +
                "exceeded=" + exceeded +
                '}';
    }

    public Drive getExceeded() {
        return exceeded;
    }

    public void setExceeded(Drive exceeded) {
        this.exceeded = exceeded;
    }
}
