package def.backbone.backbone;
import def.jquery.JQueryXHR;
@jsweet.lang.Interface
public abstract class PersistenceOptions extends def.js.Object {
    @jsweet.lang.Optional
    public String url;
    @jsweet.lang.Optional
    public Object data;
    @jsweet.lang.Optional
    public java.util.function.Consumer<JQueryXHR> beforeSend;
    @jsweet.lang.Optional
    public jsweet.util.function.TriConsumer<Object,Object,Object> success;
    @jsweet.lang.Optional
    public jsweet.util.function.TriConsumer<Object,JQueryXHR,Object> error;
}

