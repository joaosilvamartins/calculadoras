function conta(){
    var opcionar = (document.getElementById("opcionar").value);
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    
    switch (opcionar){
        case 'soma':
        resultado0 = parseInt(num1) + parseInt(num2);
        document.getElementById("resultado0").value = resultado0;
        break;
        case 'subtração':
            resultado0 = parseInt(num1) - parseInt(num2);
            document.getElementById("resultado0").value = resultado0;
            break;
        case 'multiplicação':
                resultado0 = parseInt(num1) * parseInt(num2);
                document.getElementById("resultado0").value = resultado0;
                break;
        default:
            resultado0 = parseInt(num1) / parseInt(num2);
            document.getElementById("resultado0").value = resultado0;
            break;}

    
}

function conta1(){
    var outraOpcao = (document.getElementById("outros").value);
    let num3 = parseFloat(document.getElementById("num3").value);

    if (outraOpcao == 'raiz2'){
        resultado1 = Math.sqrt(num3)
        document.getElementById("resultado1").value = resultado1}
    else{
        if (outraOpcao == 'raiz3'){
            resultado1 = Math.cbrt(num3)
            document.getElementById("resultado1").value = resultado1}
        else{
            if (outraOpcao == 'log'){
                resultado1 = Math.log(num3)
                document.getElementById("resultado1").value = resultado1}
            else{
                if (outraOpcao == 'log10'){
                    resultado1 = Math.log10(num3)
                    document.getElementById("resultado1").value = resultado1}
                else{
                    resultado1 = Math.log2(num3)
                    document.getElementById("resultado1").value = resultado1}}}}
}

function conta2(){
    let num4 = parseInt(document.getElementById("num4").value);
    let expoente = parseInt(document.getElementById("expoente").value);
    potenciaDoValor = parseInt(num4) ** parseInt(expoente)
    document.getElementById("resultado2").value = potenciaDoValor}