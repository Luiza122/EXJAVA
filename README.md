# Projeto: Classe Veiculo (Locadora)

## Sobre o projeto

Este projeto é uma simulação simples de uma locadora de veículos em Java. Ele calcula o valor do aluguel com base na quantidade de dias, aplica desconto de 10% para alugueis de 7 dias ou mais e também calcula a multa em caso de devolução com atraso.

Foi criado também um conjunto de testes utilizando JUnit para validar o comportamento da classe principal.

## Funcionalidades

- Classe Veiculo com os atributos modelo e valorDiaria
- Método calcularCusto(int dias): retorna o custo total do aluguel
- Método desconto(int dias): aplica desconto de 10% se o aluguel for igual ou superior a 7 dias
- Método calcularMulta(int diasAtraso): calcula multa de 20% por dia de atraso
- Classe Main com o método main para rodar o programa no terminal
- Testes unitários com a classe VeiculoTest, testando situações normais e extremos (dias = 0, valor de diária negativo, etc)

## Como rodar

1. Abrir o projeto em uma IDE como IntelliJ IDEA ou Eclipse
2. Certificar-se de que os arquivos estão dentro da pasta `src`
3. Rodar o arquivo Main.java para executar a simulação
4. Rodar a classe VeiculoTest.java para testar os métodos
5. Adicionar a biblioteca JUnit 5 se necessário 

## Aluna

Luiza Macena Dantas  
RM: 556237  
3º semestre - Engenharia de Software - FIAP

