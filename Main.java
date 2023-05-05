package org.example;

public class Main {
    public static void main(String[] args) {

        //using Anno
            Inter i=new Inter() {
                @Override
                public void inti() {
                    System.out.println("Hello Subin This is Annoni...class");
                }
            };
            i.inti();

            //Lam-Exp
            InterSum s=(a,b)->a+b;
        System.out.println(s.Sum(2,2));

        IntString st=(str)->str.length();
        System.out.println(st.leng("Subin"));


        }
    }