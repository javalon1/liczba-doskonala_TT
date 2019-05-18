package com.sda.algorytmy;


public class App 
{
    public static void main( String[] args )
    {
        int liczba=6;
        int sumaDzielnikow = 1;

        for (int i = 2; i<=liczba/2; i++){
            if (liczba%i==0){
                sumaDzielnikow=sumaDzielnikow+i;
            }

        }
        System.out.println(liczba==sumaDzielnikow);
    }


}
