package beans;

import java.util.List;

public interface Bean {
    List<Bean> getBeans();

    String getBeanName();
}