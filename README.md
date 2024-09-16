# dio-trilha-java-basico

## O Projeto - faz uso do Docker e dispensa a instalação do JDK. 

 1º step - clonar o projeto<br />
 2º step - acessar o projeto através do terminal e rodar os seguintes comandos:

### First: subir o projeto no docker
        docker-compose up --build
### Second: entrar no bash do container e compilar os arquivos .class no diretório bin.
        docker-compose run --rm javacompile sh
        javac -d bin src/*.java
### Third: rodar e verificar a saida
        docker-compose run --rm runjava java -cp /app/bin "App"