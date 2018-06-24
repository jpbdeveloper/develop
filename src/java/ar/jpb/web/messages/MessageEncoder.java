package ar.jpb.web.messages;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * @author jbarrera
 */
public class MessageEncoder implements Encoder.Text<AppMessage> {

    @Override public String encode(final AppMessage message) throws EncodeException {
        System.out.println(" >> ar.jpb.web.messages.MessageEncoder.encode()");
        return message.getTo();
    }

    @Override public void init(final EndpointConfig config) {
        System.out.println(" >> ar.jpb.web.messages.MessageEncoder.init()");
    }

    @Override public void destroy() {
        System.out.println(" >> ar.jpb.web.messages.MessageEncoder.destroy()");
    }
    
}
