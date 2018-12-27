#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void main() {
    int n,i=0,res,op;
    bool alt = true;
    while (alt == true) {
        printf("Deseja ver uma tabuada? Sim [1]/Nao [2]\n");
        scanf("%i",&op);
        if (op == 2) {
            alt = false;
            continue;
        } else {
                i = 0;
                printf("Qual tabuada voce deseja ver?\n");
                scanf("%i",&n);
                for (i==0;i<=10;i++) {
                res = n*i;
                printf("%i x %i = %i\n",n,i,res);
            }
        }
    }
}
