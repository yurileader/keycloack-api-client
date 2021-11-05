<h1 align="center">Keycloack-api-client</h1>

## Teste de implementação de segurança da api client utilizando Oauth2 + Keycloak

<h4 align="center">Conteúdos</h4>
<p align="center">
 <a href="#roadmap">Instalação</a> • 
 <a href="#comousar">Como usar</a> • 
 <a href="#contribuicao">Pre Requisitos</a> • 
 <a href="#autor">Tecnologias</a>
</p>

## 🚀 Instalando <Keyloack>
  
  1 - Primeiro precisamos baixar o keycloack no formato zip, https://www.keycloak.org/downloads e descompactar o arquivo.
 
 ![image](https://user-images.githubusercontent.com/55317378/140446445-9e3a002e-0299-4c08-97a5-cf8268a00609.png)

  
  Proximo passo, dentro do arquivo na pasta bin abra um prompt de comando (CMD, POWERSHELL) e execute o comando abaixo, para rodar servidor do keycloak na porta :8180
  ```
    .\standalone.bat -D"jboss.socket.binding.port-offset=100"
  ```
  Tutorial para criar conta e configuração do client https://www.keycloak.org/docs/latest/getting_started/index.html#installing-the-server
  
 
  2 - Configuração do Oauth2 resourcerServer no application.properties
  ![image](https://user-images.githubusercontent.com/55317378/140446415-ed99fc4f-26b2-429c-835e-1bd5cfd57014.png)
 
 
 3 - É necessario adicionar configuração do JwtAuthenticationConverter, para informar o ClaimName para extrair as ROLES, alem de informar o prefixo vazio "" (caso contrario todas as roles seram prefixadas em scope).
 ![image](https://user-images.githubusercontent.com/55317378/140446378-7a995f01-1ae2-449c-b37d-318aecf7a520.png)
 
  
4 - Apos criar o Realm e Client, Proximo passo sera criar uma ROLE para autorização no client e adicionar ao Service Account (Responsavel por todo tramite de autenticação automatizado)
 ![image](https://user-images.githubusercontent.com/55317378/140446341-b2b30b16-31ed-4de4-b786-4d0d2b73ee38.png)
 
 
 
 5 - Agora vamos precisar configurar um mapper (para mapear os atributos para o JWT token)
 ![image](https://user-images.githubusercontent.com/55317378/140446790-4fc7ba81-29a9-4c3f-b9de-91d6a88e84f9.png)

 
 Mapeamento do MAPPER TYPE para TOKEN CLAIM NAME
 ![image](https://user-images.githubusercontent.com/55317378/140446819-15fcd9f0-c6fc-484d-8419-60b19b0dc326.png)

 
# ComoUsar
 
Para Autenticação e obtenção do Token vamos utilizar o POSTMAN, e vamos precisar de algumas informações do keycloak acessando as configurações   http://localhost:8180/auth/realms/DESENVOLVIMENTO/.well-known/openid-configuration 
 
 ![Autorizando Postman](https://github.com/yurileader/assets/blob/master/keycloak/Anima%C3%A7%C3%A3o.gif)
 
