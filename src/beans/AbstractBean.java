package beans;

public abstract class AbstractBean implements Bean {
    private final String beanName;

    AbstractBean(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public String getBeanName() {
        return beanName;
    }
}