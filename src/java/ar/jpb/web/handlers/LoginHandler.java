package ar.jpb.web.handlers;

import ar.jpb.web.messages.MessageDecoder;
import ar.jpb.web.messages.MessageEncoder;
import ar.jpb.web.session.SessionManager;
import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @author jpb.developer
 */
@ServerEndpoint(value = "/login", decoders = MessageDecoder.class, encoders = MessageEncoder.class)
public class LoginHandler {
    
    // javax websocket example
    // example: http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/HomeWebsocket/WebsocketHome.html#
    
    private final SessionManager _sessionManager;

    public LoginHandler() {
        System.out.println(" >> ar.jpb.web.handlers.LoginHandler.<init>()");
        _sessionManager = new SessionManager();
    }
    
    @OnOpen public void onOpen(final Session session) throws IOException {
        System.out.println(" >> ar.jpb.web.handlers.LoginHandler.onOpen()");
        _sessionManager.add(session);
    }
 
    @OnMessage public void onMessage(final String message, final Session session) throws IOException {
        System.out.println(" >> ar.jpb.web.handlers.LoginHandler.onMessage()");
        System.out.println(" >> "+ message);
    }
 
    @OnClose public void onClose(final Session session) throws IOException {
        System.out.println(" >> ar.jpb.web.handlers.LoginHandler.onClose()");
        if (!_sessionManager.remove(session)) {
            System.out.println(" -- No fue posible cerrar la Sesion del usuario");
        }
    }
 
    @OnError public void onError(final Session session, final Throwable throwable) {
        System.out.println(" >> ar.jpb.web.handlers.LoginHandler.onError()");
    }
    
}
