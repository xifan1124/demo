# 拉取最新的源码
git pull

# 执行打包
mvn clean package

# 启动项目
java -jar target/demo-0.0.1-SNAPSHOT.war &

# 启动完成，输出提示信息
echo "demo项目部署完毕，Enjoy！"