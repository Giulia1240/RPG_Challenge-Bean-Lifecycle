package acc.br.bean.life.cycle.config;


import acc.br.bean.life.cycle.beans.Weapon;
import acc.br.bean.life.cycle.processor.MagicBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeaponConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Weapon weapon() {
        Weapon wp = new Weapon("Excalibur");
        return wp;
    }

    @Bean(name = "magicWeaponPostProcessor")
    public MagicBeanPostProcessor magicBeanPostProcessorForWeapon() {
        return new MagicBeanPostProcessor();
    }

}
