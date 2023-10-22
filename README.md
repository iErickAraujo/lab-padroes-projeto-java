# lab-padroes-projeto-java

Repositório para armazenar os desafios do curso de Java Avançado da DIO.

[Desafio Padrões de Projetos na Prática com Java] - Projeto desenvolvido como parte do desafio Padrões de Projetos na Prática com Java puro, padrões utilizados Singleton,Strategy e Facade.

[Observações] - Projeto para fins de aprendizado.


```mermaid
classDiagram
    Facede --|> CrmService
    Facede --|> CepApi
    Facede : +migrarCliente(nome, cep)
    SingletonEager -- SingletonEager : -instancia
    SingletonEager : +getInstancia()
    SingletonLazy -- SingletonLazy : -instancia
    SingletonLazy : +getInstancia()
    SingletonLazyHolder -- SingletonLazyHolder_InstanceHolder : InstanceHolder
    SingletonLazyHolder : -instancia
    SingletonLazyHolder : +getInstancia()
    Comportamento <|-- ComportamentoAgressivo
    Comportamento <|-- ComportamentoDefensivo
    Comportamento <|-- ComportamentoNormal
    ComportamentoAgressivo : +mover()
    ComportamentoDefensivo : +mover()
    ComportamentoNormal : +mover()
    Robo -- Comportamento : -comportamento
    Robo : +setComportamento(comportamento)
    Robo : +mover()
    CrmService -- CrmService : -CrmService()
    CrmService : +gravarCliente(nome, cep, cidade, estado)
    CepApi -- CepApi : -CepApi()
    CepApi : +getInstancia()
    CepApi : +recuperarCidade(cep)
    CepApi : +recuperarEstado(cep)
    Test --|> Facede : +main(args)
```
