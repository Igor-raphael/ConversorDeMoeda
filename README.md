# Conversor de Moeda - Java - Back end
O Conversor de Moeda é um desafio oferecido pela Alura em parceria com a Oracle, com o objetivo de desenvolver uma aplicação Java de conversão de moedas com interação textual via console.

## Funcionalidades

O Challenge Conversor de Moeda oferece as seguintes funcionalidades:

1. Conversão de moeda de uma moeda para outra.
2. Liberdade muito maior para converter uma moeda para outra, de qualquer país. 
3. Atualização dinâmica das taxas de conversão por meio de uma API, garantindo dados precisos e em tempo real.

## Instalação e Uso

1. Certifique-se de ter o Java instalado em sua máquina.
2. Clone este repositório para o seu computador.
3. Abra o projeto em sua IDE favorita.
4. Execute a aplicação.

## Demonstração




## Consumindo a API

O Conversor de Moeda consome uma API externa para obter as taxas de conversão de moeda em tempo real. Para isso, utiliza a biblioteca padrão do Java `java.net.http.HttpClient` para fazer requisições HTTP à API de conversão de moeda.

A URI da API é construída dinamicamente de acordo com as moedas de origem e destino selecionadas pelo usuário. Após fazer a requisição, o JSON de resposta é parseado utilizando a biblioteca Gson para extrair o campo "conversion_rate", que representa a taxa de conversão entre as duas moedas especificadas.

O valor da conversão é então calculado multiplicando-se a quantidade da moeda de origem pelo valor da taxa de conversão.


## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
