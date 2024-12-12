package acc.br.bean.life.cycle.processor;

import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.beans.Weapon;
import org.springframework.beans.factory.config.BeanPostProcessor;

import acc.br.bean.life.cycle.beans.Character;

public class MagicBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("5. BeanPostProcessor: Adding a touch of magic to " + ((Character) bean).getName());
        }
        if (bean instanceof Weapon) {
            System.out.println("6. BeanPostProcessor: Enhance power and resistance to " + ((Weapon) bean).getName());
        }
        if (bean instanceof Item) {
            System.out.println("7. BeanPostProcessor: Increasing the amount of items for " + ((Item) bean).getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("9. BeanPostProcessor: Magic continues for " + ((Character) bean).getName());
        }
        if (bean instanceof Weapon) {
            System.out.println("10. BeanPostProcessor: The Power stronger continues for " + ((Weapon) bean).getName());
        }
        if (bean instanceof Item) {
            System.out.println("11. BeanPostProcessor: Autohealing power using the " + ((Item) bean).getName());
        }
        return bean;
    }
}
