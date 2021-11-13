package beans;

public interface BeanDisplayer {
    static BeanDisplayer getInstance() {
        return BeanDisplayerImpl.INSTANCE;
    }

    void display(Bean bean);
}
