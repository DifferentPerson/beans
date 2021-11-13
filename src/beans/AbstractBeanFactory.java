package beans;

public abstract class AbstractBeanFactory<B> implements BeanFactory<B> {
    private int beanEssence;

    AbstractBeanFactory(int beanEssence) {
        this.beanEssence = beanEssence;
    }

    @Override
    public void setEssence(int beanEssence) {
        this.beanEssence = beanEssence;
    }
}