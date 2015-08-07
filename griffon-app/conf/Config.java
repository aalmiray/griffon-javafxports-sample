import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "test")
                .e("startupGroups", asList("test"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("test", map()
                    .e("model", "org.example.TestModel")
                    .e("view", "org.example.TestView")
                    .e("controller", "org.example.TestController")
                )
            );
    }
}