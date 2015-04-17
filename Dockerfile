FROM java:7
ADD target/sb-simple-0.1.0.war /data/sb-simple-0.1.0.war
CMD java -jar -Djava.security.egd=file:/dev/./urandom /data/sb-simple-0.1.0.war