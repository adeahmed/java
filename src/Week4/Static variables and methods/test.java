// package Week4;

// public class test {
//     private String name;
//     private int age;

// // medoton nimeäminen ja getteri ja setterin luominen!!
//     public test(String name, int age){
//         this.age = age;
//         this.name = name;
//     }


//     public int getAge(){
//         return age;
//     }

//     public void setAge(int age){
//         this.age = age;
//     }


// }

 public class test {
     int omaLuku = 5;
     public int lisaaLuku(int luku, int luku2){
        return luku + luku2;
     }
     pubic static void main(String[] args){
         test oma = new test();
         int luku = 5;
         int luku2 = 10;
         int omaLuku = lisaaLuku(luku, luku2);
         System.out.println(omaLuku);
     }
    
 }
