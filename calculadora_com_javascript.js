function soma(x, y){
    somaDosValores = Number(x) + Number (y)
    console.log(Number(x) + ' + ' + Number(y) + ' = ' + somaDosValores)}

function subtração(a, b){
    subtracaoDosValores = Number(a) - Number (b)
    console.log(Number(a) + ' - ' + Number(b) + ' = ' + subtracaoDosValores)}

function multiplicação(c, d){
    multiplicacaodosValores = Number(c) * Number (d)
    console.log(Number(c) + ' x ' + Number(d) + ' = ' + multiplicacaodosValores)}

function divisão(z, w){
    divisaoDosValores = Number(z) / Number (w)
    console.log(Number(z) + ' : ' + Number(w) + ' = ' + divisaoDosValores)}

function raiz(e){
    raizDoValor = Math.sqrt(Number(e))
    console.log('Raiz quadrada de ' + Number(e) + ' = ' + raizDoValor)}

function raizCub(k){
    raizCubDoValor = Math.cbrt(Number(k))
    console.log('Raiz cúbica de ' + Number(k) + ' = ' + raizCubDoValor)}

function potencia(f){
    expoente = Number(prompt('Expoente: '))
    potenciaDoValor = Number(f) ** Number(expoente)
    console.log('Potência de ' + Number(f) + ' ao expoente ' + expoente + ' = ' + potenciaDoValor)}

function loga(g){
    logaDoValor = Math.log(Number(g))
    console.log('Logaritmo natural de ' + Number(g) + ' = ' + logaDoValor)}

function loga10(h){
    loga10DoValor = Math.log10(Number(h))
    console.log('Logaritmo de ' + Number(h) + ' na base 10 ' + ' = ' + loga10DoValor)}

function loga2(i){
    loga2DoValor = Math.log10(Number(i))
    console.log('Logaritmo de ' + Number(i) + ' na base 2 ' + ' = ' + loga2DoValor)}

var usuario = prompt('O que vai fazer hoje, somar, subtrair, multiplicar ou dividir? (caso não for nenhuma das opções anteriores, digite \"outros\") ')

switch (usuario){
    case 'somar':
        num1 = prompt('Número: ')
        num2 = prompt('Número: ')
        soma(num1, num2)
        break;
    case 'subtrair':
        num3 = prompt('Número: ')
        num4 = prompt('Número: ')
        subtração(num3, num4)
        break;
    case 'multiplicar':
        num5 = prompt('Número: ')
        num6 = prompt('Número: ')
        multiplicação(num5, num6)
        break;
    case 'dividir':
        num7 = prompt('Número: ')
        num8 = prompt('Número: ')
        divisão(num7, num8)
        break;
    case 'outros':
        var outraOpcao = prompt('Escolha uma opção: raiz quadrada, raiz cúbica, potenciação, logaritmo natural, logaritmo na base 10 ou logaritmo na base 2: ')

if (outraOpcao == 'raiz quadrada'){
        num9 = prompt('Número: ')
        raiz(num9)}
else{
    if (outraOpcao == 'potenciação'){
        num10 = prompt('Número: ')
        potencia(num10)}
    else{
        if (outraOpcao == 'logaritmo natural'){
        num11 = prompt('Número: ')
        loga(num11)}
    else{
        if (outraOpcao == 'logaritmo na base 10'){
        num12 = prompt('Número: ')
        loga10(num12)}
        else{
            if (outraOpcao == 'raiz cúbica'){
                num13 = prompt('Número: ')
                raizCub(num13)}
            else{
                num14 = prompt('Número: ')
                loga2(num14)}}}}}}