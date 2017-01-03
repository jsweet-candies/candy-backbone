package def.backbone.backbone;
@jsweet.lang.Interface
@jsweet.lang.Extends({Parseable.class})
public abstract class CollectionFetchOptions extends PersistenceOptions {
    @jsweet.lang.Optional
    public Boolean reset;
    @jsweet.lang.Optional
    public Object parse;
}

