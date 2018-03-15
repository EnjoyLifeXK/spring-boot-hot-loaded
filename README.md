# spring-boot-hot-loaded
spring-boot项目热加载，修改部分代码后无需重启项目。

1.导入IDE后使用控制台启动项目(mvn spring-boot:run)，访问: http://localhost:8081/say，页面返回一段测试内容。

2.随意修改路由 /say 中 modelMap 存放的测试内容，按 Ctrl + S后，等待大约 5 秒钟，此时控制台会重新编译加载修改的内容，然后刷新页面，会立即看到新的测试内容变化。
