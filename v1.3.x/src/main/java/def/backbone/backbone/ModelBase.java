package def.backbone.backbone;
import def.jquery.JQueryXHR;
public class ModelBase extends Events {
    public Object url;
    native public Object parse(Object response, Object options);
    native public Object toJSON(Object options);
    native public JQueryXHR sync(Object... arg);
    native public Object parse(Object response);
    native public Object toJSON();
}

