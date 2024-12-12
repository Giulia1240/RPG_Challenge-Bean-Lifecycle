package acc.br.bean.life.cycle.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Weapon implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean, BeanFactoryAware {
    private String name;

    public Weapon(String name) {
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
        if (name.equals(null) || name.isEmpty()) {
            System.out.println("customInit: The weapon name was not specified, so it was assigned to the default value 'Default Weapon'.");
            name = "DefaultWeapon";
        } else {
            System.out.println("customInit: Weapon name has already been set to " + name);
        }
    }
    public void customDestroy() {
        System.out.println("customDestroy: Preparing weapon '" + name + "' for destruction. Releasing resources...");
    }

    @PostConstruct
    public void init() {
        System.out.println("6. @PostConstruct: " + getName() + " is preparing for action.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("10. @PreDestroy: " + getName() + " is saying goodbye and preparing to rest.");
    }
}
