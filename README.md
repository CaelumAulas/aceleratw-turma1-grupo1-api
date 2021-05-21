# Grupo 1 - Acelera TW

## API do Projeto Carango Bom

Para seu projeto funcionar corretamente é necessário criar a base de dados.

Se quiser alterar a **porta** ou **email** para acesso do pgAdmin, acesse o docker-compose.yml e faça seus ajustes.

Entre na raiz do projeto

`cd aceleratw-turma1-grupo1-api`

e digite

`docker-compose up -d`

Pronto, pode rodar o projeto que ele funcionará corretamente!

#### Para utilizar o pgAdmin acesse `http://localhost:16543` e configure da seguinte forma:

Faça o login de acordo com login e senha configurado:

![Webp net-resizeimage (1)](https://user-images.githubusercontent.com/9592064/119029637-44baa580-b97f-11eb-9858-b9504b243614.png)

Crie um novo **server**

![Webp net-resizeimage (2)](https://user-images.githubusercontent.com/9592064/119029778-759ada80-b97f-11eb-9521-c9792a5e7842.png)

Você passa um nome de acordo com sua preferência

![Webp net-resizeimage (4)](https://user-images.githubusercontent.com/9592064/119029923-a24ef200-b97f-11eb-9845-c894af2dd003.png)

Na aba connection você passa o pgsql-server, que está configurado lá no docker-compose e seus valores.

![Webp net-resizeimage (6)](https://user-images.githubusercontent.com/9592064/119030022-c27eb100-b97f-11eb-852c-1c3eda5fcbe0.png)

Pronto! Você já consegue acessar suas tabelas.

![image](https://user-images.githubusercontent.com/9592064/119031393-6cab0880-b981-11eb-8cb7-64d43cdd617e.png)

#### Deploy para o HEROKU
Commands
* [`git push heroku main `](#git-push-heroku-main)

### Equipe

* [Miguel Soares](https://github.com/miglsoares)

* [Natália Winter](https://github.com/nataliawinter)

* [Stella Martins](https://github.com/stellatw)

* [Vitor Nascimento](https://github.com/Vitor-C-Nascimento)
