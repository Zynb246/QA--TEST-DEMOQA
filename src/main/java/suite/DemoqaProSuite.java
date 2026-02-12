package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runners.*;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({
        TextBoxRunner.class,
        /*CheckBoxRunner.class,
        RadioButtonRunner.class,
        WebTablesRunner.class,
        Buttonsrunner.class,
        Linksrunner.class,
        BrokenLinksImagesRunner.class,
        UploadDownloadRunner.class,
        DynamicPropertiesRunner.class,
        PracticeFormRunner.class,
        BrowserWindowsRunner.class,
        AlertsRunner.class,
        FramesRunner.class,
        //NestedFramesRunner.class,
        ModalDialogsRunner.class,
        AccordianRunner.class,
        AutoCompleteRunner.class,
        DatePickerRunner.class,
        */SliderRunner.class,
        MenuRunner.class,
        SelectMenuRunner.class,
        SortableRunner.class,
        ResizableRunner.class,
        DroppableRunner.class,
        DragabbleRunner.class,
})


public class DemoqaProSuite {
}
