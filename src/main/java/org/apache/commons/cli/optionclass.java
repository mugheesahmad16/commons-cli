package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.List;

public class optionclass {
    private List<String> values;

    public optionclass() {
        this.values = new ArrayList<>();
    }

    // Copy constructor
    public optionclass(optionclass other) {
        this.values = new ArrayList<>(other.values); // Deep copy of the list
    }

    // Optional factory method
    public static optionclass copyOf(optionclass other) {
        return new optionclass(other);
    }

    // Getter for values
    public List<String> getValues() {
        return values;
    }

    // Setter for values
    public void setValues(List<String> values) {
        this.values = values;
    }

    // Replace the clone() method with a copy method
    public optionclass copy() {
        return new optionclass(this);
    }
}
