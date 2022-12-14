# HTML e CSS

***

### HTML

##### As tags são semânticas e para cada uma delas temos um significado e um resultado diferente.
As informações que estamos passando para o navegador ficam no **head** e as informações que queremos exibir na nossa página (o conteúdo) ficam no **body**.

* `<!DOCTYPE html>`: informa para o navegador qual versão do HTML está sendo usada
* `<html> </html>`: marca o conteúdo a ser renderizado no navegador; informações de renderização da página
    > Dentro desta tag, pode-se definir a linguagem da página, através da propriedade lang → `<html lang="pt-br">`
* `<meta charset="UTF-8">`: tag usada para que todos os usuários vejam o site com o dicionário correto; passar as informações do encoding da página para o navegador, através da tag `<meta>` e da propriedade `charset`
    > É preciso apontar para o navegador que está sendo usado um dicionário com acentos e cedilha, sinais gráficos comuns na língua portuguesa.
* `<title> </title>`: definir o título de uma página
* `<head> </head>`: separar as informações que estão sendo passadas para o navegador
* `<body> </body>`: separar o conteúdo da página
* `<strong> </strong>`: negrito (marcação de destaque)
* `<em> </em>`: itálico (marcação de ênfase)
* `<label> </label>`: tag usada para fazer um par com um `<input>`, para ter um título para a entrada de dados; etiqueta para a entrada de dados
    * Para conectar um input com o seu label tem-se que colocar um id para o input e associá-lo ao atributo for do label.
* `name`: propriedade de um input do tipo radio necessária para que todos os inputs radios façam parte do mesmo grupo
    * A propriedade name só pode ser "preenchida" uma única vez, por isso que, quando é selecionado um dos itens, ele desmarca o outro, mantendo somente 1 selecionado.
* `<section> </section>`: usada para um bloco onde o conteúdo tenha o mesmo significado / sentido

> Quando se refere a um estilo, usa-se CLASSE.
> Quando se refere a um comportamento, usa-se IDENTIFICADOR (ID).

> Tanto o `float: left` quanto o `float: right` servem para que o elemento se destaque na tela, deixe de ocupar o espaço em que estava, para que os outros elementos possam se posicionar ao redor dele.
> A propriedade `clear` é utilizada para limpar o `float`.

**Alguns tipos de inputs para celular:** email, tel, number, password, date, datetime, month e search

* Não permitir que um campo não seja preenchido → através do atributo `required`
* Exibir uma sugestão de preenchimento para os campos → através do atributo `placeholder`
* Deixar uma opção marcada por padrão nos input radio e checkbox → através do atributo `checked`
* Estruturar melhor o código → com `fieldset` e `legend`
* Adicionar uma alternativa à imagem → descrevendo-a com o atributo `alt`
* Realizar transições nos nossos elementos → propriedade CSS `transition`
* Modificar o estilo do ponteiro do mouse, quando passar por cima de determinado elemento → através da propriedade CSS `cursor`
* Realizar transformações nos elementos, como aumentar proporcionalmente a escala de determinado elemento ou rotacioná-lo → através da propriedade CSS `transform`
* As tags `<thead>`, `<tbody>` e `<tfoot>` ajudam a deixar o conteúdo da tabela mais bem dividido e mais semântico.

**Tabela HTML**
* A tag `table` representa a tabela
* A tag `tr` representa a linha da tabela
* A tag `td` representa a célula da tabela
* A tag `thead` representa o cabeçalho da tabela
* A tag `tbody` representa o corpo da tabela
* A tag `th` representa a célula do cabeçalho da tabela
* A tag `tfoot` representa o rodapé da tabela

***

### CSS

Existem 3 formas de configur o CSS:
* CSS inline → adiciona a propriedade do CSS na linha onde tem-se a tag
* Incluindo a estilização em cada tag na propriedade style, no mesmo arquivo html
* Através de um arquivo externo
    > Geralmente, o arquivo que contém os estilos é chamado de `style.css`.
    > Só com um arquivo externo e fazendo referência a esse arquivo, pode-se usar o mesmo CSS em páginas diferentes.

É necessário referenciar o arquivo style.css no head do index.html → `<link rel="stylesheet" href="style.css">`

**Estilo em cascata do CSS:** tudo que é adicionado no elemento pai reflete nos elementos filhos.
> Como é uma folha de estilos em cascata, a cascata vai descendo, o que é feito no elemento pai reflete para o elemento filho.

O tamanho da fonte padrão no navegador é medido em pixels. Ocasionalmente **o navegador adiciona o tamanho da fonte inicial como 16 pixels**.

* comportamento/display **block** → tag ocupa a largura inteira da página; bloqueia o conteúdo da linha
    * ex: listas
* comportamento/display **inline** → um elemento inline não deixa alterar, por exemplo, o espaçamento externo e interno dele
    * ex: imagens, labels
* elementos **inline e block (display inline-block)**: ele bloqueia uma largura, mas essa largura é fixa, o tamanho é definido; deixa também mexer na largura e nos espaçamentos interno e externo; o tamanho pode ser ajustado, tanto na largura, quanto na altura
    * ex: input

#### Posiocionamento dos elementos
* **static:**
* **absolute:** usado para alterar a posicão do ponto inicial do elemento; posicionar o elemento em qualquer lugar da página
* **relative:** usado para deslocar o elemento, mantendo seu ponto inicial fixo

> Melhor técnica para alinhar uma div ao centro → usar o cálculo da margin automático

> Comportamento do elemento quando é adicionado espaçamento interno `padding` → o elemento aumenta sua largura, já que o tamanho dele ficou maior, a não ser que a propriedade `box-sizing` tenha o valor `border-box`.

#### Pseudo-classes CSS
* **hover:** usado quando o usuário passa o cursor sobre o elemento
* **active:** usado quando um elemento está sendo ativado pelo usuário

> Utilizando o `hover` o comportamento do mouse por cima do elemento é mapeado, podendo ser usado para destacar visualmente o elemento em questão.

> Adicionar uma imagem de fundo em um elemento → com o valor `url` no `background` do elemento

#### Seletores avançados
* Seletor `>`, para acessar os filhos de determinado elemento. Por exemplo, para acessar todos os `p` dentro de `main`: 
    ```
    main > p {
        background: red; 
    }
    ```
* Seletor `+` para acessar o primeiro irmão de determinado elemento. Por exemplo, para acessar o primeiro `p` após um `img`:
    ```
    img + p { 
        background: blue;
    }
    ```
* Seletor`~` para acessar todos os irmãos de determinado elemento. Por exemplo, para acessar todos os `p` após um `img`:
    ```
    img ~ p {
        background: yellow
    }
    ```
* Seletor `not` para acessar os elementos, exceto algum. Por exemplo, para acessar todos os `p` dentro de `main`, exceto o `p` que tem `id missao`:
    ```
    .principal p:not(#missao) {
        background: orange;
    }
    ```

#### Medidas proporcionais
A propriedade `calc()` é usada para fazer contas com CSS
* ex: deixar um elemento de 100% de largura com o equivalente a um terço do elemento pai, menos 10px → `width: calc( 33% - 10px )`

**Caracteres Unicode:** https://unicode-table.com/en/

#### Cores
* **Hexadecimal:** dicionário numérico adicionando as letras `abcdef` → `0123456789ABDCEF` → coloca # e marca 6 elementos (os 2 primeiros para marcar o vermelho, os 2 segundos para marcar o verde e os 2 últimos para marcar o azul)
    * 0: ausência
    * F: máximo
    > **ex:**
    > branco: `#FFFFFF`
    > preto (ausência de todas as cores): `#000000`
    > vermelho: `#FF0000`
* **RGB:** Red Green Blue → 0 a 255 → tem 256 níveis de representação de cada cor
    * 0: ausência
    * 255: máximo
    > **ex:**
    > branco: `RGB(255, 255, 255)`
    > preto (ausência de todas as cores): `RGB(0, 0, 0)`
    > vermelho: `RGB(255, 0, 0)`

***

**Atalhos VS Code :** 
* Envelopamento com abreviatura → CTRL + SHIFT + P → "Emment: Quebra Linha com Abreviação" / "Emment: Wrap with Abbreviation" 