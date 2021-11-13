import beans.*;

public class Main {
    public static void main(String[] args) {
        BeanConfiguration<PintoBean> beanConfiguration = BeanConfigurationFactoryProvider
                .<PintoBean>provide()
                .setBeanName("PintoBean")
                .build();
        BeanFactory<PintoBean> pintoBeanBeanFactory = PintoBeanFactory.newPintoBeanFactory();
        pintoBeanBeanFactory.setEssence(PintoBean.getEssence());
        Bean pintoBean = pintoBeanBeanFactory.createBean(beanConfiguration);
        BeanDisplayer.getInstance().display(pintoBean);
    }
}
