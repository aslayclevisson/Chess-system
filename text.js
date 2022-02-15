Var 
Matriz [3][2]: INTEIRO <- {{5, -3},{1, - 3},{3, 10}}; 
Sln [3]: INTEIRO <- {0, 0, 0};
x, i, j: INTEIRO; x <- 0;

Inicio
PARA i <- 1 ATÉ 3 FAÇA 
    PARA j <- 1 ATÉ 2 FAÇA 
        Sln[i] <- Sln[i] + Matriz[i][j]; 
    FIMPARA
    x <- x + Sln[i]; 
fimpara 
escreva(x); 
Fim