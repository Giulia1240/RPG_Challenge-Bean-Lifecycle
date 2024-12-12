package acc.br.bean.life.cycle.beans;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Item implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean, BeanFactoryAware {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
    public void customInit() {
        if (name == null || name.isEmpty()) {
            System.out.println("customInit: The item name was not specified, so it was assigned to the default value 'DefaultItem'.");
            name = "DefaultItem";
        } else {
            System.out.println("customInit: Item name has already been set to" + name);
        }
    }
    public void customDestroy() {
        System.out.println("customDestroy: Preparing item '" + name + "' is running out.Taking necessary actions before destruction.");
    }

}
