package ru.clevertec.AQS.monitor;

import android.content.Context;
import android.content.res.Resources;

public enum DataType {
    TEMPERATURE,
    HUMIDITY,
    CO2,
    TVOC,
    PM,
    RADIATION;

    public String getDisplayName(Context context) {
        Resources res = context.getResources();
        int resId = res.getIdentifier("datatype_" + this.name(), "string", context.getPackageName());
        return res.getString(resId);
    }

    public float getDefaultMinValue() {
        switch (this) {
            case TEMPERATURE:
                return 15F;
            case HUMIDITY:
                return 0F;
            case CO2:
                return 400F;
            case TVOC:
                return 0F;
            case PM:
                return 0F;
            case RADIATION:
                return 0F;
            default:
                return 0F;
        }
    }

    public float getDefaultMaxValue() {
        switch (this) {
            case TEMPERATURE:
                return 30F;
            case HUMIDITY:
                return 100F;
            case CO2:
                return 2000F;
            case TVOC:
                return 200F;
            case PM:
                return 200F;
            case RADIATION:
                return 300F;
            default:
                return 1F;
        }
    }
}
