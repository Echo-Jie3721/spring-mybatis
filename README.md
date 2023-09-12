# 项目过程中出现的错误记录

## html中有关${}红色下划线的问题
<p>解决办法</p>
<p>在 《!DOCTYPE html》 下面加上一句话 《!--suppress ALL--》
</p>

## 数据库的名字写错
<p>@localhost不是数据库的名字</p>

## 使用yml文件配置
<p>在输入名称之后：后面要加一个空格</p>

## 出现依赖循环问题
 是因为 pagehelper-spring-boot-starter版本过低导致
 
## yml文件中com.mysql.cj.jdbc.Driver爆红问题
<p>是因为mysql-connector-java版本低于6导致的3</p>

## select语句的参数 resultType和parameterType

# 数据库语句
-- auto-generated definition
create table user
(
id    int auto_increment
primary key,
name  varchar(30)  null,
pwd   varchar(11)  null,
perms varchar(100) null
);
# 具体封装层请看阿里巴巴Java开发手册

# 前端用的是 https://semantic-ui.com/
