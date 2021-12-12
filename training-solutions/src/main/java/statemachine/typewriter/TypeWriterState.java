package statemachine.typewriter;

import statemachine.seatheater.SeatHeaterState;

public enum TypeWriterState {
    UPPERCASE {
        TypeWriterState changeCaps() {
            return TypeWriterState.LOWERCASE;
        }
    },

    LOWERCASE {
        TypeWriterState changeCaps() {
            return TypeWriterState.UPPERCASE;
        }
    };

    abstract TypeWriterState changeCaps();
}
