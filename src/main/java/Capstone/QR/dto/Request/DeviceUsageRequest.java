package Capstone.QR.dto.Request;

import lombok.Data;

@Data
public class DeviceUsageRequest {
    private String deviceId;
    private long usedMillis;
}
