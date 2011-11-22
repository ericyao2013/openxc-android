package com.openxc.measurements;

import com.openxc.units.Boolean;

public class BrakePedalStatus extends Measurement<Boolean>
        implements VehicleMeasurement {
    public final static String ID = "brake_pedal_status";

    public BrakePedalStatus() { }

    public BrakePedalStatus(Boolean value) {
        super(value);
    }

    public BrakePedalStatus(boolean value) {
        this(new Boolean(value));
    }

    public BrakePedalStatus(Double value) {
        this(new Boolean(value));
    }
}
