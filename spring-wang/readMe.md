# spring初始化操作：
1. 初始化容器-----加载组件（开天辟地的几个类ConfigurationClassPostProcessor之类的）-----
2. 扫描(.class文件)----------生成了BeanDefinition-------
3. 遍历BeanDefinition--进行merge操作（MergedBeanDefinition）----
4. 验证bd的合法性（是不是单例的，是不是lazy的，是不是有合成方法，是不是合成类，是不是抽象类，是不是FactoryMethod，FactoryBean）
