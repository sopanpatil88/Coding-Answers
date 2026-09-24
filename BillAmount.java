import java.util.Scanner;
class BillAmount{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------Welcome to our Restaurant!--------------");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println();

        System.out.println("You have to eat Veg or Non-Veg : ");
        int x = sc.nextInt();

        int totalAmount = 0;

        switch(x){
            case 1:
                {
                    System.out.println("Here is the menu of vegeterian items : ");
                    System.out.println("        1. Palak Paneer ( RS. 180/- )");
                    System.out.println("        2. Baingan Masala ( RS. 150/- )");
                    System.out.println("        3. Dal Khichadi ( RS. 100/- )");
                    System.out.println("        4. Veg Manchurian ( RS. 80/- )");
                    System.out.println("        5. Malai Kofta ( RS. 120/- )");
                    System.out.println("        6. Dal tadka ( RS. 120/- )");

                    System.out.println();

                    System.out.println("Tell me which dish you want : ");
                    int dishNumber = sc.nextInt();
                    
                    switch(dishNumber){
                        case 1:
                        {
                            totalAmount += 180;
                            break;
                        }

                        case 2:
                        {
                            totalAmount += 150;
                            break;
                        }

                        case 3:
                        {
                            totalAmount += 100;
                            break;
                        }

                        case 4:
                        {
                            totalAmount += 80;
                            break;
                        }

                        case 5 :
                        {
                            totalAmount += 120;
                            break;
                        }

                        case 6:
                        {
                            totalAmount += 120;
                            break;
                        }
                        default:
                        {
                            System.out.println("Sorry! Dish is not available");
                            break;
                        }
                    }

                    System.out.println("Do you want Roti : ");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    System.out.println("select 1 or 2 : ");
                    int choosing = sc.nextInt();

                    switch(choosing){
                        case 1:
                        {
                            System.out.println("Roti ( RS. 15/- )");
                            System.out.println("tell me how many roti you want : ");
                            int numberOfRoti = sc.nextInt();

                            totalAmount += (numberOfRoti * 15);
                            break;

                        }
                        case 2:
                        {
                            System.out.println("Sorry! You Don't Want Roti");
                            break;
                        }
                    }

                    System.out.println("Your total payable bill amount is : " + totalAmount);
                    break;
                }

            case 2:
            {
                System.out.println("Here is the menu of Non-Vegeterian items : ");
                System.out.println("        1. Chicken handi ( RS. 200/- )");
                System.out.println("        2. Chicken lolipops ( RS. 120/- )");
                System.out.println("        3. Chicken biryani ( RS. 140/- )");
                System.out.println("        4. Mutton keema ( RS. 250/- )");
                System.out.println("        5. Chicken chilly ( RS. 180/- )");
                System.out.println("        6. Chicken manchurian ( RS. 220/- )");
                System.out.println("        7. Fish-Koliwada fry ( RS. 399/- )");
                System.out.println("        8. Chilly fry fish ( RS. 299/- )");
                System.out.println("        9. Fish fingers ( RS. 329/- )");
                System.out.println("        10. Masala fry fish ( RS. 379/- )");


                System.out.println("Tell me which dish you want : ");
                int nonVegDishNumber = sc.nextInt();

                switch(nonVegDishNumber){
                    case 1:
                    {
                        totalAmount += 200;
                        break;
                    }

                    case 2:
                    {
                        totalAmount += 120;
                        break;
                    }

                    case 3:
                    {
                        totalAmount += 140;
                        break;
                    }

                    case 4:
                    {
                        totalAmount += 250;
                        break;
                    }

                    case 5:
                    {
                        totalAmount += 180;
                        break;
                    }

                    case 6:
                    {
                        totalAmount += 220;
                        break;
                    }

                    case 7:
                    {
                        totalAmount += 399;
                        break;
                    }

                    case 8:
                    {
                        totalAmount += 299;
                        break;
                    }

                    case 9:
                    {
                        totalAmount += 329;
                        break;
                    }

                    case 10:
                    {
                        totalAmount += 379;
                        break;
                    }

                    default:
                    {
                        System.out.println("Sorry! Dish is not available");
                    }
                }

                System.out.println("Tell me what you want : ");
                System.out.println("        1. Roti ( RS. 15/- )");
                System.out.println("        2. Naan ( RS. 30/- )");
                System.out.println("        3. Butter Naan ( RS. 40/- )");

                System.out.println("What you want : ");
                int nonVegRotiChoosing = sc.nextInt();

                switch(nonVegRotiChoosing){
                    case 1:
                    {
                        System.out.println("Tell me how many roti you want : ");
                        int rotiNum = sc.nextInt();

                        totalAmount += (rotiNum * 15);
                        break;
                    }

                    case 2:
                    {
                        System.out.println("Tell me how many naan you want : ");
                        int naanNum = sc.nextInt();

                        totalAmount += (naanNum * 30);
                        break;
                    }

                    case 3:
                    {
                        System.out.println("Tell me how many butter naan you want : ");
                        int butterNaanNum = sc.nextInt();

                        totalAmount += (butterNaanNum * 40);
                        break;
                    }

                    default:
                    {
                        System.out.println("Sorry! item is not available");
                    }
                }

                System.out.println("You want beverages : ");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.println("select 1 or 2 : ");
                int beveragesChoosing = sc.nextInt();

                switch(beveragesChoosing){
                    case 1:
                    {
                        System.out.println("Here are the list of beverages, tell me which one you want");
                        System.out.println("        1. Thums Up ( RS. 70/- )");
                        System.out.println("        2. Soda ( RS. 90/- )");
                        System.out.println("        3. Beer ( RS. 200/- )");
                        System.out.println("        4. Red wine( RS. 300/- )");
                        System.out.println("        5. coca-cola ( RS. 70/- )");

                        System.out.println("select any from above : ");
                        int beverageSelecting = sc.nextInt();

                        switch(beverageSelecting){
                            case 1:
                            {
                                totalAmount += 70;
                                break;
                            }

                            case 2:
                            {
                                totalAmount += 90;
                                break;
                            }

                            case 3:
                            {
                                totalAmount += 200;
                                break;
                            }

                            case 4:
                            {
                                totalAmount += 300;
                                break;
                            }

                            case 5:
                            {
                                totalAmount += 70;
                                break;
                            }

                            default:
                            {
                                System.out.println("Sorry! beverage is not available");
                            }

                        }
                        break;
                    }

                    case 2:
                    {
                        System.out.println("Thank You, I think you don't need beverage");
                    }
                    break;
                }

                System.out.println("Your total payable bill amount is : " + totalAmount);
            }
        }
    }
}

