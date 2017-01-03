package def.backbone.backbone;
import def.jquery.JQueryStatic;
import def.jquery.JQueryXHR;
import def.jquery.JQueryAjaxSettings;
/** This class holds all the global functions and variables of the Backbone package. */
public final class Globals {
    private Globals(){}
    public static History history;
    native public static Object sync(String method, Model model, JQueryAjaxSettings options);
    native public static JQueryXHR ajax(JQueryAjaxSettings options);
    public static Boolean emulateHTTP;
    public static Boolean emulateJSON;
    native public static Backbone noConflict();
    public static JQueryStatic $;
    native public static Object sync(String method, Model model);
    native public static JQueryXHR ajax();
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param selector A string containing a selector expression
     * @param context A DOM Element, Document, or jQuery to use as context
     */
    native public static def.jquery.JQuery $(java.lang.String selector, def.dom.Element context);
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param element A DOM element to wrap in a jQuery object.
     */
    native public static def.jquery.JQuery $(def.dom.Element element);
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param elementArray An array containing a set of DOM elements to wrap in a jQuery object.
     */
    native public static def.jquery.JQuery $(def.dom.Element[] elementArray);
    /**
     * Binds a function to be executed when the DOM has finished loading.
     *
     * @param callback A function to execute after the DOM is ready.
     */
    native public static def.jquery.JQuery $(java.util.function.Function<JQueryStatic,Object> callback);
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param object A plain object to wrap in a jQuery object.
     */
    native public static def.jquery.JQuery $(java.lang.Object object);
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param object An existing jQuery object to clone.
     */
    native public static def.jquery.JQuery $(def.jquery.JQuery object);
    /**
     * Specify a function to execute when the DOM is fully loaded.
     */
    native public static def.jquery.JQuery $();
    /**
     * Creates DOM elements on the fly from the provided string of raw HTML.
     *
     * @param html A string of HTML to create on the fly. Note that this parses HTML, not XML.
     * @param ownerDocument A document in which the new elements will be created.
     */
    native public static def.jquery.JQuery $(java.lang.String html, def.dom.Document ownerDocument);
    /**
     * Creates DOM elements on the fly from the provided string of raw HTML.
     *
     * @param html A string defining a single, standalone, HTML element (e.g. <div/> or <div></div>).
     * @param attributes An object of attributes, events, and methods to call on the newly-created element.
     */
    native public static def.jquery.JQuery $(java.lang.String html, java.lang.Object attributes);
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param selector A string containing a selector expression
     * @param context A DOM Element, Document, or jQuery to use as context
     */
    native public static def.jquery.JQuery $(java.lang.String selector);
    /**
     * Binds a function to be executed when the DOM has finished loading.
     *
     * @param callback A function to execute after the DOM is ready.
     */
    native public static def.jquery.JQuery $(java.util.function.Supplier<Object> callback);
    /**
     * Accepts a string containing a CSS selector which is then used to match a set of elements.
     *
     * @param selector A string containing a selector expression
     * @param context A DOM Element, Document, or jQuery to use as context
     */
    native public static def.jquery.JQuery $(java.lang.String selector, def.jquery.JQuery context);
}

