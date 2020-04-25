# Tool_Plugin_MyBatis_Generator_learn_demo
MyBatis Generator使用练习

## 结构
- src/main/java：<br>
  com/marvin/demo/dao：生成的dao对象<br>
  com/marvin/demo/entity：生成的实体对象<br>
  
  

- src/main/resources：<br>
  mybatis/mapper：生成的映射文件<br>
  mybatis/mybatis-generator：插件的配置信息在这里<br>


## 操作步骤
1、src/main/resources/mybatis/mybatis-generator/mybatisGeneratorinit.properties<br>
配置本地的DB连接依赖 jar包的位置<br>
配置正确的数据库连接信息<br>

2、src/main/resources/mybatis/mybatis-generator/generatorConfig.xml<br>
配置\<table tableName="users" domainObjectName="UsersBean"\>，设置DB表名和实体类名，一个\<table\>对应一张表


