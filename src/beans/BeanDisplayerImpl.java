package beans;

class BeanDisplayerImpl implements BeanDisplayer {
    static final BeanDisplayer INSTANCE = new BeanDisplayerImpl();

    @Override
    public void display(Bean bean) {
        System.out.println(bean.getBeanName());
    }
}
