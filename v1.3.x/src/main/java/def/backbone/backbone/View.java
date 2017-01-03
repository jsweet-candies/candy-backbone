package def.backbone.backbone;
import def.jquery.JQuery;
import def.dom.HTMLElement;
import def.js.Function;
public class View<TModel extends Model> extends Events {
    public View(ViewOptions<TModel> options){}
    native public void initialize(ViewOptions<TModel> options);
    native public EventsHash events();
    native public JQuery $(String selector);
    public TModel model;
    public Collection<TModel> collection;
    native public View<TModel> setElement(HTMLElement element, Boolean delegate);
    public String id;
    public String cid;
    public String className;
    public String tagName;
    public Object el;
    public JQuery $el;
    native public View<TModel> setElement(Object element);
    public Object attributes;
    native public JQuery $(Object selector);
    native public View<TModel> render();
    native public View<TModel> remove();
    native public Object delegateEvents(EventsHash events);
    native public View<TModel> delegate(String eventName, String selector, Function listener);
    native public Object undelegateEvents();
    native public View<TModel> undelegate(String eventName, String selector, Function listener);
    native public void _ensureElement();
    public View(){}
    native public void initialize();
    native public View<TModel> setElement(HTMLElement element);
    native public Object delegateEvents();
    native public View<TModel> undelegate(String eventName, String selector);
    native public View<TModel> undelegate(String eventName);
    native public View<TModel> setElement(JQuery element, Boolean delegate);
    native public View<TModel> setElement(JQuery element);
}

