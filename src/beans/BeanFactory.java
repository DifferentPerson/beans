package beans;

public interface BeanFactory<B> {
    void setEssence(int beanEssence);

    B createBean(BeanConfiguration<B> beanConfiguration);
}