简单的ssm整合框架

抽取baseDao 和 baseService
用户基本的增删改查 公用实现

工程爆红要看错误来调试
1.新建文件夹，写入名称，（工程名）。保存并打开，复制ssm框架到文件内，打开pom文件，修改com.后面的名称，为组织名称，修改项目名称，需要改3处。
2.新建数据库ssmq，运行自带的sql文件。
3.复制文件到对应的工作空间中，打开eclipse，inport----》maven的工程，选择复制到工作空间的那个文件，完成。
4.打开data的配置文件，修改数据库连接密码。进行环境配置，配置jdk，配置tomcat。
5.rua as maven install，没有错误后，开始修改个个配置文件中（spring，springmvc等）的com.后面的名称为组织名，修改所有pakeg包中com.后面的包名为组织名称，修改model中mapping中xml里com.后面的名称为组织名称。
6.尝试运行工程，无报错的话，在页面中访问    http://127.0.0.1:8080/ios/user/list.action，弹出信息，说明已经ok！