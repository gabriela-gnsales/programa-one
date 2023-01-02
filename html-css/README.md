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

* listas: comportamento/display **block** → tag ocupa a largura inteira da página; bloqueia o conteúdo da linha
* imagens: comportamento/display **inline** → um elemento inline não deixa alterar, por exemplo, o espaçamento externo e interno dele
* elementos inline e block (display inline-block): ele bloqueia uma largura, mas essa largura é fixa, o tamanho é definido; deixa também mexer na largura e nos espaçamentos interno e externo; o tamanho pode ser ajustado, tanto na largura, quanto na altura

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