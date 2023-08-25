package com.careerit.jsf.day5;
/*
01
02
03
10
12
13
20
21
23
30
31
32


if m = 3 and n = 3
*/
public class PatternExample2 {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i != j){
                    System.out.println(i+""+j+" ");
                }
            }
        }
    }
}
