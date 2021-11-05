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
  
  Proximo passo, dentro do arquivo na pasta bin abra um prompt de comando (CMD, POWERSHELL) e execute o comando abaixo, para rodar servidor do keycloak na porta :8180
  ```
    .\standalone.bat -D"jboss.socket.binding.port-offset=100"
  ```
  Tutorial para criar conta e configuração do client https://www.keycloak.org/docs/latest/getting_started/index.html#installing-the-server
  
 
  2 - Configuração do Oauth2 resourcerServer no application.properties
  https://github.com/yurileader/assets/blob/master/keycloak/properties.png
 
 
 3 - É necessario adicionar configuração do JwtAuthenticationConverter, para informar o ClaimName para extrair as ROLES, alem de informar o prefixo vazio "" (caso contrario todas as roles seram prefixadas em scope).
 https://github.com/yurileader/assets/blob/master/keycloak/jwtConverter.png
 
  
4 - Apos criar o Realm e Client, Proximo passo sera criar uma ROLE para autorização no client e adicionar ao Service Account (Responsavel por todo tramite de autenticação automatizado)
 https://github.com/yurileader/assets/blob/master/keycloak/client%20service.png
 
 
 
 5 - Agora vamos precisar configurar um mapper (para mapear os atributos para o JWT token)
 https://github.com/yurileader/assets/blob/master/keycloak/create%20mapper.png
 
 Mapeamento do MAPPER TYPE para TOKEN CLAIM NAME
 https://github.com/yurileader/assets/blob/master/keycloak/client%20mapper.png
 
 
# ComoUsar
 
Para Autenticação e obtenção do Token vamos utilizar o POSTMAN, e vamos precisar de algumas informações do keycloak acessando as configurações   http://localhost:8180/auth/realms/DESENVOLVIMENTO/.well-known/openid-configuration 
 
 https://github.com/yurileader/assets/blob/master/keycloak/Anima%C3%A7%C3%A3o.gif
 
