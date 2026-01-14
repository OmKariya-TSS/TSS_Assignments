package com.tss.assignment1;

import java.util.*;

public class SmartCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to smart city utility control system");
        smartCity();
    }
    public static void smartCity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Electricity service");
        System.out.println("enter 2 for Water service");
        System.out.println("enter 3 for Internet Service");
        System.out.println("enter 4 for Exit");
        int number = scanner.nextInt();
        double bill_amount=0;
        double energy_charge=0;
        switch(number){
            case 1:
                System.out.println(" you are under electricity service");
                electric_method();
                break;
            case 2:
                System.out.println(" you are under water service");
                water_method();
                break;
            case 3:
                System.out.println("You are under internet services :");
                internet_method();
                break;
            case 4:
                System.out.println("you are on the exit so program stopped");
                break;
            default:
                System.out.println("enter number between 1 to 4");
                break;
        }
    }
    public static void electric_method(){
        Scanner scanner = new Scanner(System.in);
        double bill_amount=0;
        double energy_charge=0;
        System.out.println("Enter 1 for domestic connection ");
        System.out.println("enter 2 for commercial connection");
        System.out.println("enter 3 for Industrial connection");
        System.out.println("enter 4 for back option");
        int electricity = scanner.nextInt();
        int fixed_charge_domestic = 50;
        int fixed_charge_commercial = 150;
        int fixed_charge_industrial = 500;
        switch(electricity){
            case 1:
                System.out.println("you are under domestic");
                System.out.println("Enter units consumed : ");
                int unites_consumed = scanner.nextInt();
                if(unites_consumed>=0 && unites_consumed<=100){
                    energy_charge =(double) energy_charge + unites_consumed*2;
                }
                else if(unites_consumed>=101 && unites_consumed<=300){
                    energy_charge = (double) energy_charge + unites_consumed*3;
                }
                else if(unites_consumed>=301){
                    energy_charge =(double) energy_charge + unites_consumed*5;
                }
                bill_amount=(double) energy_charge+ fixed_charge_domestic;
                System.out.println("connection type : domestic connection");
                System.out.println("Units consumed : "+ unites_consumed);
                System.out.println("Energy charge : "+energy_charge);
                System.out.println("fixed charge : "+fixed_charge_domestic);
                if(bill_amount>=2000){
                    double surcharge = bill_amount*10/100;
                    bill_amount=bill_amount+ surcharge;
                    System.out.println("surcharge :"+surcharge);
                }
                System.out.println("total bill  "+bill_amount);
                smartCity();
                break;
            case 2:
                System.out.println("you are under commercial");
                System.out.println("Enter units consumed : ");
                unites_consumed = scanner.nextInt();
                if(unites_consumed>=0 && unites_consumed<=200){
                    energy_charge =(double) energy_charge + unites_consumed*5;
                }
                else if(unites_consumed>=201 && unites_consumed<=500){
                    energy_charge = (double) energy_charge + unites_consumed*7;
                }
                else if(unites_consumed>=501){
                    energy_charge = (double) energy_charge + unites_consumed*10;
                }
                bill_amount=(double)  energy_charge+fixed_charge_commercial;
                System.out.println("connection type : commercial connection");
                System.out.println("Units consumed : "+ unites_consumed);
                System.out.println("Energy charge : "+energy_charge);
                System.out.println("fixed charge : "+fixed_charge_commercial);
                System.out.println("total bill  "+bill_amount);
                smartCity();
                break;
            case 3:
                System.out.println("you are under indsutrial");
                System.out.println("Enter units consumed : ");
                unites_consumed = scanner.nextInt();
                energy_charge= (double) energy_charge+ unites_consumed*12;
                bill_amount=(double) energy_charge+fixed_charge_industrial;

                System.out.println("connection type : industrial connection");
                System.out.println("Units consumed : "+ unites_consumed);
                System.out.println("Energy charge : "+energy_charge);
                System.out.println("fixed charge : "+fixed_charge_industrial);
                if(unites_consumed>100){
                    double rebate = bill_amount * 15/100;
                    bill_amount = bill_amount - rebate;
                    System.out.println("rebate "+rebate);
                }
                System.out.println("total bill  "+bill_amount);
                smartCity();
                break;
            case 4:
                System.out.println("you have chosen back so going back ");
                smartCity();
                break;
            default:
                System.out.println("enter number between 1 to 4");
                electric_method();
        }
    }
    public static void water_method(){
        Scanner scanner = new Scanner(System.in);
        double bill_amount=0;
        double energy_charge=0;
        System.out.println("Enter 1 for residential ");
        System.out.println("enter 2 for society ");
        System.out.println("enter 3 for factory ");
        System.out.println("enter 4 for back option");
        int water_service = scanner.nextInt();
        switch(water_service){
            case 1:
                System.out.println("you are under residential ");
                System.out.println("enter number of person : ");
                int number_of_person = scanner.nextInt();
                bill_amount = (double) bill_amount + number_of_person * 30;
                System.out.println("total bill : "+ bill_amount);
                if(bill_amount>3000){
                    double tax = bill_amount*8/100;
                    bill_amount = bill_amount+tax;
                    System.out.println("total bill with tax is : "+bill_amount);
                }
                smartCity();
                break;
            case 2 :
                System.out.println("you are under society");
                System.out.println("enter number of tapes : ");
                int number_of_tapes = scanner.nextInt();
                bill_amount = (double) bill_amount + number_of_tapes * 25;
                System.out.println("total bill: "+ bill_amount);
                if(bill_amount>3000){
                    double tax = bill_amount*8/100;
                    bill_amount = bill_amount+tax;
                    System.out.println("total bill with tax is : "+bill_amount);
                }
                smartCity();
                break;
            case 3:
                System.out.println("you are under factory");
                System.out.println("enter number of machines : ");
                int number_of_machines = scanner.nextInt();
                bill_amount =(double) bill_amount + number_of_machines * 100;
                System.out.println("total bill : "+ bill_amount);
                if(bill_amount>3000){
                    double tax = bill_amount*8/100;
                    bill_amount = bill_amount+tax;
                    System.out.println("total bill with tax is : "+bill_amount);
                }
                smartCity();
                break;
            case 4:
                smartCity();
                break;
            default:
                System.out.println("enter between 1 to  4 only");
                water_method();
        }
    }
    public static void internet_method(){
        Scanner scanner = new Scanner(System.in);
        double bill_amount=0;
        double energy_charge=0;
        System.out.println("Enter 1 for student plan ");
        System.out.println("enter 2 for home plan ");
        System.out.println("enter 3 for business plan ");
        System.out.println("enter 4 for back option");
        int internet = scanner.nextInt();
        int duration ;
        switch(internet){
            case 1:
                System.out.println("you are under student plan");
                System.out.println("Enter duration : ");
                duration = scanner.nextInt();
                switch(duration){
                    case 1:
                        bill_amount = 299;
                        System.out.println("bill is "+bill_amount);
                        smartCity();
                        break;
                    case 3:
                        bill_amount = 799;
                        System.out.println("bill is "+bill_amount);
                        smartCity();
                        break;
                    case 6:
                        bill_amount = 1499;
                        System.out.println("bill without discount is "+bill_amount);
                        double discount = bill_amount * 5/100;
                        bill_amount = bill_amount - discount;
                        System.out.println("bill with discount is "+bill_amount);
                        smartCity();
                        break;
                    default:
                        System.out.println("duration should be 1 3 or 6 months");
                        internet_method();
                }
                break;
            case 2:
                System.out.println("you are under home plan");
                System.out.println("Enter duration : ");
                duration = scanner.nextInt();
                switch(duration){
                    case 1:
                        bill_amount = 499;
                        System.out.println("bill is "+bill_amount);
                        smartCity();
                        break;
                    case 3:
                        bill_amount = 1399;
                        System.out.println("bill is "+bill_amount);
                        smartCity();
                        break;
                    case 6:
                        bill_amount = 2699;
                        System.out.println("bill without discount is "+bill_amount);
                        double discount = bill_amount * 5/100;
                        bill_amount = bill_amount - discount;
                        System.out.println("bill with discount is "+bill_amount);
                        smartCity();
                        break;
                    default:
                        System.out.println("duration should be 1 3 or 6 months");
                        internet_method();
                }
                break;
            case 3:
                System.out.println("you are under student plan");
                System.out.println("Enter duration : ");
                duration = scanner.nextInt();
                switch(duration){
                    case 1:
                        bill_amount = 999;
                        System.out.println("bill is "+bill_amount);
                        smartCity();
                        break;
                    case 3:
                        bill_amount = 2799;
                        System.out.println("bill is "+bill_amount);
                        smartCity();
                        break;
                    case 6:
                        bill_amount = 5499;
                        System.out.println("bill without discount is "+bill_amount);
                        double discount = bill_amount * 5/100;
                        bill_amount = bill_amount - discount;
                        System.out.println("bill with discount is "+bill_amount);
                        smartCity();
                        break;
                    default:
                        System.out.println("duration should be 1 3 or 6 months");
                        internet_method();
                }
                break;
            case 4:
                System.out.println("returning back to main menu");
                smartCity();
                break;
            default:
                System.out.println("enter number between 1 to 4 only");
                internet_method();
        }
    }
}

