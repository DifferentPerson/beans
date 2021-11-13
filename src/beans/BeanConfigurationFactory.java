package beans;

import java.util.Objects;

public class BeanConfigurationFactory<B> {
    private String beanName;

    BeanConfigurationFactory() {
    }

    public BeanConfigurationFactory<B> setBeanName(String beanName) {
        this.beanName = beanName;
        return this;
    }

    public BeanConfiguration<B> build() {
        return new CustomBeanConfiguration<>(Objects.requireNonNull(beanName));
    }

    private static class CustomBeanConfiguration<B> implements BeanConfiguration<B> {
        private final String beanName;

        private CustomBeanConfiguration(String beanName) {
            this.beanName = beanName;
        }

        @Override
        public String getBeanName() {
            return beanName;
        }
    }
}
