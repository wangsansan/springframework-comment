# spring初始化操作：
1. 初始化容器-----加载组件（开天辟地的几个类ConfigurationClassPostProcessor之类的）-----扫描(.java文件)----------生成了BeanDefinition
-------遍历BeanDefinition--进行merge操作----验证bd的合法性（是不是单例的，是不是lazy的，是不是有合成方法，是不是抽象类，是不是FactoryMethod，FactoryBean）