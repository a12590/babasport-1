# babasport 
新巴巴运动网（10天）  
这是一个 基于maven的ssm整合项目。  
开发环境：  
	 - IntelliJ IDEA 15.0.1  
	 - JDK 1.8.0——05 
	 - tomcat 7.0.69



[TOC]


##day01 系统框架搭建
1. 商品列表页的优化方案：  
 - 1. 整合Lucene+Solr 建立索引，进行全文检索  
 - 2. 页面缓存（Os）  
 - 3. 分布式缓存（全网站）  
 - 4. 高并发（80%）  

2. 商品详情页（单品页）：  
 - 页面静态化技术 Freemarker

## day02 品牌模块开发
1. 查询： 条件+分页
2. 添加：异步上传图片，图片放在另一台服务器
3. 修改：信息回显
4. 删除 删除多个（查询列表页面）
	 不用<hidden />标签 


 - get请求中文乱码：
	 - 1. 该服务器配置文件（tomcat8之后 就不用担心此问题了，因为）
	 - 2. 配置过滤器，将请求重编码: new String("".getByte("iso-8859-1"), utf8);  

 - 异步上传技术：  
```UniformInterfaceException：returned a response status of 409 Conflict```