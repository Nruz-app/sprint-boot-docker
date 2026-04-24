# 📦 Proyecto Spring Boot + Docker

Este proyecto utiliza Spring Boot junto con Docker para facilitar la ejecución y despliegue de la aplicación.
http://localhost:8080/api/user
GCP
https://spring-boot-app-268724069810.northamerica-northeast1.run.app/api/user

---

## 🚀 Comandos principales

### 🔧 Levantar la aplicación

````bash Levanta y Ejecuta el Proyecto
docker-compose up -d --build

```bash Ver logs en tiempo real
docker-compose logs -f

```bash Detener y eliminar contenedores + volúmenes
docker-compose down -v

```bash Eliminar contenedores + volúmenes + imágenes
docker-compose down -v --rmi all

```bash Limpieza total de Docker
docker system prune -a --volumes


```bash Ver contenedores
docker ps -a

```bash Ver volúmenes
docker volume ls

````

Docker compose -f Docker-compose.prod.yml build

docker push northamerica-northeast1-docker.pkg.dev/spring-boot-docker-app/spring-boot-docker-app/spring-boot-app:latest
