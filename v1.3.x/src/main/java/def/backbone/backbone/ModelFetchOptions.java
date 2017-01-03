package def.backbone.backbone;
@jsweet.lang.Interface
@jsweet.lang.Extends({ModelSetOptions.class,Parseable.class})
public abstract class ModelFetchOptions extends PersistenceOptions {
    @jsweet.lang.Optional
    public Boolean validate;
    @jsweet.lang.Optional
    public Object parse;
}

