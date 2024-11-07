package com.kia.enumstrategy.data;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CarGrade {
    SPORT {
        @Override
        public String carSelectedGrad() {
            return this+ " -- grade has 17% extra charge premium-- ";
        }
    },
    NORMAL {
        @Override
        public String carSelectedGrad() {
            return this+ "-- grade has 0% extra charge premium-- ";
        }
    },
    FULL_OPTION {
        @Override
        public String carSelectedGrad() {
            return this+ "-- grade has 24% extra charge premium--";
        }
    };
    public abstract String carSelectedGrad ();
}
