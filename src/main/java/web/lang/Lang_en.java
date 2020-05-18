package web.lang;

import java.util.ListResourceBundle;

public class Lang_en extends ListResourceBundle {
    private static final Object[][] lang_en =
            {
                    {"cars","CARS"}
            };
    @Override
    protected Object[][] getContents() {
        return lang_en;
    }
}
