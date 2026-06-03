import java.util.Scanner;
import java.util.ArrayList;
public class CheckOut {

    public static Scanner inputCollector = new Scanner(System.in);

    public static ArrayList<String> product = new ArrayList<String>();

    public static ArrayList<Integer> quantity = new ArrayList<>();

    public static ArrayList<Double> priceList = new ArrayList<>();

   public static ArrayList<Double> totalList = new ArrayList<>();

   public static int piece = 0;
   public static double price = 0;
   public static double discountNumber = 0;  
   public static double amountPaid = 0;  
    


        public static void getUserList() {
            System.out.println("What did the user buy? ");
             String item = inputCollector.nextLine();
    
                product.add(item);
        } 

            public static void getPiecesList() {
               System.out.println("How many pieces? ");
                   piece = inputCollector.nextInt();

                    quantity.add(piece);
            }

                public static void getPricesList() {
                    System.out.println("How much per unit? ");
                         price = inputCollector.nextInt();

                             priceList.add(price);
                }

                public static void getTotal() {
                    double total = piece * price;
                    totalList.add(total);
                }

                                    public static double getSubTotal() {
                                      double subTotal = 0;
                                        for (int count = 0; count < totalList.size(); count++) {
                                            subTotal += totalList.get(count);
                                        }
                                                return subTotal;
                                        
                                    }


        public static void askDiscount() {
            System.out.println("How much discount will he/she get? ");
             discountNumber = inputCollector.nextInt();
   
        } 


            public static double getDiscount() {
                return getSubTotal() * (discountNumber / 100);
                
            }


            public static double getVat() {
                return getSubTotal() * (17.50 / 100);
                
            }

                        public static double getBillTotal() {
                            return (getSubTotal() + getVat()) - getDiscount();
                        }

                        public static void getAmountPaid() {
                            System.out.println("How much did the customer give to you? ");
                                amountPaid = inputCollector.nextInt();
                        }

                            public static double getBalance() {
                                return amountPaid - getBillTotal();
                            }


        public static void main(String[] args) {
            System.out.println("What is the customer's Name ");
                String userName =inputCollector.nextLine();

        while (true) {
            getUserList();
            getPiecesList();
            getPricesList();
            getTotal();
            inputCollector.nextLine();

              boolean isTrue = false;
            System.out.println("Add more items? ");
                String option =inputCollector.nextLine();

              if (option.toUpperCase().equals("NO")) {
                      break;
               }
                  
                  else if (!option.toUpperCase().equals("YES")) {
                      while (true) {
                          System.out.println("Add more items? YES / NO ");
                             option =inputCollector.nextLine();      

                             if (option.toUpperCase().equals("NO")) {
                                   isTrue = true;
                                  break;
                                  }   
                             else if (option.toUpperCase().equals("YES")) {
                                    break;
                              }

                     }
                   
             if (isTrue) {
                break;
             }    
                } 
                


        }

            System.out.println("What is your name? ");
                String cashierName = inputCollector.nextLine();

            askDiscount();
           


                    System.out.printf("""





  SEMICOLON STORES

  MAIN BRANCH

  LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

  TEL: 03293828343

  Date : 18-Dec-22  8:48:11 pm

  Cashier: %s

  Customer's Name: %s

  ===================================================================

                  ITEM        QTY          PRICE          TOTAL(NGN)
  -------------------------------------------------------------------

                        """ , cashierName , userName);

            for (int count = 0; count < product.size(); count++) {
                    System.out.printf("%20s%10d%17.2f%16.2f%n" , product.get(count) , quantity.get(count) , priceList.get(count) , totalList.get(count));
            }

            System.out.printf("""

  -------------------------------------------------------------------

%48s%15.2f
%48s%15.2f
%48s%15.2f
  ===================================================================
%48s%15.2f
  ===================================================================
   THIS IS NOT AN RECEIPT KINDLY PAY %.2f
  ===================================================================



   """ , "Sub Total:" , getSubTotal() , "Discount:" , getDiscount() , "VAT @ 17.50%:" , getVat() , "Bill Total:" , getBillTotal() , getBillTotal());

       

    getAmountPaid();

    if (amountPaid > 0) {
                    System.out.printf("""







  SEMICOLON STORES

  MAIN BRANCH

  LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.

  TEL: 03293828343

  Date : 18-Dec-22  8:48:11 pm

  Cashier: %s

  Customer's Name: %s

  ===================================================================

                  ITEM        QTY          PRICE          TOTAL(NGN)
  -------------------------------------------------------------------

                        """ , cashierName , userName);

            for (int count = 0; count < product.size(); count++) {
                    System.out.printf("%20s%10d%17.2f%16.2f%n" , product.get(count) , quantity.get(count) , priceList.get(count) , totalList.get(count));
            }

            System.out.printf("""

  -------------------------------------------------------------------

%48s%15.2f
%48s%15.2f
%48s%15.2f
  ===================================================================
%48s%15.2f
%48s%15.2f
%48s%15.2f
  ===================================================================
   THANK YOU FOR YOUR PATRONAGE
  ===================================================================



   """ , "Sub Total:" , getSubTotal() , "Discount:" , getDiscount() , "VAT @ 17.50%:" , getVat() , "Bill Total:" , getBillTotal() , "Amount Paid:" , amountPaid , "Balance:" , getBalance());

    }

    }      

}
















