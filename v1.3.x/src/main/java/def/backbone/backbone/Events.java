package def.backbone.backbone;
import def.js.Function;
public class Events extends def.js.Object {
    native public Object on(String eventName, Function callback, Object context);
    native public Object on(EventsHash eventMap);
    native public Object off(String eventName, Function callback, Object context);
    native public Object trigger(String eventName, Object... args);
    native public Object bind(String eventName, Function callback, Object context);
    native public Object unbind(String eventName, Function callback, Object context);
    native public Object once(String events, Function callback, Object context);
    native public Object listenTo(Object object, String events, Function callback);
    native public Object listenToOnce(Object object, String events, Function callback);
    native public Object stopListening(Object object, String events, Function callback);
    native public Object on(String eventName, Function callback);
    native public Object on(String eventName);
    native public Object off(String eventName, Function callback);
    native public Object off(String eventName);
    native public Object off();
    native public Object bind(String eventName, Function callback);
    native public Object unbind(String eventName, Function callback);
    native public Object unbind(String eventName);
    native public Object unbind();
    native public Object once(String events, Function callback);
    native public Object stopListening(Object object, String events);
    native public Object stopListening(Object object);
    native public Object stopListening();
}

