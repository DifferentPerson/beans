package beans;

public class PintoBeanFactory extends AbstractBeanFactory<PintoBean> {
    private PintoBeanFactory() {
        super(PintoBean.getEssence());
    }

    public static PintoBeanFactory newPintoBeanFactory() {
        return new PintoBeanFactory();
    }

    @Override
    public PintoBean createBean(BeanConfiguration<PintoBean> beanConfiguration) {
        return new PintoBean(beanConfiguration.getBeanName());
    }
}
