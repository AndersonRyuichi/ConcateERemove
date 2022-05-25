# ConcateERemove
Considere uma string contendo caracteres minúsculos do alfabeto português. Você pode executar dois tipos de operações nesta string:
1. Concatenar um caractere minúsculo do alfabeto português ao final da string.
2. Remover o último caractere da string. Se a string estiver vazia, ela permanecerá vazia.

Dado um número inteiro k e duas strings s e t, determine se você consegue converter s em t através de exatamente k operações descritas acima sobre s. Se possível, o programa imprime 'sim', do contrário imprime 'não'.

Por exemplo, string s = [a, b, c] e string t = [d, e, f]. O número de movimentos k = 6. Para converter s em t, primeiro removemos todos os caracteres usando 3 movimentos. Em seguida concatenamos cada um dos caracteres de t na ordem. No sexto movimento, você terá a string s esperada. Se houver mais movimentos disponíveis que o necessário, eles podem ser eliminados executando múltiplas remoções em uma string vazia. Se houver movimentos a menos, não seria possível criar a nova string.

Desenvolva um programa que implementa e utiliza a função ConcatERemove(s,t,k). Ela deve retornar os resultados 'sim' ou 'não'.
A função tem os seguintes parâmetros:
s: string inicial
t: string desejada
k: um número inteiro que representa o número de operações

Formato de entrada
A primeira linha contêm a string s, a string inicial.
A segunda linha contém a string t, a string desejada.
A terceira linha contém um inteiro k, o número de operações.

Limitações
a) 1 <= |s| <= 100
b) 1 <= |t| <= 100
c) 1 <= k <= 100
d) s e t consiste de letras minúsculas do alfabeto português, ascii[a-z]

Formato de saída
Imprima 'sim' se você puder obter a string t executando exatamente k operações sobre a string s, e imprime 'não' no caso contrário.

Exemplo 1
blablablabla
blablabcde
8

sim

Explicação
Foram necessários 5 operações para reduzir a string s para "blablab". Em seguida, foram necessários 3 operações de concatenação (c,d,e), para obter a string t "blablabcde". Como foi possível converter s em t utilizando exatamente k=8 operações, o programa imprimiu "sim".

Exemplo 2
aba
aba
7

sim

Explicação
Foram necessários 4 operações de redução da string s (relembre que uma operação de remoção sobre uma string vazia, mantém a string vazia). Em seguida foram executadas 3 operações de concatenação (a,b,a). Como foi possível converter s em t utilizando exatamente k=7 operações, o programa imprimiu "sim".

Exemplo 3
ashley
ash
2

não
