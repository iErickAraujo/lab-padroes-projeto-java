# lab-padroes-projeto-java

Repositório para armazenar os desafios do curso de Java Avançado da DIO.

[Desafio Padrões de Projetos na Prática com Java] - Projeto desenvolvido como parte do desafio Padrões de Projetos na Prática com Java puro, padrões utilizados Singleton,Strategy e Facade.

[Observações] - Projeto para fins de aprendizado.


% Class diagram

class Facede {
 # Migra um cliente para um novo endereço
 +migrarCliente(nome: String, cep: String)
}

class CrmService {
 # Grava um cliente no sistema CRM
 +gravarCliente(nome: String, cep: String, cidade: String, estado: String)
}

class CepApi {
 # Recupera a cidade e o estado a partir de um CEP
 +recuperarCidade(cep: String): String
 +recuperarEstado(cep: String): String
}

class Comportamento {
 # Move o robô
 +mover()
}

class ComportamentoAgressivo {
 # Move o robô de forma agressiva
 +mover()
}

class ComportamentoDefensivo {
 # Move o robô de forma defensiva
 +mover()
}

class ComportamentoNormal {
 # Move o robô de forma normal
 +mover()
}

class Robo {
 # Define o comportamento do robô
 +setComportamento(comportamento: Comportamento)
 # Move o robô
 +mover()
}

class Test {
 # Testa o sistema
 +main(args: String[])
}

Facede --|> CrmService
Facede --|> CepApi

Comportamento <|-- ComportamentoAgressivo
Comportamento <|-- ComportamentoDefensivo
Comportamento <|-- ComportamentoNormal

Robo -|> Comportamento

Test --|> Facede
