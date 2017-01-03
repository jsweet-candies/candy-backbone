package def.backbone.backbone;
import jsweet.util.union.Union3;
import def.jquery.JQueryXHR;
public class Collection<TModel extends Model> extends ModelBase {
    public java.util.function.Function<Object,TModel> model;
    public TModel[] models;
    public double length;
    public Collection(TModel[] models, Object options){}
    native public void initialize(TModel[] models, Object options);
    native public JQueryXHR fetch(CollectionFetchOptions options);
    /**
         * Specify a model attribute name (string) or function that will be used to sort the collection.
         */
    public Union3<String,java.util.function.Function<TModel,jsweet.util.union.Union<Double,String>>,java.util.function.BiFunction<TModel,TModel,Double>> comparator;
    native public TModel add(java.lang.Object model, AddOptions options);
    native public TModel[] add(java.lang.Object[] models, AddOptions options);
    native public TModel at(double index);
    native public TModel get(double id);
    native public Boolean has(double key);
    native public TModel create(Object attributes, ModelSaveOptions options);
    native public Object[] pluck(String attribute);
    native public TModel push(TModel model, AddOptions options);
    native public TModel pop(Silenceable options);
    native public TModel remove(java.lang.Object model, Silenceable options);
    native public TModel[] remove(java.lang.Object[] models, Silenceable options);
    native public TModel[] reset(TModel[] models, Silenceable options);
    native public TModel[] set(TModel[] models, Silenceable options);
    native public TModel shift(Silenceable options);
    native public Collection<TModel> sort(Silenceable options);
    native public TModel unshift(TModel model, AddOptions options);
    native public TModel[] where(Object properties);
    native public TModel findWhere(Object properties);
    native public Object modelId(Object attrs);
    /**
         * Return a shallow copy of this collection's models, using the same options as native Array#slice.
         */
    native public TModel[] slice(double min, double max);
    native public Boolean all(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public Boolean any(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public Object chain();
    native public <TResult> TResult[] collect(def.underscore._.ListIterator<TModel,TResult> iterator, Object context);
    native public Boolean contains(TModel value);
    native public def.underscore._.Dictionary<Double> countBy(def.underscore._.ListIterator<TModel,?> iterator);
    native public def.underscore._.Dictionary<Double> countBy(String iterator);
    native public TModel detect(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public TModel[] difference(TModel[] others);
    native public TModel[] drop(double n);
    native public TModel[] each(def.underscore._.ListIterator<TModel,Void> iterator, Object context);
    native public Boolean every(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public TModel[] filter(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public TModel find(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public double findIndex(def.underscore._.ListIterator<TModel,Boolean> predicate, Object context);
    native public double findLastIndex(def.underscore._.ListIterator<TModel,Boolean> predicate, Object context);
    native public TModel first();
    native public TModel[] first(double n);
    native public <TResult> TResult foldl(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo, Object context);
    native public <TResult> TResult foldr(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo, Object context);
    native public TModel[] forEach(def.underscore._.ListIterator<TModel,Void> iterator, Object context);
    native public def.underscore._.Dictionary<TModel[]> groupBy(def.underscore._.ListIterator<TModel,?> iterator, Object context);
    native public def.underscore._.Dictionary<TModel[]> groupBy(String iterator, Object context);
    native public TModel head();
    native public TModel[] head(double n);
    native public Boolean include(TModel value);
    native public Boolean includes(TModel value);
    native public def.underscore._.Dictionary<TModel> indexBy(def.underscore._.ListIterator<TModel,?> iterator, Object context);
    native public def.underscore._.Dictionary<TModel> indexBy(String iterator, Object context);
    native public double indexOf(TModel value, Boolean isSorted);
    native public TModel initial();
    native public TModel[] initial(double n);
    native public <TResult> TResult inject(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo, Object context);
    native public Object invoke(String methodName, Object... args);
    native public Boolean isEmpty();
    native public TModel last();
    native public TModel[] last(double n);
    native public double lastIndexOf(TModel value, double from);
    native public <TResult> TResult[] map(def.underscore._.ListIterator<TModel,TResult> iterator, Object context);
    native public TModel max(def.underscore._.ListIterator<TModel,?> iterator, Object context);
    native public TModel min(def.underscore._.ListIterator<TModel,?> iterator, Object context);
    native public TModel[][] partition(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public <TResult> TResult reduce(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo, Object context);
    native public <TResult> TResult reduceRight(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo, Object context);
    native public TModel[] reject(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public TModel[] rest(double n);
    native public TModel sample();
    native public TModel[] sample(double n);
    native public TModel[] select(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public TModel[] shuffle();
    native public double size();
    native public Boolean some(def.underscore._.ListIterator<TModel,Boolean> iterator, Object context);
    native public <TSort> TModel[] sortBy(def.underscore._.ListIterator<TModel,TSort> iterator, Object context);
    native public TModel[] sortBy(String iterator, Object context);
    native public TModel[] tail(double n);
    native public TModel take();
    native public TModel[] take(double n);
    native public TModel[] toArray();
    native public TModel[] without(@SuppressWarnings("unchecked") TModel... values);
    public Collection(TModel[] models){}
    public Collection(){}
    native public void initialize(TModel[] models);
    native public void initialize();
    native public JQueryXHR fetch();
    native public TModel add(java.lang.Object model);
    native public TModel[] add(java.lang.Object[] models);
    native public TModel push(TModel model);
    native public TModel pop();
    native public TModel remove(java.lang.Object model);
    native public TModel[] remove(java.lang.Object[] models);
    native public TModel[] reset(TModel[] models);
    native public TModel[] reset();
    native public TModel[] set(TModel[] models);
    native public TModel[] set();
    native public TModel shift();
    native public Collection<TModel> sort();
    native public TModel unshift(TModel model);
    /**
         * Return a shallow copy of this collection's models, using the same options as native Array#slice.
         */
    native public TModel[] slice(double min);
    native public Boolean all(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public Boolean all();
    native public Boolean any(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public Boolean any();
    native public <TResult> TResult[] collect(def.underscore._.ListIterator<TModel,TResult> iterator);
    native public def.underscore._.Dictionary<Double> countBy();
    native public TModel detect(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public TModel[] drop();
    native public TModel[] each(def.underscore._.ListIterator<TModel,Void> iterator);
    native public Boolean every(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public TModel[] filter(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public TModel find(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public double findIndex(def.underscore._.ListIterator<TModel,Boolean> predicate);
    native public double findLastIndex(def.underscore._.ListIterator<TModel,Boolean> predicate);
    native public <TResult> TResult foldl(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo);
    native public <TResult> TResult foldl(def.underscore._.MemoIterator<TModel,TResult> iterator);
    native public <TResult> TResult foldr(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo);
    native public <TResult> TResult foldr(def.underscore._.MemoIterator<TModel,TResult> iterator);
    native public TModel[] forEach(def.underscore._.ListIterator<TModel,Void> iterator);
    native public def.underscore._.Dictionary<TModel[]> groupBy(def.underscore._.ListIterator<TModel,?> iterator);
    native public def.underscore._.Dictionary<TModel[]> groupBy(String iterator);
    native public def.underscore._.Dictionary<TModel> indexBy(def.underscore._.ListIterator<TModel,?> iterator);
    native public def.underscore._.Dictionary<TModel> indexBy(String iterator);
    native public double indexOf(TModel value);
    native public <TResult> TResult inject(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo);
    native public <TResult> TResult inject(def.underscore._.MemoIterator<TModel,TResult> iterator);
    native public double lastIndexOf(TModel value);
    native public <TResult> TResult[] map(def.underscore._.ListIterator<TModel,TResult> iterator);
    native public TModel max(def.underscore._.ListIterator<TModel,?> iterator);
    native public TModel max();
    native public TModel min(def.underscore._.ListIterator<TModel,?> iterator);
    native public TModel min();
    native public <TResult> TResult reduce(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo);
    native public <TResult> TResult reduce(def.underscore._.MemoIterator<TModel,TResult> iterator);
    native public <TResult> TResult reduceRight(def.underscore._.MemoIterator<TModel,TResult> iterator, TResult memo);
    native public <TResult> TResult reduceRight(def.underscore._.MemoIterator<TModel,TResult> iterator);
    native public TModel[] reject(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public TModel[] rest();
    native public TModel[] select(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public Boolean some(def.underscore._.ListIterator<TModel,Boolean> iterator);
    native public Boolean some();
    native public <TSort> TModel[] sortBy(def.underscore._.ListIterator<TModel,TSort> iterator);
    native public <TSort> TModel[] sortBy();
    native public TModel[] sortBy(String iterator);
    native public TModel[] tail();
    public Collection(Object[] models, Object options){}
    native public void initialize(Object[] models, Object options);
    native public TModel add(TModel model, AddOptions options);
    native public TModel[] add(TModel[] models, AddOptions options);
    native public TModel get(Model id);
    native public TModel get(String id);
    native public Boolean has(Model key);
    native public Boolean has(String key);
    native public TModel remove(TModel model, Silenceable options);
    native public TModel[] remove(TModel[] models, Silenceable options);
    public Collection(Object[] models){}
    native public void initialize(Object[] models);
    native public TModel add(TModel model);
    native public TModel[] add(TModel[] models);
    native public TModel remove(TModel model);
    native public TModel[] remove(TModel[] models);
}
