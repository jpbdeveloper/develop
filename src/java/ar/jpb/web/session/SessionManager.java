package ar.jpb.web.session;

import ar.jpb.web.elements.DeviceBO;
import ar.jpb.web.elements.DeviceManager;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.Session;

/**
 * @author jbarrera
 */
public class SessionManager {

    private final Set<Session> _sessions;
    private final DeviceManager _deviceManager;
    
    public SessionManager() {
        _sessions = new HashSet<>();
        _deviceManager = new DeviceManager();
    }
    
    public void add(final Session session) {
        _sessions.add(session);
        for (final DeviceBO device : _deviceManager.getList()) {
            sendToSession(session, device.toMessage());
        }
    }
    
    public boolean contains(final Session session) {
        return _sessions.contains(session);
    }
    
    public boolean remove(final Session session) {
        return _sessions.remove(session);
    }
    
    
}
