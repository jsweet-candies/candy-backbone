package def.backbone.backbone;
@jsweet.lang.Interface
public abstract class ViewOptions<TModel extends Model> extends def.js.Object {
    @jsweet.lang.Optional
    public TModel model;
    @jsweet.lang.Optional
    public def.backbone.backbone.Collection<Model> collection;
    @jsweet.lang.Optional
    public Object el;
    @jsweet.lang.Optional
    public EventsHash events;
    @jsweet.lang.Optional
    public String id;
    @jsweet.lang.Optional
    public String className;
    @jsweet.lang.Optional
    public String tagName;
    @jsweet.lang.Optional
    public Attributes attributes;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Attributes extends def.js.Object {
        native public java.lang.Object $get(String id);
    }
}

