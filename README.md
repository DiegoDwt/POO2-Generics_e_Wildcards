# POO2-Generics_e_Wildcards
06 - Generics e Wildcards

1 - Faça as 4 atividades do final da aula de Generics e Wildcards;
2 - Crie dois exemplos de uso de Wildcards para cada um dos tipos de Wildcards (Upper Bounded Wildcards, Lower Bounded Wildcards e Unbounded Wildcards)

ATIVIDADES

1 - O exemplo abaixo apresenta uma classe que tem como tipo de atributo uma String, utilizando o conceito de Generics crie uma classe que seja
capaz de ser gen ́erica, portanto, armazene qualquer tipo. Crie a classe e o Main, demonstrando no Main pelo menos a utilizacao com três tipos
diferentes (objetos do Java e pelo menos um que vocˆe criou). 
// Classe public class MeuString private String str; public
MeuString(String str) dado = str; public String getStr() return str; 
// Main MeuString d = new MeuString(“Oi”); String x = d.getStr();

2 - Um software j ́a implantado de uma com ́ercio de produtos tem como id de produto o tipo Integer, por ́em com as ampliações e novas vendas do
software alguns novos clientes usam o id como tipo String. Os atributos da classe s ao apresentados abaixo: Produto (id, valor, dataFabricacao,
dataVencimento) Recrie a classe Produto usando Generics permitindo assim que o id possa ser Integer ou String dependendo da utilização em cada um dos clientes,
tamb em crie o Main mostrando as duas utilizações.

3 - Uma classe de Pedido deve conter uma lista de Produtos e ter os métodos de adicionar e mostrar lista de Produtos. Mas os produtos desta lista s ́o podem ser produtos
que herdam caracter ́ısticas da classe ProdutoX (classe que vocˆe ir ́a criar e definir atributos m ́ınimos ao seu crit ́erio). Crie a classe ProdutoX, Pedido e o Main
demonstrando a utilização dos dois m etodos de Pedido.

4 - Crie uma estrutura em uma classe onde ela seja capaz de armazenar uma lista de chave e valor, onde a chave  ́e do tipo String e deve ser  ́unica
dentro da lista. Com isso o m ́etodo de add deve retornar true caso tenha conseguido inserir chave e valor e false caso n ̃ao tenha inserido pois já
existia uma chave igual. Outro m ́etodo necess ́ario  ́e o de busca pela chave, este deve retornar chave e valor. Lembrando que a chave  ́e String, porém
o valor  ́e Generic. Crie tamb ́em o Main testando todas as condicoes. Não use as estrutura de dados já existentes no Java (List e ArrayList são
permitidos usar)
