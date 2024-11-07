package com.kia.enumstrategy.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CarColor {
    BLACK {
        @Override
        public String selectedColor() {
            return  this + "--has 4% discount--";
        }
    },
    RED {
        @Override
        public String selectedColor() {
            return this + "--has 10% discount--";
        }
    },
    WHITE {
        @Override
        public String selectedColor() {
            return this + "has 6% discount";
        }
    };
    public abstract String selectedColor();
    @JsonCreator
    public static CarColor fromString(String key) {
        try {
            return CarColor.valueOf(key.toUpperCase());
        } catch (Exception e) {
            return BLACK; // Default value
        }
    }
}
