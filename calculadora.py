import math
import numpy

def soma(x, y):
    somaDosValores = x + y
    print('{} + {} = {}'.format(x, y, somaDosValores))

def subtração(a, b):
    subtracaoDosValores = a - b
    print('{} - {} = {}'.format(a, b, subtracaoDosValores))

def multiplicação(c, d):
    multiplicacaodosValores = c * d
    print('{} x {} = {}'.format(c, d, multiplicacaodosValores))

def divisão(z, w):
    divisaoDosValores = z / w
    print('{} : {} = {}'.format(z, w, divisaoDosValores))

def raiz(e):
    raizDoValor = math.sqrt(e)
    print('Raiz quadrada de {} = {}'.format(e, raizDoValor))

def potencia(f):
    potenciaDoValor = f **2
    print('Potência de {} = {}'.format(f, potenciaDoValor))

def loga(g):
    logaDoValor = numpy.log(g)
    print('Logaritmo natural de {} = {}'.format(g, logaDoValor))

def loga10(h):
    loga10DoValor = numpy.log10(h)
    print('Logaritmo de {} na base 10 = {}'.format(h, loga10DoValor))

def loga2(i):
    loga2DoValor = numpy.log10(i)
    print('Logaritmo de {} na base 2 = {}'.format(i, loga2DoValor))

usuario = input('O que vai fazer hoje? Somar, subtrair, multiplicar ou dividir? (caso não for nenhuma das opções anteriores, digite \"outros\") ')

if usuario == 'somar':
    num1 = float(input('Número: '))
    num2 = float(input('Número: '))
    soma(num1, num2)
else:
    if usuario == 'subtrair':
        num3 = float(input('Número: '))
        num4 = float(input('Número: '))
        subtração(num3, num4)
    else:
        if usuario == 'multiplicar':
            num5 = float(input('Número: '))
            num6 = float(input('Número: '))
            multiplicação(num5, num6)
        else:
            if usuario == 'dividir':
                num7 = float(input('Número: '))
                num8 = float(input('Número: '))
                divisão(num7, num8)
            else:
                outraOpcao = input('Escolha uma opção: raiz quadrada, potenciação, logaritmo natural, logaritmo na base 10 ou logaritmo na base 2: ')
                if outraOpcao == 'raiz quadrada':
                    num9 = float(input('Número: '))
                    raiz(num9)
                else:
                    if outraOpcao == 'potenciação':
                        num10 = float(input('Número: '))
                        potencia(num10)
                    else:
                        if outraOpcao == 'logaritmo natural':
                            num11 = float(input('Número: '))
                            loga(num11)
                        else:
                            if outraOpcao == 'logaritmo na base 10':
                                num12 = float(input('Número: '))
                                loga10(num12)
                            else:
                                num13 = float(input('Número: '))
                                loga2(num13)
