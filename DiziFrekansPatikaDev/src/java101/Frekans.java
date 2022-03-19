package java101;

import java.util.Scanner;

public class Frekans {
    public static void main(String[] args) {

        int sayac=0;

        int[]dizi={ 10, 20, 20, 10, 10, 20, 5, 20};

        Scanner klavye = new Scanner(System.in);
        System.out.println("Tekrar ediliyor mu diye merak ettiğiniz sayıyı yazın:");
        int ara=klavye.nextInt();

        for(int i=0;i<dizi.length;i++){
            if(ara==dizi[i]){

                sayac=sayac+1;
            }


        }
        System.out.println("Tekrar eden sayı  : "   + ara);
        System.out.println("Dizide Tekrar Edilme Sayısı : " + sayac);
    }





}



