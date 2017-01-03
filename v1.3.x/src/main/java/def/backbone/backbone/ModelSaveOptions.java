package def.backbone.backbone;
import def.jquery.JQueryXHR;
@jsweet.lang.Interface
@jsweet.lang.Extends({Waitable.class,Validable.class,Parseable.class,PersistenceOptions.class})
public abstract class ModelSaveOptions extends Silenceable {
    @jsweet.lang.Optional
    public Boolean patch;
    @jsweet.lang.Optional
    public Boolean wait;
    @jsweet.lang.Optional
    public Boolean validate;
    @jsweet.lang.Optional
    public Object parse;
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

