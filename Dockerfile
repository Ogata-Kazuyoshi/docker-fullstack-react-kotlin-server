# *****renderにデプロイする際にbuild→該当のJavaファイルの取り出しで２つのベースOSを設定する方法***********
# FROM amazoncorretto:17 AS build
# COPY ./server /home/app
# RUN cd /home/app && ./gradlew build

# FROM amazoncorretto:17-alpine
# COPY --from=build /home/app/build/libs/server-0.0.1-SNAPSHOT.jar /usr/local/lib/server.jar
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","-Dfile.encoding=UTF-8","/usr/local/lib/server.jar"]



# ****事前に./gradlew buildを実施している前提にすると、javaファイルをRenderサーバーで取り出す必要はない
FROM amazoncorretto:17-alpine
COPY ./server/build/libs/server-0.0.1-SNAPSHOT.jar /usr/local/lib/server.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dfile.encoding=UTF-8","/usr/local/lib/server.jar"]
# # libsの後はPKGの最後がくる。今回はcom.kotolin.docker.serverだったためserverになる。エントリーポイントのファイルを見たらPKGがわかる