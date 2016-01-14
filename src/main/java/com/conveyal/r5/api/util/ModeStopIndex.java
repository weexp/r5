package com.conveyal.r5.api.util;

import com.conveyal.r5.profile.Mode;

import java.util.Objects;

/**
 * Used as a key so that access and egress paths are not duplicated and are each inserted only once in each profileOption
 *
 */
public class ModeStopIndex {
    public LegMode mode;
    public int stopIndex;

    public ModeStopIndex(LegMode mode, int stopIndex) {
        this.mode = mode;
        this.stopIndex = stopIndex;
    }

    @Deprecated
    public ModeStopIndex(Mode mode, int startVertexStopIndex) {
        this.mode = LegMode.valueOf(mode.toString());
        this.stopIndex = startVertexStopIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ModeStopIndex that = (ModeStopIndex) o;
        return stopIndex == that.stopIndex && mode == that.mode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, stopIndex);
    }
}
