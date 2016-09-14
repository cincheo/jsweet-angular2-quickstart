package def.primeng.primeng;
import def.angular.core.EventEmitter;
import def.angular.core.QueryList;
import def.angular.core.TemplateRef;
import def.angular.platform_browser.DomSanitizer;
import jsweet.dom.File;
public class FileUpload extends jsweet.lang.Object {
    public String name;
    public String url;
    public Boolean multiple;
    public String accept;
    public Boolean disabled;
    public Boolean auto;
    public double maxFileSize;
    public String invalidFileSizeMessageSummary;
    public String invalidFileSizeMessageDetail;
    public String style;
    public String styleClass;
    public double previewWidth;
    public EventEmitter<?> onBeforeUpload;
    public EventEmitter<?> onUpload;
    public EventEmitter<?> onError;
    public EventEmitter<?> onClear;
    public EventEmitter<?> onSelect;
    public QueryList<?> templates;
    public File[] files;
    public double progress;
    public Boolean dragHighlight;
    public Message[] msgs;
    public TemplateRef<?> fileTemplate;
    public TemplateRef<?> contentTemplate;
    public FileUpload(DomSanitizer sanitizer){}
    native public void ngOnInit();
    native public void ngAfterContentInit();
    native public void onChooseClick(Object event, Object fileInput);
    native public void onFileSelect(Object event);
    native public Boolean validate(File file);
    native public Boolean isImage(File file);
    native public void onImageLoad(Object img);
    native public void upload();
    native public void clear();
    native public void remove(double index);
    native public Boolean hasFiles();
    native public void onDragEnter(Object e);
    native public void onDragOver(Object e);
    native public void onDragLeave(Object e);
    native public void onDrop(Object e);
    native public String formatSize(Object bytes);
    protected FileUpload(){}
}

