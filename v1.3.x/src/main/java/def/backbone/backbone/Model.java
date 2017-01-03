package def.backbone.backbone;
import def.jquery.JQueryXHR;
public class Model extends ModelBase {
    public Object attributes;
    public Object[] changed;
    public String cidPrefix;
    public String cid;
    public Collection<Model> collection;
    native public ObjectHash defaults();
    public Object id;
    public String idAttribute;
    public Object validationError;
    public Object urlRoot;
    public Model(Object attributes, Object options){}
    native public void initialize(Object attributes, Object options);
    native public JQueryXHR fetch(ModelFetchOptions options);
    native public Object get(String attributeName);
    native public Model set(String attributeName, Object value, ModelSetOptions options);
    native public Model set(Object obj, ModelSetOptions options);
    /**
         * Return an object containing all the attributes that have changed, or
         * false if there are no changed attributes. Useful for determining what
         * parts of a view need to be updated and/or what attributes need to be
         * persisted to the server. Unset attributes will be set to undefined.
         * You can also pass an attributes object to diff against the model,
         * determining if there *would be* a change. */
    native public Object changedAttributes(Object attributes);
    native public Object clear(Silenceable options);
    @jsweet.lang.Name("clone")
    native public Model Clone();
    native public Object destroy(ModelDestroyOptions options);
    native public String escape(String attribute);
    native public Boolean has(String attribute);
    native public Boolean hasChanged(String attribute);
    native public Boolean isNew();
    native public Boolean isValid(Object options);
    native public Object previous(String attribute);
    native public Object[] previousAttributes();
    native public Object save(Object attributes, ModelSaveOptions options);
    native public Model unset(String attribute, Silenceable options);
    native public Object validate(Object attributes, Object options);
    native public String[] keys();
    native public Object[] values();
    native public Object[] pairs();
    native public Object invert();
    native public Object pick(String... keys);
    native public Object pick(jsweet.util.function.TriFunction<Object,Object,Object,Object> fn);
    native public Object omit(String... keys);
    native public Object omit(jsweet.util.function.TriFunction<Object,Object,Object,Object> fn);
    native public Object chain();
    native public Boolean isEmpty();
    native public Boolean matches(Object attrs);
    public Model(Object attributes){}
    public Model(){}
    native public void initialize(Object attributes);
    native public void initialize();
    native public JQueryXHR fetch();
    native public Model set(String attributeName, Object value);
    native public Model set(Object obj);
    /**
         * Return an object containing all the attributes that have changed, or
         * false if there are no changed attributes. Useful for determining what
         * parts of a view need to be updated and/or what attributes need to be
         * persisted to the server. Unset attributes will be set to undefined.
         * You can also pass an attributes object to diff against the model,
         * determining if there *would be* a change. */
    native public Object changedAttributes();
    native public Object clear();
    native public Object destroy();
    native public Boolean hasChanged();
    native public Boolean isValid();
    native public Object save(Object attributes);
    native public Object save();
    native public Model unset(String attribute);
    native public Object validate(Object attributes);
}

