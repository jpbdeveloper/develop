package ar.jpb.web.elements;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jbarrera
 */
public class DeviceManager {
    
    private final Set<DeviceBO> _deviceList;
    
    public DeviceManager() {
        _deviceList = new HashSet<>();
    }
    
    public void add(final DeviceBO device) {
        _deviceList.add(device);
    }
    
    public boolean remove(final DeviceBO device) {
        return _deviceList.remove(device);
    }
    
    public Set<DeviceBO> getList() {
        return _deviceList;
    }
    
}
