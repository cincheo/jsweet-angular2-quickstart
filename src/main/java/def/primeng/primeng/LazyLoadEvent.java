package def.primeng.primeng;
@jsweet.lang.Interface
public abstract class LazyLoadEvent extends jsweet.lang.Object {
    @jsweet.lang.Optional
    public double first;
    @jsweet.lang.Optional
    public double rows;
    @jsweet.lang.Optional
    public String sortField;
    @jsweet.lang.Optional
    public double sortOrder;
    @jsweet.lang.Optional
    public SortMeta[] multiSortMeta;
    @jsweet.lang.Optional
    public Filters filters;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Filters extends jsweet.lang.Object {
        native public FilterMetadata $get(String s);
    }
}

