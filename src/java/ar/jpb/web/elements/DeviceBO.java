package ar.jpb.web.elements;

/**
 * @author jbarrera
 */
public class DeviceBO {

    private int _id;
    private String _name;
    private String _status;
    private String _type;
    private String _description;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String _status) {
        this._status = _status;
    }

    public String getType() {
        return _type;
    }

    public void setType(String _type) {
        this._type = _type;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }
    
    public String toMessage() {
        System.out.println(" >> ar.jpb.web.elements.DeviceBO.toMessage()");
        return "{ \"code\": 404 }";
    }
}
