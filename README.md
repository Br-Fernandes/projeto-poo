# projeto-poo

Para conseguir fazer a aplicação rodar, é necessário o SGBD PostgreSQL instalado na máquina. Recomendo seguir as instruções do vídeo abaixo:

https://www.youtube.com/watch?v=FoqXi0wpX4c&t=122s

Após terminar os passos de instalação, dentro do CMD (Prompt de Comando) é preciso navegar  até o diretório bin do PostgreSQL normalmente localizado no caminho:
C:\Program Files\PostgreSQL\14\bin

Dentro deste diretório, digite o comando  [ psql -U postgres ] informe a senha criada anteriormente para este usuario (caso tenha sido criada uma senha)

Agora poderá ser feito a criação do banco de dados, digite o comando [ CREATE DATABASE nucleo_estudantil; ] 

Então é necessário a criação do usuário que a aplicação irá usar para se conectar e manipular o banco de dados, digite o comando
[ CREATE ROLE secretaria WITH SUPERUSER LOGIN PASSWORD 'admin' CREATEROLE CREATEDB; ]

Caso ocorra tudo certo, a aplicação irá rodar e os dados serão armazendos no banco de dados corretamente.
