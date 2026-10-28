# Sistema de Controle de Produtos — Java MVC

Aplicação desktop desenvolvida em **Java**, utilizando a biblioteca **AWT** para a interface gráfica e o padrão arquitetural **MVC (Model-View-Controller)**.

O projeto foi desenvolvido durante meus estudos em Ciência da Computação, com o objetivo de aplicar conceitos de Programação Orientada a Objetos, organização de código e desenvolvimento de aplicações Java.

## Funcionalidades

- Cadastro de produtos com nome, preço e quantidade.
- Validação dos dados inseridos pelo usuário.
- Listagem dos produtos cadastrados.
- Tratamento de erros em entradas numéricas.
- Interface gráfica desenvolvida com Java AWT.
- Armazenamento dos produtos em memória utilizando ArrayList.

## Tecnologias utilizadas

- **Java** — linguagem de programação.
- **AWT** — construção da interface gráfica.
- **MVC** — separação das responsabilidades da aplicação.
- **ArrayList** — armazenamento dos produtos.
- **Eclipse IDE** — ambiente de desenvolvimento.

## Arquitetura MVC

O projeto está organizado em três camadas:

**Model — Produto.java**

Representa os dados do produto, incluindo nome, preço e quantidade. Utiliza encapsulamento, construtores, getters e setters.

**View — TelaProduto.java**

Responsável pela interface gráfica. Contém campos de entrada, botões e uma área para exibição das informações.

**Controller — ProdutoController.java**

Responsável por receber os eventos da interface, validar os dados, cadastrar produtos e atualizar a listagem.

## Estrutura do projeto

```text
src/
├── modelo/
│   └── Produto.java
├── visao/
│   └── TelaProduto.java
├── controle/
│   └── ProdutoController.java
├── principal/
│   └── Principal.java
└── module-info.java
```

## Como executar

1. Instale o Java JDK.
2. Baixe ou clone este repositório.
3. Importe o projeto no Eclipse IDE.
4. Execute a classe `Principal.java`.
5. Utilize a interface para cadastrar e listar produtos.

## Armazenamento

Os produtos são armazenados temporariamente em memória. Os dados são perdidos quando a aplicação é encerrada, pois esta versão não utiliza banco de dados.

## Próximas melhorias

- Implementar exclusão e edição de produtos.
- Adicionar pesquisa de produtos por nome.
- Integrar um banco de dados MySQL.
- Melhorar a interface gráfica.

## Autor

**Lucas Rocha**

Estudante de Ciência da Computação.

[GitHub](https://github.com/LucasRocha001) | [LinkedIn](https://www.linkedin.com/in/lucasrocha001)
