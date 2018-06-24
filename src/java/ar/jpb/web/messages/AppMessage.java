package ar.jpb.web.messages;

/**
 * @author jbarrera
 */
public class AppMessage {

    private String _from;
    private String _to;
    private String _content;

    public String getFrom() {
        return _from;
    }

    public void setFrom(String _from) {
        this._from = _from;
    }

    public String getTo() {
        return _to;
    }

    public void setTo(String _to) {
        this._to = _to;
    }

    public String getContent() {
        return _content;
    }

    public void setContent(String _content) {
        this._content = _content;
    }
    
}
