package beans;

import java.util.Collections;
import java.util.List;

public class PintoBean extends AbstractBean {
    private static final int ESSENCE = "bean".length();
    private final List<Bean> beans;

    PintoBean(String beanName) {
        super(beanName);
        beans = Collections.singletonList(this);
    }

    public static int getEssence() {
        return ESSENCE;
    }

    @Override
    public List<Bean> getBeans() {
        return beans;
    }
}