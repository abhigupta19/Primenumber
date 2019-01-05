//
// Created by user on 04-01-2019.
//

#include "primenumber.h"
primenumber::primenumber(int a) {
    primenumber::ab=a;
}
bool primenumber::isprime() {
    bool isprime= true;
    for (int i=2;i <=ab/2;i++)
    {
        if(ab%i==0)
        {
            return false;
        } else
        {
            isprime =true;
        }
    }
    return isprime;
}
