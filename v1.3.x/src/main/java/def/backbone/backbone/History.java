package def.backbone.backbone;
import def.dom.Window;
import def.js.Function;
public class History extends Events {
    public Object[] handlers;
    public double interval;
    native public Boolean start(HistoryOptions options);
    native public String getHash(Window window);
    native public String getFragment(String fragment);
    native public String decodeFragment(String fragment);
    native public String getSearch();
    native public void stop();
    native public double route(String route, Function callback);
    native public void checkUrl(Object e);
    native public String getPath();
    native public Boolean matchRoot();
    native public Boolean atRoot();
    native public Boolean loadUrl(String fragmentOverride);
    native public Boolean navigate(String fragment, Object options);
    public static Boolean started;
    public Object options;
    native public Boolean start();
    native public String getHash();
    native public String getFragment();
    native public void checkUrl();
    native public Boolean loadUrl();
    native public Boolean navigate(String fragment);
}

