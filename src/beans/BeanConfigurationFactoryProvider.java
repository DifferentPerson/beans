package beans;

public interface BeanConfigurationFactoryProvider {
    static <B> BeanConfigurationFactory<B> provide() {
        return new BeanConfigurationFactory<>();
    }
}
