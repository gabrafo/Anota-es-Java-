## While

**Enquanto** uma condição retornar <span style='color:green'>verdadeira</span>, o bloco de comandos será executado repetidamente até que essa condição retorne <span style='color:red'>falsa</span>. Após a condição ser insatisfeita, o programa sairá do escopo de repetição e seguirá executando sequencialmente os comandos fora do laço.

![Pasted image 20240115173302 1](https://github.com/gabrafo/Anotacoes-Java/assets/113377700/db2fac74-f182-4af6-a13c-795e534bc338)

### Sintaxe

![Pasted image 20240115190135](https://github.com/gabrafo/Anotacoes-Java/assets/113377700/4e7a0859-641c-441f-a38c-d0b30074cbc0)

#### Exemplos de laço

**EXEMPLO 1**:  Joãozinho, em sua ida à feira, lembrou as palavras de sua mãe: "Você só volta pra casa quando estiver com todas as dez maçãs que lhe pedi".  Assim sendo, **enquanto** o menino não comprasse a dezena de frutas, não teria satisfeito a condição de sua progenitora. 

![[Pasted image 20240115190135.png]]
Créditos da ilustração: <a href="https://br.freepik.com/vetores-gratis/feliz-menino-com-maca_4607728.htm#query=desenho%20menino%20ma%C3%A7%C3%A3%20png&position=0&from_view=search&track=ais&uuid=ae898750-9de3-4cca-be69-810e730d2241">Imagem de brgfx</a> no Freepik.

Usando o código acima na linguagem de programação Java, fica sub entendido que Joãozinho irá relembrar que precisa de mais uma unidade de maçã até que tenha dez em sua sacola, para poder retornar para casa e satisfazer o pedido de sua mãe.

Nesse sentido, o exemplo acima é extremamente simples ao apenas delimitar a condição do laço como uma quantidade numérica a ser atingida por uma variável (o número de maçãs, representado por *x* no código). Contudo, a sentença da mãe do garoto poderia ser: "Volte para casa quando tiver comprado uma dezena de maçãs, com nenhuma sendo podre". Assim, Joãozinho teria que comprar dez maçãs **E** garantir que nenhuma delas estivesse avariada. Ainda, a frase poderia pedir que o menino comprasse uma dezena de maçãs **OU** uma dúzia de laranjas, e **enquanto** Joãozinho não estivesse em posse das frutas, deveria comprar mais unidades até satisfazer um dos caminhos ilustrados pela mãe. 

**EXEMPLO 2**: No exemplo anterior, sabíamos quantas execuções seriam feitas até a satisfação da condição do laço. Porém, e caso não soubéssemos? Bom, o laço **While** serve exatamente para esse tipo de situação.

Segue um exemplo prático de um programa simples em Java que só irá parar de somar valores à variável "soma" quando o usuário inserir o número zero na caixa de texto:

![Pasted image 20240115215641](https://github.com/gabrafo/Anotacoes-Java/assets/113377700/ad7709fa-20f2-4650-aedc-852151a5a1a6)

Resumindo, o laço **While** serve para executar um bloco de comandos **enquanto** uma condição pré-estabelecida é <span style='color:green'>verdadeira</span>, sendo uma ferramenta preferencial para casos onde não se sabe com exatidão a quantidade de vezes que o bloco de comandos deve ser executado. Essa sentença, normalmente, é baseada em operadores lógicos como: >, <, >=, <=, !=, == , and (&&), or (||), etc.

## For

O laço **para** visa situações onde, normalmente, já se sabe previamente a quantidade de repetições a ser feita pelo programa, sendo essa a base mais comum para a condição de execução da estrutura. Nesse sentido, no caso de Joãozinho, o laço **para** serviria perfeitamente, já que o menino precisava adquirir exatamente dez maçãs. A grande diferença entre **While** e **For** é justamente essa: o loop **While** tem a premissa de ser executado até que uma condição seja satisfeita, sem que nós necessariamente saibamos de início quantas execuções do bloco de comando isso levaria, enquanto o loop **For** tem uma condição e iteração pré-definidas logo de partida.

### Sintaxe e Exemplos

O loop **For** é caracterizado pela seguinte estrutura a seguir, que será elucidada mais a diante com exemplos práticos:

```
for(início; condição; incremento ou decremento){
bloco de comandos;
}
```

![Pasted image 20240116160759](https://github.com/gabrafo/Anotacoes-Java/assets/113377700/76f88189-d8cd-4d9d-871b-0886a1ba4cca)

**EXEMPLO** em Java:

![Pasted image 20240115215324](https://github.com/gabrafo/Anotacoes-Java/assets/113377700/92d757be-cf1f-4c0e-9638-bddd6b80ee9d)

![Pasted image 20240116161040](https://github.com/gabrafo/Anotacoes-Java/assets/113377700/99a26bfe-e86d-48cf-bb97-43be63c175fb)
Créditos da ilustração: <a href="https://br.freepik.com/vetores-gratis/ilustracao-de-homem-negocios_2606517.htm#query=usu%C3%A1rio&position=4&from_view=search&track=sph&uuid=6e4142ff-be34-41ed-9696-9663cf38617b">Imagem de rawpixel.com</a> no Freepik

Repare que, no exemplo dado a cima, tínhamos conhecimento de exatamente quantas vezes o programa deveria ser executado a partir da variável "vzs" e, por esse motivo, o uso de **For** se evidencia, nessa situação, muito mais adequado do que o uso de um laço **While**, ainda que este segundo também seja possível e válido.

Anotações de: **Gabrafo**.
