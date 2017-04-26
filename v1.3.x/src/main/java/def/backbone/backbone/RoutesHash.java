package def.backbone.backbone;
@jsweet.lang.Interface
public abstract class RoutesHash extends def.js.Object {
    native public jsweet.util.union.Union<String,$get> $get(String routePattern);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class $get extends def.js.Object {
        native public void $apply(String... urlParts);
    }
}

