# spring初始化操作：
1. 初始化容器-----加载组件（开天辟地的几个类ConfigurationClassPostProcessor之类的）-----
2. 扫描(.class文件)----------生成了BeanDefinition-------
3. 遍历BeanDefinition--进行merge操作（MergedBeanDefinition）----
4. 验证bd的合法性（是不是单例的，是不是lazy的，是不是有合成方法，是不是合成类，是不是抽象类，是不是FactoryMethod，FactoryBean）

## springboot @EnableAutoConfiguration注解生效机制
1. 在spring.factories里面进行类的配置，譬如mybatis-plus-boot-starter里面的
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
  com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration
2. 然后在springboot启动过程中，会生成一个Map，key是org.springframework.boot.autoconfigure.EnableAutoConfiguration，
value是所有的后续合成的list。
3. @EnableAutoConfiguration注解里面的@Import注解引入了@Import(AutoConfigurationImportSelector.class)
4. AutoConfigurationImportSelector是一个DeferredImportSelector，在spring容器处理这个类的时候
会从第2步的Map里面找到所有配置在spring.factories里的EnableAutoConfiguration，然后分别当成ConfigurationClass进行processImports，
在此过程中，会被put到configurationClasses里面。
5. 最终会在ConfigurationClassPostProcessor#processConfigBeanDefinitions的this.reader.loadBeanDefinitions方法中进行bd的放入

