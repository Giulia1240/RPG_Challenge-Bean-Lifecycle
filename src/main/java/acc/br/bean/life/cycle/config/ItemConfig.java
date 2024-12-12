package acc.br.bean.life.cycle.config;

import acc.br.bean.life.cycle.beans.Item;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemConfig {
    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Item item() {
        Item item = new Item("Health Potion");
        return item;
    }

    @Bean(name = "magicItemPostProcessor")
    public MagicBeanPostProcessor magicBeanPostProcessorForItems() {
        return new MagicBeanPostProcessor();
    }

}
