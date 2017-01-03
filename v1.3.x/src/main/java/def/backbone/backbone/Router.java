package def.backbone.backbone;
import def.js.RegExp;
import def.js.Function;
public class Router extends Events {
    public jsweet.util.union.Union<RoutesHash,?> routes;
    public Router(RouterOptions options){}
    native public void initialize(RouterOptions options);
    native public Router route(String route, String name, Function callback);
    native public Router navigate(String fragment, NavigateOptions options);
    native public Router navigate(String fragment, Boolean trigger);
    native public void execute(Function callback, Object[] args, String name);
    public Router(){}
    native public void initialize();
    native public Router route(String route, String name);
    native public Router navigate(String fragment);
    native public Router route(RegExp route, String name, Function callback);
    native public Router route(RegExp route, String name);
}

