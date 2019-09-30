./mvnw clean package -DskipTests
mkdir -p target/dependency && (cd target/dependency || exit; jar -xf ../*.jar)
docker build -t dhubau/fednot-backend:latest .