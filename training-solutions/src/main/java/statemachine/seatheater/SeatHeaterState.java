package statemachine.seatheater;

public enum SeatHeaterState {
    THIRD_STATE {
        SeatHeaterState next() {
            return SeatHeaterState.SECOND_STATE;
        }
    },

    SECOND_STATE {
        SeatHeaterState next() {
            return SeatHeaterState.FIRST_STATE;
        }
    },

    FIRST_STATE {
        SeatHeaterState next() {
            return SeatHeaterState.OFF;
        }
    },

    OFF {
        SeatHeaterState next() {
            return SeatHeaterState.THIRD_STATE;
        }
    };

    abstract SeatHeaterState next();
}
