# E1 Sistema Comercial Sbornia
Exercicio 1 da disciplina Programação de Software Aplicado

A Sbørnia, um país praticamente desconhecido pelas gerações atuais, possui um sistema comercial muito peculiar, conforme descrito a seguir. Todas as compras são realizadas em grandes superfícies comerciais. As compras podem ser realizadas presencialmente ou pela internet (fora do escopo deste exercício), somente por usuários previamente cadastrados. Você foi chamado para realizar o planejamento de um novo sistema de vendas para as lojas, considerando que:

a. As compras presenciais devem continuar utilizando os antigos terminais: um leitor de código de barras e um teclado para informações sobre o usuário e quantidades, todas as informações resultantes são impressas em papel, pois não há monitor. 

b. Um sistema de controle de estoque mantém o cadastro de produtos. Sobre cada produto armazena-se o código do produto, a descrição, a quantidade em estoque, o preço unitário e a sua categoria. Outro sistema mantém o cadastro de usuários, sobre cada usuário é armazenado, entre outras informações, seu identificador único, nome, data de nascimento e número de dependentes. Todas as informações são persistidas em um banco de dados relacional.

c. Ao realizar uma venda é feito o cálculo do valor final, que é dado pelo produto da quantidade vendida e o preço unitário, somado impostos. Os impostos são calculados a partir das seguintes regras:
    i. Sobre produtos alimentícios incide um imposto único de 5%.
    ii. Sobre produtos automotivos incide imposto de 30%.
    iii. Sobre bebidas alcoólicas incide imposto de 100%.
    iv. Para outras categorias incide o imposto base de 17%. É importante salientar que novas faixas de impostos podem ser adicionadas sempre que necessário.
    v. Usuários com mais de 60 anos não pagam imposto, exceto para bebidas alcoólicas.
    vi. Usuários com mais de três dependentes tem um desconto de 50% sobre o valor de imposto calculado, exceto para bebidas alcoólica.

Integrantes: João Vitor Lichston Machado, Larissa Oliveira da Silva e Maria Eduarda da Silveira Schüler