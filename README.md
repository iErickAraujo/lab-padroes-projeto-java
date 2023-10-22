# lab-padroes-projeto-java

Repositório para armazenar os desafios do curso de Java Avançado da DIO.

[Desafio Padrões de Projetos na Prática com Java] - Projeto desenvolvido como parte do desafio Padrões de Projetos na Prática com Java puro, padrões utilizados Singleton,Strategy e Facade.

[Observações] - Projeto para fins de aprendizado.

```mermaid
classDiagram
    class Facede {
        +migrarCliente(nome: String, cep: String)
    }
    class SingletonEager {
        -instancia: SingletonEager
        +getInstancia(): SingletonEager
    }
    class SingletonLazy {
        -instancia: SingletonLazy
        +getInstancia(): SingletonLazy
    }
    class SingletonLazyHolder {
        +InstanceHolder
        -instancia: SingletonLazyHolder
        +getInstancia(): SingletonLazyHolder
    }
    class Comportamento {
        +mover()
    }
    class ComportamentoAgressivo {
        +mover()
    }
    class ComportamentoDefensivo {
        +mover()
    }
    class ComportamentoNormal {
        +mover()
    }
    class Robo {
        -comportamento: Comportamento
        +setComportamento(comportamento: Comportamento)
        +mover()
    }
    class CrmService {
        -CrmService()
        +gravarCliente(nome: String, cep: String, cidade: String, estado: String)
    }
    class CepApi {
        -instancia: CepApi
        -CepApi()
        +getInstancia(): CepApi
        +recuperarCidade(cep: String): String
        +recuperarEstado(cep: String): String
    }
    class Test {
        +main(args: String[])
    }

    Facede -- CrmService
    Facede -- CepApi
    Facede : +migrarCliente(nome: String, cep: String)
    SingletonEager -- SingletonEager : -instancia
    SingletonEager : +getInstancia(): SingletonEager
    SingletonLazy -- SingletonLazy : -instancia
    SingletonLazy : +getInstancia(): SingletonLazy
    SingletonLazyHolder +-- SingletonLazyHolder$InstanceHolder : InstanceHolder
    SingletonLazyHolder : -instancia
    SingletonLazyHolder : +getInstancia(): SingletonLazyHolder
    Comportamento <|-- ComportamentoAgressivo
    Comportamento <|-- ComportamentoDefensivo
    Comportamento <|-- ComportamentoNormal
    ComportamentoAgressivo : +mover()
    ComportamentoDefensivo : +mover()
    ComportamentoNormal : +mover()
    Robo - Comportamento : -comportamento
    Robo : +setComportamento(comportamento: Comportamento)
    Robo : +mover()
    CrmService -- CrmService : -CrmService()
    CrmService : +gravarCliente(nome: String, cep: String, cidade: String, estado: String)
    CepApi -- CepApi : -CepApi()
    CepApi : +getInstancia(): CepApi
    CepApi : +recuperarCidade(cep: String): String
    CepApi : +recuperarEstado(cep: String): String
    Test - Facede : +main(args: String[])```
