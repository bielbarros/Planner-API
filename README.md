# Planner API
O Planner API é uma aplicação desenvolvida em Java com Spring Boot que permite o gerenciamento de viagens, atividades, participantes e links associados a uma viagem.

Esta API fornece endpoints para criar e gerenciar viagens, adicionar e visualizar atividades, convidar participantes, e gerenciar links.

## Funcionalidades
### Viagens

* Criar Viagem: POST /trips

Cria uma nova viagem e convida os participantes especificados.
* Detalhes da Viagem: GET /trips/{id}

Obtém os detalhes de uma viagem específica pelo ID.

* Atualizar Viagem: PUT /trips/{id}

Atualiza os detalhes de uma viagem existente.
* Confirmar Viagem: GET /trips/{id}/confirm

Marca uma viagem como confirmada e envia e-mails de confirmação para os participantes.

## Atividades
* Registrar Atividade: POST /trips/{id}/activities

Adiciona uma nova atividade a uma viagem específica.
* Listar Atividades: GET /trips/{id}/activities

Obtém uma lista de todas as atividades associadas a uma viagem.
## Participantes

* Convidar Participante: POST /trips/{id}/invite

Adiciona um novo participante a uma viagem e envia um e-mail de convite, se a viagem estiver confirmada.
* Listar Participantes: GET /trips/{id}/participants

Obtém uma lista de todos os participantes de uma viagem.
## Links
* Registrar Link: POST /trips/{id}/links

Adiciona um link associado a uma viagem específica.
* Listar Links: GET /trips/{id}/links

Obtém uma lista de todos os links associados a uma viagem.

## Tecnologias Utilizadas
* Spring Boot: Framework para desenvolvimento de aplicações Java.

* JPA/Hibernate: Para persistência e gerenciamento de dados.

### Contribuição
Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma "issue" ou enviar um "pull request".

### Contato
Para mais informações ou perguntas, você pode entrar em contato comigo através das seguintes plataformas:

Email: gabrielbarrosg11@gmail.com

LinkedIn: https://www.linkedin.com/in/gabriel-sbarros/

GitHub: https://github.com/bielbarros/

### Licença
Este projeto está licenciado sob a Licença MIT.