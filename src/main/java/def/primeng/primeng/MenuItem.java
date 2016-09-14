package def.primeng.primeng;

import def.angular.core.EventEmitter;

@jsweet.lang.Interface
public abstract class MenuItem extends jsweet.lang.Object {
    @jsweet.lang.Optional
    public String label;
    @jsweet.lang.Optional
    public String icon;
    @jsweet.lang.Optional
    public java.util.function.Consumer<Object> command;
    @jsweet.lang.Optional
    public String url;
    @jsweet.lang.Optional
    public Object routerLink;
    @jsweet.lang.Optional
    public EventEmitter<?> eventEmitter;
    @jsweet.lang.Optional
    public MenuItem[] items;
    @jsweet.lang.Optional
    public Boolean expanded;
}

