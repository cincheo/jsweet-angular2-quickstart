package def.primeng.primeng;
import def.angular.core.EventEmitter;
public class Paginator extends jsweet.lang.Object {
    public double rows;
    public double pageLinkSize;
    public EventEmitter<?> onPageChange;
    public Object style;
    public String styleClass;
    public double[] rowsPerPageOptions;
    public double[] pageLinks;
    public double _totalRecords;
    public double _first;
    public double totalRecords;
    public double first;
    native public Boolean isFirstPage();
    native public Boolean isLastPage();
    native public double getPageCount();
    native public double[] calculatePageLinkBoundaries();
    native public void updatePageLinks();
    native public void changePage(double p);
    native public double getPage();
    native public void changePageToFirst();
    native public void changePageToPrev();
    native public void changePageToNext();
    native public void changePageToLast();
    native public void onRppChange(Object event);
}

