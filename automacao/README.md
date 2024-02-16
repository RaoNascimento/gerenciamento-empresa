# Microserviço da Compensacao Carbono Retry - Automação

Projeto dos testes de componente do Microserviço da Compensacao Carbono Retry 


- bcp-srv-oferta-contextual
- Microserviço da Compensacao Carbono Retry

Execute `mvn spring-boot:run -Dspring-boot.run.profiles=default,TC
` na raiz de cada projeto.

Na raíz do projeto de automação, execute `mvn test -Dtest=regressivo.**` para iniciar os testes.

Configurar um Run/Debug Configuration* a partir da classe ApplicationRunnerTest.java

* Configuração depende da IDE que está utilizando. No caso, Run/Debug Configuration é do Intellij.

Os testes de componente faz todas as requisições via Oferta Contextual que por sua vez faz a orquestração para o micro-serviço a ser testado

![imagem arquitetura](./images/arquitetura.png)

