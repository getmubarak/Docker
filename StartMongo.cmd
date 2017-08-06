#list all network
docker network ls

#create network
docker network create spring_demo_net  

#start
docker run --name spring-demo-mongo --network=spring_demo_net -v /home/ubuntu/mongo-data:/data/db -p 27017:27017 -d mongo  

#get ip address
docker inspect --format='{{.Name}} - {{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' $(docker ps -aq)

#remove network
docker inspect spring_demo_net
docker network disconnect -f spring_demo_net spring-demo-mongo
docker network rm spring_demo_net
