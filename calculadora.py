import math
import numpy

def soma(x):
    r = 0
    for i in range(x):
        n = int(input('Digite o {}° número: '.format(i+1)))
        r += n
    print('Resultado: {}'.format(r))

def sub(x):
    n1 = int(input('Digite o 1° número: '))
    r = n1
    for i in range(x-1):
        n2 = int(input('Digite o {}° número: '.format(i + 2)))
        r -= n2
    print('Resultado: {}'.format(r))

def mult(x):
    n1 = int(input('Digite o 1° número: '))
    r = n1
    for i in range(x-1):
        n2 = int(input('Digite o {}° número: '.format(i + 2)))
        r *= n2
    print('Resultado: {}'.format(r))

def div(x):
    n1 = int(input('Digite o 1° número: '))
    r = n1
    for i in range(x - 1):
        n2 = int(input('Digite o {}° número: '.format(i + 2)))
        r /= n2
    print('Resultado: {}'.format(r))

def raiz(x):
    r = math.sqrt(x)
    print('Resultado: {}'.format(r))

def raizCub(x):
    r = math.cbrt(x)
    print('Resultado: {}'.format(r))

def pot(x):
    e = int(input('Expoente: '))
    r = x ** e
    print('Resultado: {}'.format(r))

def loga(x):
    r = numpy.log(x)
    print('Resultado: {}'.format(r))

def loga10(x):
    r = numpy.log10(x)
    print('Resultado: {}'.format(r))

def loga2(x):
    r = numpy.log10(x)
    print('Resultado: {}'.format(r))

def program():
    try:
        n = int(input('O que deseja fazer hoje?\nDigite 1 para se quiser somar, 2 para subtrair, 3 para multiplicar, 4 para dividir ou 5 para ver possíveis outras operações: '))

        if n == 1:
            qtd = int(input('Quantos números deseja somar? '))
            soma(qtd)
        else:
            if n == 2:
                qtd = int(input('Quantos números deseja subtrair? '))
                sub(qtd)
            else:
                if n == 3:
                    qtd = int(input('Quantos números deseja multiplicar? '))
                    mult(qtd)
                else:
                    if n == 4:
                        qtd = int(input('Quantos números deseja dividir? '))
                        div(qtd)
                    else:
                        if n == 5:
                            other = int(input('Escolha uma opção:\nDigite 1 para raiz quadrada, 2 para raiz cúbica, 3 para potenciação, 4 para logaritmo natural, 5 para logaritmo na base 10 ou 6 para um logaritmo na base 2: '))
                            if other == 1:
                                y = int(input('Digite o número: '))
                                raiz(y)
                            else:
                                if other == 2:
                                    y = int(input('Digite o número: '))
                                    raizCub(y)
                                else:
                                    if other == 3:
                                        y = int(input('Digite o número: '))
                                        pot(y)
                                    else:
                                        if other == 4:
                                            y = int(input('Digite o número: '))
                                            loga(y)
                                        else:
                                            if other == 5:
                                                y = int(input('Digite o número: '))
                                                loga10(y)
                                            else:
                                                if(other == 6):
                                                    y = int(input('Digite o número: '))
                                                    loga2(y)
                                                else:
                                                    print("Entrada inválida, tente novamente!")
                                                    program()
    except:
        print("Entrada inválida, tente novamente!")
        program()

program()