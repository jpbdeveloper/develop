package ar.jpb.web.messages;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 * @author jbarrera
 */
public class MessageDecoder implements Decoder.Text<AppMessage> {

    @Override public AppMessage decode(final String request) throws DecodeException {
        System.out.println(" >> ar.jpb.web.messages.MessageDecoder.decode()");
        final AppMessage appMessage = new AppMessage();
        appMessage.setFrom(request);
        return appMessage;
    }

    @Override public boolean willDecode(final String request) {
        System.out.println(" >> ar.jpb.web.messages.MessageDecoder.willDecode()");
        return request!=null;
    }

    @Override public void init(final EndpointConfig config) {
        System.out.println(" >> ar.jpb.web.messages.MessageDecoder.init()");
    }

    @Override public void destroy() {
        System.out.println(" >> ar.jpb.web.messages.MessageDecoder.destroy()");
    }
    
}
