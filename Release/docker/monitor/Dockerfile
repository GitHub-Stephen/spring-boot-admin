FROM dockerhub.quklive.com/open/arm64v8/ubuntu:jdk8

# RUN命令执行创建用户和用户组（命令创建了一个用户newuser设定ID为5000，并指定了用户登录后使用的主目录和shell）
RUN groupadd --gid 5000 ac && useradd --home-dir /home/ac --create-home --uid 5000 --gid 5000 --shell /bin/bash --skel /dev/null ac

RUN ln -snf /usr/share/zoneinfo/$TIME_ZONE /etc/localtime && echo $TIME_ZONE > /etc/timezone

USER ac

#工作目录
WORKDIR /home/ac

#导入编译后的jar包
ADD --chown=ac:ac  bin       /home/ac/Release/bin
ADD --chown=ac:ac  config       /home/ac/Release/config
ADD --chown=ac:ac  jar       /home/ac/Release/jar
ADD --chown=ac:ac  logs      /home/ac/Release/logs

RUN sed -i 's/\r//' /home/ac/Release/bin/startup.sh
RUN chmod +x /home/ac/Release/bin/*.sh

# 暴露端口
EXPOSE 8999

CMD ["/bin/bash","-c", "/home/ac/Release/bin/startup.sh && tail -f /dev/null "]
