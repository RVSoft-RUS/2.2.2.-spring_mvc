package web.lang;

import java.util.ListResourceBundle;

public class Lang_ru extends ListResourceBundle {
    private static final Object[][] lang_ru =
            {
                    {"cars","МАШИНЫ"}
            };
    @Override
    protected Object[][] getContents() {
        return lang_ru;
    }
}
